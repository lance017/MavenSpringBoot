package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lance017 on 2017/5/3.
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/ss")
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "result";
    }

}
