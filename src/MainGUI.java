import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainGUI  {
    private JTextField idTextField;
    private JTextField textField2;
    private JTextArea descriptionIsShownHereTextArea;
    private JTextField textField3;
    private JTextField textField4;
    private JButton pileButton;
    private JButton unpileButton;
    private JButton showContainerDescriptionButton;
    private JTextField columnNumberTextField;
    private JButton numberOfContainersButton;
    private JTextArea descriptionIsShownThereTextArea;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox1;
    private JTextField putNumberHereTextField;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JTextArea textArea2;

    private JCheckBox checkBox1;
    private JPanel mainPanel;
    private JLabel IdNumber;
    private JLabel Weight;
    private JLabel Description;
    private JLabel RemitentCompany;
    private JLabel ReceiverCompany;
    private JLabel Operations;
    private JLabel Country;
    private JLabel Priority;
    private JLabel State;
    private JLabel CustomInspection;
    private JLabel CompanyLogo;
    MainGUI port= new MainGUI();



    public MainGUI () {


        ImageIcon TheLogo = new ImageIcon("The logo");
        CompanyLogo = new JLabel(TheLogo);
        pileButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                Container container = new Container();

                int TheC = 1;
                container.setIdNumber(Integer.parseInt(idTextField.getText()));
                container.setWeight(Integer.parseInt(textField2.getText()));
                container.setRemitentCompany(textField3.getText());
                container.setReceiverCompany(textField4.getText());

                if (a1RadioButton.isSelected()) {
                    container.setPriority(1);
                }
                if (a2RadioButton.isSelected()) {
                    container.setPriority(2);
                }
                if (a3RadioButton.isSelected()) {
                    container.setPriority(3);
                }

                container.setDescription(descriptionIsShownHereTextArea.getText());
                container.setCountry((String) comboBox2.getSelectedItem());

                if (checkBox1.isSelected()) {
                    container.setCustomInspection(true);
                } else {
                    container.setCustomInspection(false);
                }

                if (ThePort.hub1.TheStack(container) == -1) {
                    TheC += 1;
                    if (ThePort.hub2.TheStack(container) == -1) {
                        TheC += 1;

                        if (ThePort.hub3.TheStack(container) == -1) {
                            TheC += 1;
                            descriptionIsShownHereTextArea.setText("FULL");
                        }
                    }
                }

                if (TheC == 1) {
                    descriptionIsShownThereTextArea.setText("TheHub1  " + ThePort.hub1.ToString());
                }
                if (TheC == 2) {
                    descriptionIsShownThereTextArea.setText("TheHub2  " + ThePort.hub2.ToString());
                }
                if (TheC == 3) {
                    descriptionIsShownThereTextArea.setText("TheHub3  " + ThePort.hub3.ToString());
                }
                idTextField.setText(" " + (container.IdNumber + 1));


            }
        });


        unpileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThePort.hub1.Remove(Integer.parseInt(columnNumberTextField.getText()));
                descriptionIsShownThereTextArea.setText(ThePort.hub1.ToString());
            }
        });


        public static void main (String[] args){
            JFrame frame = new JFrame("PortMainFrame");
            frame.setContentPane(new MainGUI().mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }




}}
