import javax.swing.JOptionPane;

public class GuiPrac{
    public static void main(String[] args){
        int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks"));

        if(marks>=75 && marks <=100){
        JOptionPane.showMessageDialog(null, "Excellent my boy. you passed the subject, your mark is "+marks);
        }
        else if(marks<75){
            JOptionPane.showMessageDialog(null, "You have to work your ass off. Your mark is "+ marks);
        }

    }
}