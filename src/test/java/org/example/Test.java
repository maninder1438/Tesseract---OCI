package org.example;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Test {
    public static void main(String []args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("C:\\Users\\shailesh.ACCOUNTPC\\Downloads\\tessdata");
            String text = tesseract.doOCR(new File("C:\\Users\\shailesh.ACCOUNTPC\\Downloads\\digit.png"));
            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
