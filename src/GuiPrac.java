import javax.swing.JOptionPane;

public class GuiPrac {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        JOptionPane.showMessageDialog(null, "Your fucking age is: " + age);
    }
}