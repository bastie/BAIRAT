/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat.rpa.simple;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import lombok.Getter;
import lombok.NonNull;
import net.sourceforge.tess4j.Tesseract;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class Roboter {

  @Getter
  private Robot instance;
  
  public Roboter () {
    try {
      this.instance = new Robot();
    }
    catch (AWTException rethrow) {
      throw new RuntimeException(rethrow);
    }
  }
  
  public String getTextFromFullScreen () throws Throwable {
    BufferedImage fullScreen = instance.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
    fullScreen = this.getFullScreenshot();
    
    
    Tesseract ocrEngine = new Tesseract();
    ocrEngine.setLanguage("deu");
    ocrEngine.setDatapath("/usr/local/Cellar/tesseract-lang/4.1.0/share/tessdata/");
    ocrEngine.setTessVariable("user_defined_dpi", "227");

    String result = ocrEngine.doOCR(fullScreen);
    return result;
  }
  
  /**
   * Short version of screenshot method with all optional size parameters. No parameters 
   * creates a screenshot from full screen.
   * 
   * @param x_y_width_height
   * @return
   */
  public BufferedImage getScreenshot (int ... x_y_width_height) {
    int i = 0;
    final var x = x_y_width_height.length>0 ? x_y_width_height[i++] : 0;
    final var y = x_y_width_height.length>1 ? x_y_width_height[i++] : 0;
    final var width = x_y_width_height.length>2 ? x_y_width_height[i++] : Toolkit.getDefaultToolkit().getScreenSize().width-x;
    final var height = x_y_width_height.length>3 ? x_y_width_height[i++] : Toolkit.getDefaultToolkit().getScreenSize().height-y;
    
    Rectangle objectWrapper = new Rectangle(x,y,width,height);
    return this.getScreenshot(objectWrapper);
  }
  
  public BufferedImage getScreenshot (@NonNull Rectangle rect) {
    return this.instance.createScreenCapture(rect);
  }
  
  public BufferedImage getFullScreenshot () {
    return this.getScreenshot();
  }
}
