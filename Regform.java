import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField firstNameField, lastNameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create components
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(15);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(15);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        // Add components to the frame
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            // You can perform validation and registration logic here
            // For simplicity, let's just print the entered values
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
