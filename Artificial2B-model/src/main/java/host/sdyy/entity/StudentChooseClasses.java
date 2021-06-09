package host.sdyy.entity;

import host.sdyy.demos.web.Course;
import host.sdyy.demos.web.Student;

import java.io.Serializable;
import java.util.List;

public class StudentChooseClasses extends Student implements Serializable  {
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
