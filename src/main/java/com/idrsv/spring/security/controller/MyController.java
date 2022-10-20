package com.idrsv.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    //Страница отображения информации о всех работниках
    @GetMapping("/")
    public String getInfoForAllEmployee() {
        return "view_for_all_employees";
    }

    //Старница отображающаяся только HR
    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "view_for_hr";
    }

    //Старница отображающаяся только HR
    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers() {
        return "view_for_managers";
    }
}