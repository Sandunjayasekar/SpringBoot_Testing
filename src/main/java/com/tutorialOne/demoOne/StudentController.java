package com.tutorialOne.demoOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Sandun", "Kasun");
    }
    @GetMapping("/getStudents")
    public List<Student> getStudents (){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rajah","Krishna"));
        students.add(new Student("pathi","prem"));
        students.add(new Student("raju","cena"));
        students.add(new Student("jalai","gopal"));
        students.add(new Student("buwa","noyu"));
        return students;
    }
}
