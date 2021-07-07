package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Employee2service;

@Controller
public class Employee2controller {
    @Autowired
    private Employee2service employee2service;
    //display list of employee


    @GetMapping("/")
    public String viewHomepage(Model model){
        model.addAttribute("listEmployee",employee2service.getAllEmployees());
        return "Index";
    }
}
