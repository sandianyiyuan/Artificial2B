package host.sdyy.mapper;

import host.sdyy.demos.web.Course;
import host.sdyy.demos.web.Student;
import host.sdyy.entity.ClassesEnrolledStudent;
import host.sdyy.entity.StudentChooseClasses;

import java.util.List;


public interface StudentCourseMapper {
    List<Course> searchCourseByStudentId(int studentId);

    ClassesEnrolledStudent searchStudentsByCourseId(int sourseId);
}
