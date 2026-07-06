package com.example.demointernetdb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {

    @RequestMapping(value = "{path:[^\\.]*}")
    public String forward() {
        // Redirige todas las rutas que no contengan un punto (.) a index.html
        return "forward:/index.html";
    }
}