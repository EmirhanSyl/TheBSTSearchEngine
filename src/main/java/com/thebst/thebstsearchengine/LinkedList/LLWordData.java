package com.thebst.thebstsearchengine.LinkedList;


/**
 *
 * @author emirs & asimtarik
 */
public class LLWordData {
    
    private String fileName;
    private int count;

    public LLWordData(String fileName, int count) {
        this.fileName = fileName;
        this.count = count;
        
    }
    
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\"" + fileName + "\" -> " + count;
    }
    
    
    
}
