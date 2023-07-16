package com.example.test.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class IndexController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // GET /
    @GetMapping()
    public String index(Model model) {
        String sql = "SELECT * FROM account where accountId = 2";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        model.addAttribute("accountList", list);

        String sql2 = "SELECT * FROM balance where accountId = 2";
        List<Map<String, Object>> list2 = jdbcTemplate.queryForList(sql2);
        model.addAttribute("balanceList", list2);

        return "index";
    }

}