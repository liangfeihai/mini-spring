package com.example.leo.controllers;

import com.example.leo.web.mvc.Controller;
import com.example.leo.web.mvc.RequestMapping;
import com.example.leo.web.mvc.RequestParam;

@Controller
public class SalaryController {
    @RequestMapping("/get_salary.json")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience){
        return 10000;
    }
}
