package com.hemanth.FrontEndBackEnd.controller;

import com.hemanth.FrontEndBackEnd.entity.Student;
import com.hemanth.FrontEndBackEnd.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController
{

    @Autowired
    StudentService ss;

    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public Student addStud(@RequestBody Student s)
    {

        return ss.addStudent(s);
    }


    @RequestMapping(method = RequestMethod.GET,value = "/details")
    public List<Student> getStud()
    {

        return ss.getStudent();
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
    public String deleteStud(@PathVariable int id)
    {

        return ss.deleteStudent(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/update")
    public String updateStud(@RequestBody Student s)
    {

        return ss.updateStudent(s);
    }
}
