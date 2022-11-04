import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Teacher> teachers = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();
    private final List<String> courses = new ArrayList<>();

    private String schoolName;
    private String schoolDistrict;
    private String schoolMotto;

    public School(String schoolName, String schoolDistrict, String schoolMotto) {
        this.schoolName = schoolName;
        this.schoolDistrict = schoolDistrict;
        this.schoolMotto = schoolMotto;
    }

    /**
     * Add a teacher to the school
     * @param teacher the teacher to add
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Remove a teacher from the school
     * @param teacher the teacher to remove
     */
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * Add a student to the school
     * @param student the student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Remove a student from the school
     * @param student the student to remove
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * Add a course to the school
     * @param course the course to add
     */
    public void addCourse(String course) {
        courses.add(course);
    }

    /**
     * Remove a course from the school
     * @param course the course to remove
     */
    public void removeCourse(String course) {
        courses.remove(course);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getCourses() {
        return courses;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

    public String getSchoolMotto() {
        return schoolMotto;
    }

    public void setSchoolMotto(String schoolMotto) {
        this.schoolMotto = schoolMotto;
    }
}
