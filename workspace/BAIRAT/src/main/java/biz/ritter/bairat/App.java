/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat;
import lombok.*;
import static java.lang.System.Logger.Level;

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
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Dummy Application output");
  }

}
