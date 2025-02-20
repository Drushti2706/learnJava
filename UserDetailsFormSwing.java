import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class UserDetailsFormSwing {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Enhanced User Details Form");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(9, 2, 10, 10));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        // Buttons
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        // Styling
        Font font = new Font("Arial", Font.PLAIN, 14);
        nameLabel.setFont(font);
        ageLabel.setFont(font);
        genderLabel.setFont(font);
        emailLabel.setFont(font);
        phoneLabel.setFont(font);
        addressLabel.setFont(font);

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderLabel);
        frame.add(genderPanel);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(submitButton);
        frame.add(clearButton);

        // Submit Button Action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String address = addressField.getText();

                String gender = "";
                if (maleButton.isSelected()) gender = "Male";
                else if (femaleButton.isSelected()) gender = "Female";
                else if (otherButton.isSelected()) gender = "Other";

                // Validation
                if (name.isEmpty() || ageText.isEmpty() || gender.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!ageText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(frame, "Age must be a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!Pattern.matches("\\d{10}", phone)) {
                    JOptionPane.showMessageDialog(frame, "Phone number must be exactly 10 digits!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
                    JOptionPane.showMessageDialog(frame, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Save Data to File
                try (FileWriter writer = new FileWriter("user_data.txt", true)) {
                    writer.write("Name: " + name + "\n");
                    writer.write("Age: " + ageText + "\n");
                    writer.write("Gender: " + gender + "\n");
                    writer.write("Email: " + email + "\n");
                    writer.write("Phone: " + phone + "\n");
                    writer.write("Address: " + address + "\n");
                    writer.write("----------------------\n");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Display confirmation
                JOptionPane.showMessageDialog(frame, "User Details Saved Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Clear Button Action
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                emailField.setText("");
                phoneField.setText("");
                addressField.setText("");
                genderGroup.clearSelection();
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
