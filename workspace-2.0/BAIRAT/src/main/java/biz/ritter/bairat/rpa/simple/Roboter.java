/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

package biz.ritter.bairat.rpa.simple;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import lombok.NonNull;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class Roboter {

  private Robot instance;
  
  public Roboter () {
    try {
      this.instance = new Robot();
    }
    catch (AWTException rethrow) {
      throw new RuntimeException(rethrow);
    }
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
  
  /**
   * Long version of screenshot method.
   * 
   * @param rect region of screenshot
   * @return
   */
  public BufferedImage getScreenshot (@NonNull Rectangle rect) {
    return this.instance.createScreenCapture(rect);
  }
  
  /**
   * Short version of full screen screenshot.
   * 
   * @return
   */
  public BufferedImage getFullScreenshot () {
    return this.getScreenshot();
  }
}
