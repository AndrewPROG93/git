package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class WindownHello extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	JPanel panel;
	JPanel panelDatos;
	private JTextField txtNumber;
	private JLabel lblResult;
	private JLabel lblNumber;
	private JPasswordField pwdPassword;
	private JLabel lblPassword;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindownHello frame = new WindownHello();
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
	public WindownHello() {
		setTitle("WindowReadWhole");
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		lblNumber = new JLabel("N\u00FAmero");
		panel.add(lblNumber);
		
		
		
		
		lblResult = new JLabel("It has not been introduced a n\u00FAmero");
		setTitle("HelloWorld");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 131);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		lblResult = new JLabel ("Anonymous");
		lblResult.setFont(new Font ("Tahoma", Font.PLAIN, 18));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblResult, BorderLayout.SOUTH);
		
		panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("User");
		panelDatos.add(lblNewLabel);
			
		txtNumber = new JTextField();
		txtNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtNumber.setText("User");
		txtNumber.setColumns(10);
		txtNumber.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String message;
				message = "The introduced number is the " + txtNumber.getText();
				lblResult.setText(message);
			}
			
		});
		panelDatos.add(txtNumber);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String message;
		message = "The introduced number is the " + txtNumber.getText();
		lblResult.setText(message);
		
		// Check out the user and password
		   String user = txtNumber.getText();
		   String password = new String (pwdPassword.getPassword());
		   if (user.equals("1dw3")&& password.equals("1dw3")) {
			   // If the data is correct
			   message = "Welcome back! " + txtNumber.getText();
		   }
		   else {
		      // If the data is not correct
			   message = "The user or password is incorrect";
		   }
		   lblResult.setText(message);
		   
		}	
		});
		
		lblPassword = new JLabel("Password");
		panelDatos.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		panelDatos.add(pwdPassword);
		
		panelDatos.add(btnOk);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
