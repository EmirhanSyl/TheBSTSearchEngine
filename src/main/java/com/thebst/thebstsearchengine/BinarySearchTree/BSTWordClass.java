/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thebst.thebstsearchengine.BinarySearchTree;

import com.thebst.thebstsearchengine.LinkedList.LL;

/**
 *
 * @author Lenovo
 */
public class BSTWordClass {
    private String data;
    private LL<WordCount> wordCounts;

    public BSTWordClass(String data) {
        this.data = data;
        this.wordCounts = new LL<>();
    }

    // Getter method for data
    public String getData() {
        return data;
    }

    // Setter method for data
    public void setData(String data) {
        this.data = data;
    }

    // Getter method for wordCounts
    public LL<WordCount> getWordCounts() {
        return wordCounts;
    }

    // Setter method for wordCounts
    public void setWordCounts(LL<WordCount> wordCounts) {
        this.wordCounts = wordCounts;
    }
}
