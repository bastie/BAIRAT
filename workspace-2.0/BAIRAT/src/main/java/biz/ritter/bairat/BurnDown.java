/**
 * 
 */
package biz.ritter.bairat;

import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class BurnDown implements Runnable{

  public static BurnDown instance = new BurnDown();
  private ArrayList<AutoCloseable> ready_or_not_here_i_am_you_cant_hide = new ArrayList<>();
  
  private boolean nothingCamesAfterMe = false;
  
  public static void add (AutoCloseable ... c) {
    if (!instance.nothingCamesAfterMe && c.length>0) Runtime.getRuntime().addShutdownHook(new Thread (instance)); 
    instance.ready_or_not_here_i_am_you_cant_hide.addAll (Arrays.asList(c));
  }
  
  @Override
  public void run() {
    for (AutoCloseable open : this.ready_or_not_here_i_am_you_cant_hide) {
      try { open.close(); } catch (Throwable ignored) {}
    }
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "The sun go down...");
  }
}
