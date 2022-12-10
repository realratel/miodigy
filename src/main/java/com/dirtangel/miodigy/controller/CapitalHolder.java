/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dirtangel.miodigy.controller;

/**
 *
 * @author mmiod
 */
public class CapitalHolder {
    String capitalLetter;
    
    int charindex;
    int wordlength;

    public CapitalHolder(String capitalLetter, int charindex, int wordlength) {
        this.capitalLetter = capitalLetter;
        this.charindex = charindex;
        this.wordlength = wordlength;
    }
    
    

    public String getCapitalLetter() {
        return capitalLetter;
    }

    public void setCapitalLetter(String capitalLetter) {
        this.capitalLetter = capitalLetter;
    }

    public int getCharindex() {
        return charindex;
    }

    public void setCharindex(int charindex) {
        this.charindex = charindex;
    }

    public int getWordlength() {
        return wordlength;
    }

    public void setWordlength(int wordlength) {
        this.wordlength = wordlength;
    }
    
    
}
