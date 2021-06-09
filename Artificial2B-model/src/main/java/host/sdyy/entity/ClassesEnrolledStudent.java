package host.sdyy.entity;

import host.sdyy.demos.web.Course;
import host.sdyy.demos.web.Student;

import java.io.Serializable;
import java.util.List;

public class ClassesEnrolledStudent extends Course implements Serializable  {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
