package org.personal.pedrocolaco;

/**
 *Copyright © 2024 c0l4p5o
 */
public class Main {
    public static void main(String[] args) {
       //Creating the factory
        FileFactory fileFactory = new FileFactory();
       //Creates a Word Document of type File
       File wordDocument = fileFactory.createWordDocument();
       //Execute the open() method and printing content
       wordDocument.open();

       File pdfDocument = fileFactory.createPdfDocument("Something");
       pdfDocument.open();

       File excelDocument = fileFactory.createExcelDocument("potatoes");
       excelDocument.open();
    }
}