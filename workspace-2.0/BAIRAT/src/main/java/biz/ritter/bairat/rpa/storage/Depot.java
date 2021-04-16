/**
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */
package biz.ritter.bairat.rpa.storage;

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
public class Depot {

  static boolean first = true;
  static int id = 0;
  
  private Connection con;
  
  public Depot () throws IOException {
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
      if (first) first = stmt.execute("CREATE TABLE PERSON (id int primary key, wert varchar("+Integer.MAX_VALUE+"))");
      stmt.execute("INSERT INTO PERSON(id, wert) VALUES("+ ++id +", '"+text.substring(0,text.length()-1)+"')");

      var rs = stmt.executeQuery("select * from PERSON");
      rs.next();

      this.con.commit();
      return rs.getString("wert");
    } catch (SQLException rethrow) {
      throw new UncheckedIOException(new IOException(rethrow));
    }
  }
}
