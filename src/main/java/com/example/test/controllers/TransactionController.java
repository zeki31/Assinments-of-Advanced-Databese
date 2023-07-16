package com.example.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test.models.services.TransactionService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor

public class TransactionController {
    // GET /issue

    private final TransactionService transactionService;
    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/transaction")
    public String showList(Model model){
        model.addAttribute("transactionList", transactionService.findAll());
        return "transaction_list";
    }
}
