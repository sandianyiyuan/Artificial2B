package host.sdyy.impl;

import host.sdyy.StudentsAndCourse;
import host.sdyy.demos.web.Course;
import host.sdyy.demos.web.StudentCourse;
import host.sdyy.entity.ClassesEnrolledStudent;
import host.sdyy.mapper.StudentCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class StudentsAndCourseImpl implements StudentsAndCourse {

    @Autowired
    protected StudentCourseMapper studentCourseMapper;

    @Override
    public void ClassesEnrolledStudent(int studentId, Model model){
        List<Course> courses = studentCourseMapper.searchCourseByStudentId(studentId);
        System.out.println(courses);
        model.addAttribute("courses" , courses);
    }
}
