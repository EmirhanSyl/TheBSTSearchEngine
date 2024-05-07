package com.thebst.thebstsearchengine.BinarySearchTree;

import com.thebst.thebstsearchengine.LinkedList.*;
import com.thebst.thebstsearchengine.screens.Results;

/**
 *
 * @author emirs & asimtarik
 */
public class BSTWordData implements IComparable{
    private String data;
    private LL<LLWordData> wordCounts;

    public BSTWordData(String data, String documentName) {
        this.data = data;
        this.wordCounts = new LL<>();
        wordCounts.addLast(new LLWordData(documentName, 1));
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public LL<LLWordData> getWordCounts() {
        return wordCounts;
    }
    public void setWordCounts(LL<LLWordData> wordCounts) {
        this.wordCounts = wordCounts;
    }
    
    @Override
    public void updateData(){
        boolean found = false;
        String filename = Results.currentFile;
        for (int i = 0; i < wordCounts.getSize(); i++) {
            if (wordCounts.get(i).getFileName().equals(filename)) {
                wordCounts.get(i).setCount(wordCounts.get(i).getCount() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            wordCounts.addLast(new LLWordData(filename, 1));
        }
    }
    
    
    @Override
    public int isEquals(IComparable otherData){
        return data.compareTo(((BSTWordData)otherData).getData());
    }

    @Override
    public String toString() {
        String output = "Key: " + data + ", Found in: [";
        for (int i = 0; i < wordCounts.getSize(); i++) {
            output += wordCounts.get(i).toString() + "-> ";
        }
        output += "]";
        return output;
    }
    
    
}
