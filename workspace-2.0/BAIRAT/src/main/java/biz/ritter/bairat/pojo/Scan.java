/**
 * 
 */
package biz.ritter.bairat.pojo;

import java.awt.image.BufferedImage;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
@EqualsAndHashCode
public class Scan {

  @Getter @Setter @Exclude
  private BufferedImage image;
  @Getter @Setter
  private String ocrResult;
}
