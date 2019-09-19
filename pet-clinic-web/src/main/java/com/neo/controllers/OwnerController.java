package com.neo.controllers;

import com.neo.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/index"})
    public String ownerslist(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
