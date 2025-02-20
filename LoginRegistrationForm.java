import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class LoginRegistrationForm {
    // Store users in HashMap (username -> password)
    private static HashMap<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        showRegistrationForm();
    }

    // Registration Form
    private static void showRegistrationForm() {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        JButton loginButton = new JButton("Go to Login");

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(registerButton);
        frame.add(loginButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (userDatabase.containsKey(username)) {
                    JOptionPane.showMessageDialog(frame, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    userDatabase.put(username, password);
                    JOptionPane.showMessageDialog(frame, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                    showLoginForm();
                }
            }
        });

        loginButton.addActionListener(e -> {
            frame.dispose();
            showLoginForm();
        });

        frame.setVisible(true);
    }

    // Login Form
    private static void showLoginForm() {
        JFrame frame = new JFrame("User Login");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Go to Register");

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        registerButton.addActionListener(e -> {
            frame.dispose();
            showRegistrationForm();
        });

        frame.setVisible(true);
    }
}
