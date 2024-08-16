package org.personal.pedrocolaco;

import org.personal.pedrocolaco.filetypes.ExcelDocument;
import org.personal.pedrocolaco.filetypes.PdfFile;
import org.personal.pedrocolaco.filetypes.TextFile;

public class FileFactory {
    /**
     *
     * @param content file content
     * @return the word document
     */
    public File createWordDocument(String content){
        TextFile wordDocument = new TextFile();
        wordDocument.setContent(content);
        return wordDocument;
    }

    /**
     *
     * @return word document without content
     */
    public File createWordDocument(){
        return new TextFile();
    }

    /**
     *
     * @param content file content
     * @return the pdf document
     */
    public File createPdfDocument(String content){
        PdfFile pdfDocument = new PdfFile();
        pdfDocument.setContent(content);
        return pdfDocument;
    }

    /**
     *
     * @return pdf document without content
     */
    public File createPdfDocument(){
        return new PdfFile();
    }

    /**
     *
     * @param content file content
     * @return the excel document
     */
    public File createExcelDocument(String content){
        ExcelDocument excelDocument = new ExcelDocument();
        excelDocument.setContent(content);
        return excelDocument;
    }

    /**
     *
     * @return empty excel
     */
    public File createExcelDocument(){
        return new ExcelDocument();
    }
}
