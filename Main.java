//babcock university grading system
// write a program to accepr the name and eight exam grade of a student
// print out the average grade using for loop and JOptionPane
// also check if the student pass or failed

import javax.swing.JOptionPane;
public class Main{
    public static void main(String[]args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int grade1 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 1"));
        int grade2 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 2"));
        int grade3 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 3"));
        int grade4 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 4"));

        double total = grade1 + grade2+ grade3+ grade4;
        double average = (grade1 + grade2+grade3+grade4)/4.0;

        JOptionPane.showMessageDialog(null, name + "\n" + grade1 + "\n" + grade2+ "\n" + grade3+ "\n" + grade4+ "\n" + "the total grade is " + total +"\n" +"The average grade is " + " "+ average);
        if(average >= 5.0)
        {
            JOptionPane.showMessageDialog(null, "congrats ");
        }else
            JOptionPane.showMessageDialog(null, "you failed ");


    }

}