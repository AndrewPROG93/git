package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

public class WindowThreeButtons extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelbuttons;
	private JLabel lblNumber;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowThreeButtons frame = new WindowThreeButtons();
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
	public WindowThreeButtons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelbuttons = new JPanel();
		contentPane.add(panelbuttons, BorderLayout.NORTH);
		
		lblNumber = new JLabel("No pressed button");
		panelbuttons.add(lblNumber);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		panel_1.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panel_1.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panel_1.add(btn3);
	}

	@Override
	public void actionPerformed (ActionEvent e) {
		// TODO Auto-generated method stub
		
		// Obtain over the component that made the action
		Object o = e.getSource();
		
		String message ="";
		
		//Check that the button has been pressed
		if (o == btn1) {
			message = "The number 1 has been pressed";
		}
		else if (o == btn2) {
			message = "The number 2 has been pressed";
		}
		else if (o == btn3) {
			message = "The number 3 has been pressed";
		}
		lblNumber.setText(message);
	}

}
