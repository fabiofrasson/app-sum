import javax.swing.JOptionPane;

public class AdditionGUI
{
    public static void main(String[] args) {
        int number1 = java.lang.Integer.parseInt(JOptionPane.showInputDialog("Enter first integer: "));
        int number2 = java.lang.Integer.parseInt(JOptionPane.showInputDialog("Enter second integer: "));
        int sum = number1 + number2;

        String message =
                String.format("Sum is %d%n", sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
