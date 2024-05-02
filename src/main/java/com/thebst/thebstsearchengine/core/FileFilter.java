package com.thebst.thebstsearchengine.core;

import com.thebst.thebstsearchengine.LinkedList.LL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author emirs & asimtarik
 */
public class FileFilter {

    private String[] punctuations = {
        ".", ",", "!", "?", ";", ":", "-", "'", "\"", "(", ")", "[", "]", "{",
        "}", "/", "\\", "<", ">", "&", "@", "#", "$", "%", "^", "*", "+", "="
    };
    private final String projectFolderPath = System.getProperty("user.dir");
    private File ignoreFile = new File(projectFolderPath + "\\testFiles\\ignoreList.txt");
    private final LL<String> ignoreList = new LL<>();

    private final File file;
    private final String fileContent;
    private final String fileName;

    public FileFilter(File file) {
        this.file = file;
        createFilterList();
        fileContent = readFileContentWithoutHtmlTags();
        fileName = file.getName();
    }

    public void setPunctuationList(String[] punctuations) {
        this.punctuations = punctuations;
    }
    public void setIgnoreFile(File ignoreFile) {
        this.ignoreFile = ignoreFile;
    }
    public String getFileName(){
        return fileName;
    }

    
    public LL<String> filterFile() {
        LL<String> filteredContent = new LL<>();

        String words[] = fileContent.split("\\s+");
        for (String word : words) {
            if (!ignoreList.contains(word)) {
                filteredContent.addLast(word);
            }
        }

        return filteredContent;
    }

    private String readFileContentWithoutHtmlTags() {
        String content = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.strip().startsWith("<")) {
                    content += line.strip() + " ";
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return content;
    }

    private void createFilterList() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ignoreFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                ignoreList.addLast(line.strip());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        for (String punctuation : punctuations) {
            ignoreList.addLast(punctuation);
        }
    }

}
