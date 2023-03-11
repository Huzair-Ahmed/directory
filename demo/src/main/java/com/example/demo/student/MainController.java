package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/enterStudent")
    public String enterStudent(Model model) {
        StudentsData s1 = new StudentsData();
        model.addAttribute("viewstudent", s1);

        return "enterStudent";
    }

    @PostMapping(path = "/process-student")
    public String processStudent(@ModelAttribute StudentsData s1, Model model) {
        model.addAttribute("shownewstudent", s1);
        studentService.addStudent(s1);

        return "shownewstudent";
    }

    @GetMapping(path = "/registeredStudent")
    public String registeredStudent(Model model) {
        model.addAttribute("studentlist", studentService.getStudents());
        
        return "registeredStudent";
    }

}
