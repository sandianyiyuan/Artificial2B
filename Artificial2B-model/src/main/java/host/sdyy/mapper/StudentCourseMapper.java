package host.sdyy.mapper;

import host.sdyy.demos.web.Course;
import host.sdyy.demos.web.Student;

import java.util.List;


public interface StudentCourseMapper {
    List<Course> searchCourseByStudentId(int studentId);

    List<Student> searchStudentsByCourseId(int sourseId);
}
