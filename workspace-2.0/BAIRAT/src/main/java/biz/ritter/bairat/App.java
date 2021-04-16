/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat;
import lombok.*;
import static java.lang.System.Logger.Level;

import java.util.Base64;

import biz.ritter.bairat.io.DatabaseUtil;
import biz.ritter.bairat.io.OcrUtil;
import biz.ritter.bairat.pojo.Scan;
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
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Angela Bennett starts the system");
    
    System.setProperty("jna.library.path","/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib");
    
    
    try {
      Scan scanResult = new Scan();
      
      Roboter worker = new Roboter();
      scanResult.setImage(worker.getFullScreenshot());
      scanResult.setOcrResult(OcrUtil.getTextFromFullScreen(scanResult.getImage()));
      
      DatabaseUtil holder = new DatabaseUtil ();
      scanResult.setOcrResult(holder.test(Base64.getEncoder().encodeToString(scanResult.getOcrResult().getBytes())));
      System.out.printf("OCR: %s%n",new String(Base64.getDecoder().decode(scanResult.getOcrResult().getBytes())));
    }
    catch (Throwable bug_is_in_the_air) {
      System.getLogger(App.class.getPackageName()).log(Level.ERROR, "I'm sorry Dave i'm afraid i can't do that.");
      bug_is_in_the_air.printStackTrace(System.err);
    }
    System.getLogger(App.class.getPackageName()).log(Level.INFO, "Neo took the red pill");
  }

}
