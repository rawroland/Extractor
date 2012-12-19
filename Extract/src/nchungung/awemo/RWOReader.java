/**
 * 
 */
package nchungung.awemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Roland
 *
 */
public class RWOReader {

  public BufferedReader reader;
  private String separator;

  /**
   * 
   */
  public RWOReader() {
    separator = System.getProperty("line.separator");
    try {
      this.reader = new BufferedReader(new FileReader("SMALL.rwo"));
      System.out.println("RWO loaded");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getLocalizedMessage());
      e.printStackTrace();
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    RWOReader rwo = new RWOReader();
    try {
      String line;
      while ((line = rwo.reader.readLine()) != null || line == rwo.separator) {
        System.out.println(line);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        rwo.reader.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}
