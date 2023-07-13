package com.example.test.web.removes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.test.domain.removes.RemoveService;
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
    @GetMapping("/removes")
    public String showList(Model model){
        model.addAttribute("removeList", removeService.findAll());
        return "remove_list";
    }
}
