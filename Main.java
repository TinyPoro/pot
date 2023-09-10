package org.example;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = new FileInputStream("/Users/tinyporo/Documents/Code/Java/PotTest/resources/test.doc");
        HWPFDocument document = new HWPFDocument(fis);
        extractor = new WordExtractor(document);
        String[] fileData = extractor.getParagraphText();
        for (int i = 0; i < fileData.length; i++) {
            if (fileData[i] != null) {
                System.out.println(fileData[i]);
            }
        }
    }
}