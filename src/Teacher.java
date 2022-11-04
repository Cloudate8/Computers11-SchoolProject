/**
 * Object that represents a teacher and the subject that they teach
 */
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Show the teacher's full name and their subject
     * @return the teacher's full name and their subject
     */
    @Override
    public String toString() {
        return String.format("Name: %s %s Subject %s", firstName, lastName, subject);
    }
}
