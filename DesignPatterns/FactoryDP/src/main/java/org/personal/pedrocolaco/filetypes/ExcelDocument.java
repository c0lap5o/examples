package org.personal.pedrocolaco.filetypes;

import org.personal.pedrocolaco.File;

/**
 *Represents an Excel File
 */
public class ExcelDocument implements File {
    /**
     * File Content
     */
    private String content;

    /**
     * Opens the file
     */
    @Override
    public void open() {
        System.out.println("Opening Excel File...");
        System.out.println(getContent());
    }
    /**
     * Evaluates if the file has content and
     * gives content a nice default value if not set
     * @return String content of the file
     */
    public String getContent() {
        if(content == null){
            content = ""
                    + "   | A | B | C | D | E |\n"
                    + "---+---+---+---+---+---+\n"
                    + " 1 |   |   |   |   |   |\n"
                    + "---+---+---+---+---+---+\n"
                    + " 2 |   |   |   |   |   |\n"
                    + "---+---+---+---+---+---+\n"
                    + " 3 |   |   |   |   |   |\n"
                    + "---+---+---+---+---+---+\n"
                    + " 4 |   |   |   |   |   |\n"
                    + "---+---+---+---+---+---+\n"
                    + " 5 |   |   |   |   |   |\n"
                    + "---+---+---+---+---+---+\n";
        }
        return content;
    }

    /**
     * @param content sets the content of the file
     */
    public void setContent(String content) {

       String newContent = ""
                + "   | A | B | C | D | E |\n"
                + "---+---+---+---+---+---+\n"
                + " 1 |"+content +"  |   |   |   |   |\n"
                + "---+---+---+---+---+---+\n"
                + " 2 |   |   |   |   |   |\n"
                + "---+---+---+---+---+---+\n"
                + " 3 |   |   |   |   |   |\n"
                + "---+---+---+---+---+---+\n"
                + " 4 |   |   |   |   |   |\n"
                + "---+---+---+---+---+---+\n"
                + " 5 |   |   |   |   |   |\n"
                + "---+---+---+---+---+---+\n";
        this.content = newContent;
    }
}
