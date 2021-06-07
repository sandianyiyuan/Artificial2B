package host.sdyy.demos.web;
import java.util.List;
/**
 * 学生选课实体
 * 学生与课程之间的对应关系实体
 * 中间关系实体
 *
 *
 */
public class StudentCourse {

    private int sid;
    private int cid;
    private int sorce;

    private List<Student> students;
    private List<Course> courses;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getSorce() {
        return sorce;
    }
    public void setSorce(int sorce) {
        this.sorce = sorce;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}