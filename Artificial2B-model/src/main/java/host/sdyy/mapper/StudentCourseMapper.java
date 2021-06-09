package host.sdyy.mapper;

import host.sdyy.demos.web.Course;

import java.util.List;


public interface StudentCourseMapper {
    List<Course> searchCourseByStudentId(int StudentId);
}
