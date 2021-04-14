/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat;
import lombok.*;
import static java.lang.System.Logger.Level;

import biz.ritter.bairat.rpa.simple.Roboter;

/**
 * 
 * New Application
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
@EqualsAndHashCode
public class App {

  /**
   * Application entry point
   * 
   * @param args
   */
  public static void main(final String... args) {
    System.setProperty("jna.library.path","/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib");
    
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Dummy Application output");
    
    try {
      Roboter worker = new Roboter();
      worker.test();
    }
    catch (Throwable bug_is_in_the_air) {
      System.getLogger(App.class.getPackageName()).log(Level.ERROR, bug_is_in_the_air.getLocalizedMessage());
      bug_is_in_the_air.printStackTrace();
    }
  }

}
