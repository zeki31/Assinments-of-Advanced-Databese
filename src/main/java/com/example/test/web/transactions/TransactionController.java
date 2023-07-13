package com.example.test.web.transactions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test.domain.transactions.TransactionService;
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
    @GetMapping("/transactions")
    public String showList(Model model){
        model.addAttribute("transactionList", transactionService.findAll());
        return "transaction_list";
    }
}
