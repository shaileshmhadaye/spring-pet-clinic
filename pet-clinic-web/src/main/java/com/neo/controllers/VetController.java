package com.neo.controllers;

import com.neo.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets.html"})
    public String vetslist(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
