package com.example.leo.controllers;

import com.example.leo.Service.SalaryService;
import com.example.leo.beans.AutoWired;
import com.example.leo.web.mvc.Controller;
import com.example.leo.web.mvc.RequestMapping;
import com.example.leo.web.mvc.RequestParam;

@Controller
public class SalaryController {
    @AutoWired
    private SalaryService salaryService;
    @RequestMapping("/get_salary.json")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience){
        return salaryService.calSalary(Integer.parseInt(experience));
    }
}
