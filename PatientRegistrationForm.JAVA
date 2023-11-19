import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class PatientRegistrationForm extends JFrame implements ActionListener {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel dobLabel;
    private JFormattedTextField dobField;
    private JLabel genderLabel;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JLabel addressLabel;
    private JTextArea addressField;
    private JLabel phoneLabel;
    private JTextField phoneField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel insuranceProviderLabel;
    private JTextField insuranceProviderField;
    private JLabel insuranceIdLabel;
    private JTextField insuranceIdField;
    private JButton registerButton;

    public PatientRegistrationForm() {
        setTitle("Patient Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(nameLabel, c);
        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(nameField, c);

        dobLabel = new JLabel("Date of Birth:");
        dobField = new JFormattedTextField(java.util.Calendar.getInstance().getTime());
        dobField.setColumns(10);
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(dobLabel, c);
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(dobField, c);

        genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(genderLabel, c);
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(genderPanel, c);

        addressLabel = new JLabel("Address:");
        addressField = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(addressField);
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(addressLabel, c);
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(scrollPane, c);

        phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField(20);
        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(phoneLabel, c);
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(phoneField, c);

        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(emailLabel, c);
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(emailField, c);

        insuranceProviderLabel = new JLabel("Insurance Provider:");
        insuranceProviderField = new JTextField(20);
        c.gridx = 0;
      }
    }
