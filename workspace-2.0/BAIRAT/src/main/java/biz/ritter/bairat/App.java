/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat;
import lombok.*;
import static java.lang.System.Logger.Level;

import biz.ritter.bairat.rpa.simple.Roboter;
import biz.ritter.bairat.rpa.storage.Depot;

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
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Angela Bennett starts the system");
    
    System.setProperty("jna.library.path","/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib");
    
    
    try {
      var result = "";
      
      Roboter worker = new Roboter();
      result = worker.getTextFromFullScreen();
      
      Depot holder = new Depot ();
      result = holder.test(result);
      System.out.printf("OCR: %s%n",result.substring(0,result.length() > 200 ? 200 : result.length()));
    }
    catch (Throwable bug_is_in_the_air) {
      System.getLogger(App.class.getPackageName()).log(Level.ERROR, "I'm sorry Dave i'm afraid i can't do that.");
      bug_is_in_the_air.printStackTrace(System.err);
    }
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Neo took the red pill");
  }

}
