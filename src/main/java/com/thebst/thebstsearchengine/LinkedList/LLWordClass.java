/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thebst.thebstsearchengine.LinkedList;

import com.thebst.thebstsearchengine.LinkedList.LL;

/**
 *
 * @author Lenovo
 */
public class LLWordClass {
    
    private LLNode head;
    private String fileName;

    public LLWordClass(String fileName) {
        this.fileName = fileName;
        this.head = null;
        
    }

    
    public String getFileName() {
        return fileName;
    }

   
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    public LLNode getHead() {
        return head;
    }

    
    public void setHead(LLNode head) {
        this.head = head;
    }
    
}
