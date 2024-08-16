package org.personal.pedrocolaco.filetypes;

import org.personal.pedrocolaco.File;

/**
 * Represengts a plain text file
 */
public class TextFile implements File {
    /**
     * Content of the file
     */
    private String content;

    /**
     * Opens the file and prints the string content
     */
    @Override
    public void open() {
        System.out.println("Opening a plain text file...");
        System.out.println(getContent());
    }

    /**
     * Evaluates if the file has content and
     * gives content a default meaningful value if not set
     * @return String content of the file
     */
    public String getContent() {
        if(content==null){
            content = "Empty File";
        }
        return content;
    }

    /**
     * @param content save content to file
     */
    public void setContent(String content) {
        this.content = content;
    }
}
