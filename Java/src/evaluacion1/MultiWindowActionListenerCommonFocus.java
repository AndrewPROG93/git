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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MultiWindowActionListenerCommonFocus extends JFrame implements ActionListener {

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
	public MultiWindowActionListenerCommonFocus() {
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
		txtNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtNumber.select(0, txtNumber.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		txtNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtNumber.setText("User");
		txtNumber.setColumns(10);
		txtNumber.addActionListener(this);
		panelDatos.add(txtNumber);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		
		lblPassword = new JLabel("Password");
		panelDatos.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addActionListener(this);
		pwdPassword.setText("Password");
		panelDatos.add(pwdPassword);
		
		panelDatos.add(btnOk);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message;
		message = "The introduced number is the " + txtNumber.getText();
		lblResult.setText(message);
		
		// Check out the user and password
		   String user = txtNumber.getText();
		   String password = new String (pwdPassword.getPassword());
		   if (user.equals("1dw3")&& password.equals("1dw3")) {
			   // If the data is correct
			   // Create a main window
			   WindownHello vh = new WindownHello();
			   // Change the title
			   vh.setTitle ("Welcome " + user);
			   // Show it
			   vh.setVisible(true);
			   // Hide the starting window
			   // this.setVisibile(false);
			   // Erase it from memory
			   this.dispose ();
		   }
		   else {
		      // If the data is not correct
			   message = "The user or password is incorrect";
		   }
		   lblResult.setText(message);
		   
		}	
		
	}


