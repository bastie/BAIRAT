/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat.rpa.simple;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import net.sourceforge.tess4j.Tesseract;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class Roboter {

  public void test () throws Throwable {
    Robot instance = new Robot();
    BufferedImage fullScreen = instance.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    
    
    
    Tesseract ocrEngine = new Tesseract();
    ocrEngine.setLanguage("deu");
    ocrEngine.setDatapath("/usr/local/Cellar/tesseract-lang/4.1.0/share/tessdata/");

    String result = ocrEngine.doOCR(fullScreen);
    
    System.out.printf("%s%n",result);
    
    
  }
}
