package com.thebst.thebstsearchengine;

/**
 *
 * @author emirs & asimtarik
 */
public class TheBSTSearchEngine {

    public static void main(String[] args) {
        String str = "national bureau of standards .  after the results on the two dimensional";
        for (String word : str.split("\\s+")) {
            System.out.println(word);
        }
        
        String projectFolderPath = System.getProperty("user.dir");

        System.out.println("Project Folder Path: " + projectFolderPath);
    }
}
