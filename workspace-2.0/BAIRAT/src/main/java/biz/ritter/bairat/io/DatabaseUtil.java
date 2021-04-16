/**
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */
package biz.ritter.bairat.io;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import biz.ritter.bairat.BurnDown;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class DatabaseUtil {

  static boolean first = true;
  static int id = 0;
  
  private Connection con;
  
  public DatabaseUtil () throws IOException {
    try {
      BurnDown.add(this.con = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "".intern(), "".intern()));
    }
    catch (SQLException rethrow) {
      throw new UncheckedIOException(new IOException(rethrow));
    }
  }
  
  public String test (String text) {
    try (var stmt = this.con.createStatement();) {
      this.con.setAutoCommit(false);
      if (first) first = stmt.execute("CREATE TABLE scanResult (scanKey INT PRIMARY KEY, scanValue VARCHAR("+Integer.MAX_VALUE+"))");
      stmt.execute("INSERT INTO SCANRESULT(scanKey, scanValue) VALUES("+ ++id +", '"+text+"')");

      var rs = stmt.executeQuery("select * from scanResult");
      rs.next();

      this.con.commit();
      return rs.getString("scanValue");
    } catch (SQLException rethrow) {
      throw new UncheckedIOException(new IOException(rethrow));
    }
  }
}
