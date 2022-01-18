package me.byusluer.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    String showIndexPage(Model model){


        return "index";
    }
}
