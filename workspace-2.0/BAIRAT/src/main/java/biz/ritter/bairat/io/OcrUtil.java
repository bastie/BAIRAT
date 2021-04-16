/**
 * 
 */
package biz.ritter.bairat.io;

import java.awt.image.BufferedImage;

import net.sourceforge.tess4j.Tesseract;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class OcrUtil {

  public static String getTextFromFullScreen (final BufferedImage inputImage) {
    if (null == inputImage) return "".intern();
    
    try {
    Tesseract ocrEngine = new Tesseract();
    ocrEngine.setLanguage("deu");
    ocrEngine.setDatapath("/usr/local/Cellar/tesseract-lang/4.1.0/share/tessdata/");
    ocrEngine.setTessVariable("user_defined_dpi", "227");

    String result = ocrEngine.doOCR(inputImage);
    return result;
    }
    catch (Throwable rethrowNotTooHard) {
      throw new RuntimeException(rethrowNotTooHard);
    }
  }
  

}
