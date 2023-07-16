package com.example.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test.models.services.RemoveService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor

public class RemoveController {
    // GET /issue

    private final RemoveService removeService;
    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/remove")
    public String showList(Model model){
        model.addAttribute("removeList", removeService.findAll());
        return "remove_list";
    }
}
