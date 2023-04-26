package com.hemanth.FrontEndBackEnd.service;

import com.hemanth.FrontEndBackEnd.entity.Student;
import com.hemanth.FrontEndBackEnd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{

    @Autowired
    StudentRepository sr;

    public Student addStudent(Student student)
    {
        return sr.save(student);
    }

    public List<Student> getStudent()
    {
        return sr.findAll();
    }

    public String updateStudent(Student student)
    {
        sr.save(student);
        return "Updated successfully";
    }

    public String deleteStudent(int id)
    {
        sr.deleteById(id);
        return "Deleted successfully";
    }
}
