public class Main {
    public static void main(String[] args) {

        // Create a school
        School school = new School(
                "Great school",
                "District of Sleepyland",
                "Sleepyland, where all schools are great"
        );

        // Add 10 students
        school.addStudent(new Student("John", "Smith", 1));
        school.addStudent(new Student("Johny", "Smite", 2));
        school.addStudent(new Student("Jane", "Frost", 3));
        school.addStudent(new Student("Julia", "Walker", 4));
        school.addStudent(new Student("Jerald", "Ou", 5));
        school.addStudent(new Student("Janice", "Lynn", 6));
        school.addStudent(new Student("Jack", "Ton", 7));
        school.addStudent(new Student("June", "Crafter", 8));
        school.addStudent(new Student("Jack", "Smith", 9));
        school.addStudent(new Student("June", "Crafter", 10));

        // Add 3 teachers
        school.addTeacher(new Teacher("Albert", "Rocker", "Geography"));
        school.addTeacher(new Teacher("Alice", "Craft", "Art"));
        school.addTeacher(new Teacher("Alan", "Wright", "English"));

        // Display students
        for (Student student : school.getStudents()) {
            System.out.println(student.toString());
        }

        // Display teachers
        for (Teacher teacher: school.getTeachers()) {
            System.out.println(teacher.toString());
        }

        // Remove 2 students
        school.removeStudent(school.getStudents().get(0));
        school.removeStudent(school.getStudents().get(2));

        // Remove 1 teacher
        school.removeTeacher(school.getTeachers().get(1));

        // Display updated list of students and teachers
        // Display students
        for (Student student : school.getStudents()) {
            System.out.println(student.toString());
        }

        // Display teachers
        for (Teacher teacher: school.getTeachers()) {
            System.out.println(teacher.toString());
        }

    }
}
