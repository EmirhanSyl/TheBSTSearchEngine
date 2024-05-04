package com.thebst.thebstsearchengine.core;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
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


    public FileFilter() {
        createFilterList();
    }

    public void setPunctuationList(String[] punctuations) {
        this.punctuations = punctuations;
    }
    public void setIgnoreFile(File ignoreFile) {
        this.ignoreFile = ignoreFile;
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
    
    private String readFile(File file){
        return readFileContentWithoutHtmlTags(file);
    }
    
    private String readFileContentWithoutHtmlTags(File file) {
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
    
    public void updateBSTWithFile(BinarySearchTree bst, File file){
        String fileContent = readFile(file);
        
        String words[] = fileContent.split("\\s+");
        for (String word : words) {
            if (!ignoreList.contains(word)) {
                bst.add(new BSTWordData(word, file.getName()));
            }
        }
    }

}
