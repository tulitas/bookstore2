package com.controllers;

import com.Models.JobformService;
import com.entities.JobForm;
import com.repositories.JobformServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
@Configuration

@ComponentScan("com.repositories")
public class OptionsController {
    @Autowired

    private JobformService jobformService = new JobformServiceImpl();


    @RequestMapping(value = "/options/create", method = RequestMethod.POST)
    public String options(JobForm jobForm) {

        jobformService.addJobForm(jobForm);

        return "redirect:/options";
    }

    @RequestMapping(value = "/valid", method = RequestMethod.POST)
    public String checkBookName(@Valid JobForm jobForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/optons";
        } else jobformService.addJobForm(jobForm);
        System.out.println("validation");
        return "redirect:/options";
    }

    @RequestMapping(value = "/options")
    public String getAllById( Model model, String id) {
        System.out.println("CONTR get all by work date");
        List<JobForm> jobForms = jobformService.getAllById(id);
        model.addAttribute("optionsList", jobForms);
        System.out.println(id);
        return "/addNewBook";
    }

    @RequestMapping(value = "/options/delete{id}", method = RequestMethod.GET)
    public String removeJobform(@PathVariable("id") long id) {
        jobformService.removeJobForm(id);
        return "redirect:/options";
    }



}








