package io.arukas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by niuyuxian on 17/09/2017.
 */
@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("name", "你好");
        return "hello";
    }

}
