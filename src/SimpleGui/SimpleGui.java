package SimpleGui;

import javax.swing.JOptionPane;
/**
 * @author hatzp
 **/
public class SimpleGui {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your name below:");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age below:"));
        JOptionPane.showMessageDialog(null,"So you are "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Your height is:"));
        JOptionPane.showMessageDialog(null,"So you are "+height);

    }
}
