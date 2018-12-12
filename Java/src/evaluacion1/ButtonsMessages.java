package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsMessages extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel ClickButton;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JLabel lblMessage;
	private JTextField txtName;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonsMessages frame = new ButtonsMessages();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonsMessages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		ClickButton = new JPanel();
		contentPane.add(ClickButton, BorderLayout.CENTER);
		
		btn1 = new JButton("Hello");
		btn1.addActionListener(this);
		ClickButton.setLayout(new GridLayout(2, 2, 0, 0));
		ClickButton.add(btn1);
		
		btn2 = new JButton("Kaixo");
		btn2.addActionListener(this);
		ClickButton.add(btn2);
		
		btn3 = new JButton("Goodbye");
		btn3.addActionListener(this);
		ClickButton.add(btn3);
		
		btn4 = new JButton("Agur");
		btn4.addActionListener(this);
		ClickButton.add(btn4);

		
		txtName = new JTextField();
		contentPane.add(txtName, BorderLayout.NORTH);
		txtName.setColumns(10);
		
		lblMessage = new JLabel("New label");
		contentPane.add(lblMessage, BorderLayout.SOUTH);
       
        
        
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String message = "";
		// Take the text´s button that has been pressed
		// Obtain the button that has been pressed
		Object o = ae.getSource();
		// Obtain the text of that button and give it to message
		message = ((JButton)o).getText();
		// Complete the message with the text
		message = message + " " + txtName.getText();
		// Show the message in the label
		lblMessage.setText(message);
		
	}

}
