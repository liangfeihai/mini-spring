package com.example.leo.Service;

import com.example.leo.beans.Bean;

@Bean
public class SalaryService {
    public Integer calSalary(Integer experience){
        return experience*5000;
    }
}
