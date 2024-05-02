package com.thebst.thebstsearchengine.BinarySearchTree;

import com.thebst.thebstsearchengine.LinkedList.*;

/**
 *
 * @author emirs & asimtarik
 */
public class BSTWordData implements IComparable{
    private String data;
    private LL<LLWordData> wordCounts;

    public BSTWordData(String data) {
        this.data = data;
        this.wordCounts = new LL<>();
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
    public int isEquals(IComparable otherData){
        return data.compareTo(((BSTWordData)otherData).getData());
    }

    @Override
    public String toString() {
        return data;
    }
    
    
}
