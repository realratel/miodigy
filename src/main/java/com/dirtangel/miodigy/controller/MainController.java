/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dirtangel.miodigy.controller;

import java.awt.Image;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mmiod
 */
@Controller
@RequestMapping
public class MainController {

//    @GetMapping("/")
//    public String showHomePage(Model model) {
//        model.addAttribute("pageName", "index");
//        model.addAttribute("appName", "miodigy");
//        return "index";
//    }

    @RequestMapping(value = "/")
    public String index(Model model, Pageable pageable) {
//        final Page<Image> page = imageService.findPage(pageable);
        model.addAttribute("pageName", "index");
        model.addAttribute("appName", "miodigy");
        return "index";//return to template index.html
    }

    @GetMapping("/bio.html")
    public String showBio(Model model) {
        model.addAttribute("pageName", "bio");
        model.addAttribute("appName", "miodigy");
        return "bio";
    }
}
