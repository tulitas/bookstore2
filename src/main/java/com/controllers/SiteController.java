package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SiteController {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("site/index");
    }

    @RequestMapping("/year2019")
    public String year2019() {

        return "year2019";
    }

    @RequestMapping("/statistics")
    public String statistics() {
        return "statistics";
    }

}
