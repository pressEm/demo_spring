package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Controller
public class FirstController {

    @RequestMapping(value = "/")
    public String start() {
//        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping(value = "/greeting")
    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
//@RestController
//public class FirstController {
//    @RequestMapping("/")
//    public String home() {
//        return "index.html";
//    }
//
//    @RequestMapping(value = "/getDateAndTime")
//    public ModelAndView getDateAndTime() {
//
//        var now = LocalDateTime.now();
//        var dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        var date_time = dtf.format(now);
//
//        var params = new HashMap<String, Object>();
//        params.put("date_time", date_time);
//
//        return new ModelAndView("showMessage", params);
//    }
//}