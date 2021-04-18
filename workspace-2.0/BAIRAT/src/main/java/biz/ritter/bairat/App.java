/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat;
import lombok.*;
import static java.lang.System.Logger.Level;

import biz.ritter.bairat.workflow.OcrTask;

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
    try {
      OcrTask task = new OcrTask();
      task.run();
    }
    catch (Throwable bug_is_in_the_air) {
      System.getLogger(App.class.getPackageName()).log(Level.ERROR, "I'm sorry Dave i'm afraid i can't do that.");
      bug_is_in_the_air.printStackTrace(System.err);
    }
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Neo took the red pill");
  }

}
