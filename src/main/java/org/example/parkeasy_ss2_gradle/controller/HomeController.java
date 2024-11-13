package org.example.parkeasy_ss2_gradle.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // request to first page
    @GetMapping("/")
    public String index(){
        return "index" ; // to find index.html in template package
    }

}
