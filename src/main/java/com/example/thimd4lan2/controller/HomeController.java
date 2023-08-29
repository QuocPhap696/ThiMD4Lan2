package com.example.thimd4lan2.controller;

import com.example.thimd4lan2.model.EType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class HomeController {

//    @GetMapping
//    public String showIndex(){
//        return "base";
//    }

    @GetMapping
    public ModelAndView showHome(){
        ModelAndView view = new ModelAndView("base");
        EType[] enumValues = EType.values();
        view.addObject("enumValues", enumValues);
        return view;
    }
}
