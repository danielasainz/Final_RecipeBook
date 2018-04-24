package com.sainz.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/wings")
    public String showWings(){
        return "wings";
    }

    @RequestMapping("/uindex")
    public String showUindex(){
        return "uindex";
    }

    @RequestMapping("/injeraindex")
    public String showInjeraIndex() {
        return "injeraindex";
    }

    @RequestMapping("/makhrouds")
    public String showMakhrouds() {
        return "makhrouds";
    }

    @RequestMapping("/eggsauce")
    public String showEggsauce(){
        return "eggsauce";
    }

    @RequestMapping("/pumpkinspice")
    public String showPumpkinSpice(){
        return "pumpkinspice";
    }

    @RequestMapping("/list")
    public String showList(){
        return "list";
    }
}