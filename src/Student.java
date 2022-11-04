import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Object that represents a teacher and the subject that they teach
 */
public class Student {
    private String firstName;
    private String lastName;
    private int grade;

    /*
     * Importantly, the student number needs to be unique from every other student number.
     * To ensure that all student numbers are unique, student numbers are highly discouraged from being manually assigned.
     * A manually set, duplicate student number will result in unexpected behaviour, as we will either now have non unique student numbers,
     * or we will have to reject the manually set number, causing the consumer of this class to be unable to trust that the student number has been set to what they want
     */
    private int studentNumber;

    /*
     * Create a static store of student numbers that can be accessed regardless of instantiated class
     * This allows us to keep a list of student numbers in use, and ensure that we create unique student numbers
     */
    private static final List<Integer> studentNumberStore = new ArrayList<>();

    /**
     * Create a Student object. Student number is randomly generated
     *
     * @param firstName The first name of the student
     * @param lastName  The last name of the student
     * @param grade     The grade the student is in
     */
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = createUniqueStudentNumber();
    }

    /**
     * Create a Student object. Student number is randomly generated
     *
     * @param firstName The first name of the student
     * @param lastName  The last name of the student
     * @param grade     The grade the student is in
     * @param studentNumber The preferred student number of a student. If it is not unique, a random student number will be used instead
     */
    public Student(String firstName, String lastName, int grade, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        if (studentNumberStore.contains(studentNumber)) {
            // If student number is not unique, assign a random and unique one instead
            this.studentNumber = createUniqueStudentNumber();
        } else {
            // Else just assign the preferred number
            this.studentNumber = studentNumber;
        }
    }

    /**
     * Create a unique student number that's not already in use
     *
     * @return A unique student number
     */
    private int createUniqueStudentNumber() {
        Random random = new Random();
        // Give the student a positive random number
        int randomStudentNumber = random.nextInt(1, Integer.MAX_VALUE);

        // If the number is not unique, keep giving random numbers till it is unique
        while (studentNumberStore.contains(randomStudentNumber)) {
            randomStudentNumber = random.nextInt(1, Integer.MAX_VALUE);
        }

        // Add the new number that will enter circulation to the store
        studentNumberStore.add(randomStudentNumber);
        return randomStudentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * This field exists solely for the requirements of the assignment.
     * <p>
     * In the scenario where a student number to be set is identical to one that already exists,
     * the student number will be set to a RANDOM AND UNIQUE student number.
     * The student number WILL be changed to indicate that the setter worked, at least to an extent.
     * This is done to protect the uniqueness of student numbers.
     * As there is no proper way to force student number upon a student object with 100% success, usage of this is discouraged
     * @param studentNumber The student number that is preferred to be assigned. No guarantees are made.
     */
    public void setStudentNumber(int studentNumber) {

        // Remove the current student number that is about to be deleted from circulation
        studentNumberStore.remove(this.studentNumber);

        // Check if new student number to be assigned is already in use
        if (studentNumberStore.contains(studentNumber)) {
            // If so, reject the proposed student number, and assign a random one
            this.studentNumber = createUniqueStudentNumber();
        } else {
            this.studentNumber = studentNumber;
        }

        // Add new student number to store
        studentNumberStore.add(this.studentNumber);
    }

    /**
     * Show the student's full name, grade, and student number
     * @return the student's full name, grade, and student number
     */
    @Override
    public String toString() {
        return String.format("Name: %s %s Grade: %s Student Number: %s", firstName, lastName, grade, studentNumber);
    }
}
