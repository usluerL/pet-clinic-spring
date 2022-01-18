package me.byusluer.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {


    @RequestMapping({"/vets", "/vets/index"})
    String showIndexPage(Model model){


        return "vet/index";
    }

}
