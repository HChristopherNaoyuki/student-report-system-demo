package Solutions;

import javax.swing.JOptionPane;

// Class containing the main method to run the application
public class Student
{
    public static void main(String[] args) 
    {
        // Create a new instance of StudentReport
        StudentReport student = new StudentReport();

        // Get student details from user input
        student.setStudentNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter Student Number:")));
        student.setFullName(JOptionPane.showInputDialog("Enter Full Name:"));
        student.setCourse(JOptionPane.showInputDialog("Enter Course:"));
        student.setTest1Mark(Integer.parseInt(JOptionPane.showInputDialog("Enter Test 1 Mark:")));
        student.setTest2Mark(Integer.parseInt(JOptionPane.showInputDialog("Enter Test 2 Mark:")));

        // Display the calculated CASS mark to the user
        JOptionPane.showMessageDialog(null, "CASS Mark: " + student.calculateCASSMark());
    }
}
