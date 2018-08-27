package com.example.lesson6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  @GetMapping("/addemployeeform")
  public String loadSongForm(Model model){
    model.addAttribute("employee", new Employee());
    return "employeeform";
  }

  @PostMapping("/processemployeeform")
  public String processSongForm(@ModelAttribute Employee employee, Model model){
    model.addAttribute("employee", employee);
    return "confirmemployee";
  }

}
