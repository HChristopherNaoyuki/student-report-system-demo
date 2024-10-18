package Solutions;

// Class to represent a student's report
public class StudentReport 
{
    // Attributes of the student
    private int studentNumber;
    private String fullName;
    private String course;
    private int test1Mark;
    private int test2Mark;

    // Constructor to initialize the StudentReport with default values
    public StudentReport() 
    {
        studentNumber = 0;
        fullName = "Akari Nakamura";
        course = "Bachelor of Mathematics";
        test1Mark = 87;
        test2Mark = 85;
    }

    // Getter and Setter methods for studentNumber
    public int getStudentNumber() 
    {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) 
    {
        this.studentNumber = studentNumber;
    }

    // Getter and Setter methods for fullName
    public String getFullName() 
    {
        return fullName;
    }

    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    // Getter and Setter methods for course
    public String getCourse() 
    {
        return course;
    }

    public void setCourse(String course) 
    {
        this.course = course;
    }

    // Getter and Setter methods for test1Mark
    public int getTest1Mark() 
    {
        return test1Mark;
    }

    public void setTest1Mark(int test1Mark) 
    {
        this.test1Mark = test1Mark;
    }

    // Getter and Setter methods for test2Mark
    public int getTest2Mark() 
    {
        return test2Mark;
    }

    public void setTest2Mark(int test2Mark) 
    {
        this.test2Mark = test2Mark;
    }

    // Method to calculate the CASS mark (Continuous Assessment)
    public double calculateCASSMark() 
    {
        return (test1Mark + test2Mark) / 2.0; // Use 2.0 for floating-point division
    }
}
