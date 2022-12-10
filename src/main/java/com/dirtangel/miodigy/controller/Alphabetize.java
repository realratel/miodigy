/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dirtangel.miodigy.controller;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.List;

/**
 *
 * @author mmiod
 */
public class Alphabetize {
    
    String input;
    String output;

    public Alphabetize(String input) {
        this.input = input;
    }
    
    public String process() {
     List<String> words = Lists.asList(input,input.split(" "));
      for(String w : words) {
        for(int a=0; a<w.length(); a++) {    
            final String charAt;
            charAt = String.valueOf(w.charAt(a));
            charAt.toUpperCase();
            
          }
      }
      return output;
    }
   
   
}
