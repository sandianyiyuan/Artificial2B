package host.sdyy.controller;

import host.sdyy.StudentsAndCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentCourse {

    @Autowired
    private StudentsAndCourse studentsAndCourse;

    @GetMapping("/searchCourseByStudentId")
    public Model searchCourseByStudentId(@RequestParam(name = "studentId", required = false, defaultValue = "1") int studentId, Model model){
        studentsAndCourse.ClassesEnrolledStudent(studentId,model);
        return model;
    }
}