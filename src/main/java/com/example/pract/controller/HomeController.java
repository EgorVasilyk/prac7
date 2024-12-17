package com.example.pract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
    @GetMapping("/home")
    String gethome(){return "home";}

    @GetMapping("/calc")
    String calc(){
        return "calc";
    }

    @GetMapping("/conv")
    String conv(){
        return "conv";
    }

    @PostMapping("/calc")
    public String numbers (Model model,
    @RequestParam(name = "A", required = false, defaultValue = "0") double A,
    @RequestParam(name = "B", required = false, defaultValue = "0") double B,
    @RequestParam(name = "act", required = false, defaultValue = "+") String act)
    {
        if (act.equals("+"))model.addAttribute("C", A + B);
        else if (act.equals("-"))model.addAttribute("C", A - B);
        else if (act.equals("*"))model.addAttribute("C", A * B);
        else if (act.equals("/"))model.addAttribute("C", A / B);

        return "calc";
    }

    @PostMapping("/conv")
    public String values (Model model,
                          @RequestParam(name = "value", required = false, defaultValue = "0") double value,
    @RequestParam(name = "type", required = false, defaultValue = "") String type)
    {
<<<<<<< HEAD
        if (type.equals("rub, rub"))model.addAttribute("res", value * 1);
=======
        if (.equals("rub, rub"))model.addAttribute("res", value * 1);
>>>>>>> 9b8ef21 (prac7)
        else if (type.equals("kzt,kzt"))model.addAttribute("res", value * 1);
        else if (type.equals("usd,usd"))model.addAttribute("res", value * 1);
        else if (type.equals("rub,kzt"))model.addAttribute("res", value * 5.35);
        else if (type.equals("rub,usd"))model.addAttribute("res", value * 0.1);
        else if (type.equals("kzt,rub"))model.addAttribute("res", value * 0.19);
        else if (type.equals("kzt,usd"))model.addAttribute("res", value * 0.002);
        else if (type.equals("usd,rub"))model.addAttribute("res", value * 90);
        else if (type.equals("usd,kzt"))model.addAttribute("res", value * 482.58);

        return "conv";
    }
}
