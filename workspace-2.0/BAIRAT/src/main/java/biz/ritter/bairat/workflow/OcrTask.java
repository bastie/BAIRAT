/**
 * 
 */
package biz.ritter.bairat.workflow;

import java.util.Base64;
import java.util.concurrent.Callable;

import biz.ritter.bairat.io.DatabaseUtil;
import biz.ritter.bairat.io.OcrUtil;
import biz.ritter.bairat.pojo.Scan;
import biz.ritter.bairat.rpa.simple.Roboter;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class OcrTask implements Callable<Void>, Runnable {

  static {
    System.setProperty("jna.library.path","/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib");
  }
  
  
  @Override
  public Void call() throws Exception {
    Scan scanResult = new Scan();
    
    Roboter worker = new Roboter();
    scanResult.setImage(worker.getFullScreenshot());
    scanResult.setOcrResult(Base64.getEncoder().encodeToString(OcrUtil.getTextFromFullScreen(scanResult.getImage()).getBytes()));
    
    DatabaseUtil holder = new DatabaseUtil ();
    scanResult = holder.test(scanResult);
    System.out.printf("OCR: %s%n",new String(Base64.getDecoder().decode(scanResult.getOcrResult().getBytes())));

    return null;
  }


  @Override
  public void run() {
    try {
      this.call();
    } catch (Exception rethrow) {
      throw new RuntimeException(rethrow);
    }
  }

}
