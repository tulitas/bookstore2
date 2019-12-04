package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AddNewBookController {
    @RequestMapping("/addNewBook")
    public String addNewBook() {

        return "addNewBook";
    }
}
