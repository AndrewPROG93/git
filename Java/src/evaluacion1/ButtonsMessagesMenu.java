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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ButtonsMessagesMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_1;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JPanel panel_2;
	private JLabel lblMessage;
	private JTextField txtName;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmHello;
	private JMenuItem mntmKaixo;
	private JMenuItem mntmGoodbye;
	private JMenuItem mntmAgur;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonsMessagesMenu frame = new ButtonsMessagesMenu();
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
	public ButtonsMessagesMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmHello = new JMenuItem("Hello");
		mnFile.add(mntmHello);
		
		mntmKaixo = new JMenuItem("Kaixo");
		mnFile.add(mntmKaixo);
		
		mntmGoodbye = new JMenuItem("Goodbye");
		mnFile.add(mntmGoodbye);
		
		mntmAgur = new JMenuItem("Agur");
		mnFile.add(mntmAgur);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		btn1 = new JButton("Hello");
		panel_1.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("Kaixo");
		panel_1.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("Goodbye");
		panel_1.add(btn3);
		btn3.addActionListener(this);
		
		btn4 = new JButton("Agur");
		panel_1.add(btn4);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		lblMessage = new JLabel("New label");
		panel_2.add(lblMessage);
		
		txtName = new JTextField();
		contentPane.add(txtName, BorderLayout.NORTH);
		txtName.setColumns(10);
        btn4.addActionListener(this);
        
        
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String message = "";
		// Take the text´s button that has been pressed
		// Obtain the button that has been pressed
		Object o = ae.getSource();
		message = o.getClass().getName();
		if (message.equals("javax.swing.JButton")) {
			// Obtain the text of that button and give it to message
			message = ((JButton)o).getText();
		}
		else {
			message = ((JMenuItem)o).getText();
		}
		// Complete the message with the text
		message = message + " " + txtName.getText();
		// Show the message in the label
		lblMessage.setText(message);
		
	}

}
