package com.jay.role_based_authentication.controller;

import com.jay.role_based_authentication.model.StuDetails;
import com.jay.role_based_authentication.service.StuDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PageController {

    @Autowired
    private StuDetailsService stuDetailsService;


    @GetMapping("/admission_form")
    public String admissionForm() {
        return "admission_form";
    }



}
