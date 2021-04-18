/**
 * 
 */
package biz.ritter.bairat.pojo;

import java.awt.image.BufferedImage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
@EqualsAndHashCode
@Entity
@Table(name = "scanResult")
public class Scan {
  
  @Getter @Setter @Exclude
  @Id
  private int dbmsId;

  @Getter @Setter @Exclude @Transient
  private BufferedImage image;
  @Getter @Setter @Column(columnDefinition = "CLOB")
  private String ocrResult;
}
