package cg.c2.demosprboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public ModelAndView greeting() {
        ModelAndView modelAndView = new ModelAndView("greeting");
        modelAndView.addObject("name", "world");
        return modelAndView;
    }
}
