import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

	public class LogIn {
	
		private JFrame login;
		private JFrame frmLogIn;
		private JTextField textFieldPass;
		private JTextField textFieldUser;
	
		String checkUsername;
		String checkPass;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private String message1() {
		String message1 = "  Username does not exist!";
		return message1;
	}
	
	private String message2() {
		String message2 = "    Incorrect password!";
		return message2;
	}
	
	private String message3() {
		String message3 = "       Welcome back.";
		return message3;
	}
	
	private String message4() {
		String message4 = "     Try again.";
		return message4;
	}
	
	private String message5() {
		String message4 = "You should enter user1 for Username and emirko for Password.";
		return message4;
	}
	
	
	public LogIn() {
		initialize();
	}

	
	private void initialize() {
		
		frmLogIn = new JFrame();
		frmLogIn.setTitle("*** LOG IN ***");
		frmLogIn.setBounds(500, 250, 351, 287);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		
		JLabel lblEnterYourUsername = new JLabel("Enter your username & password");
		lblEnterYourUsername.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEnterYourUsername.setBounds(29, 22, 282, 15);
		frmLogIn.getContentPane().add(lblEnterYourUsername);
		
		JLabel labelPassword = new JLabel("Password :");
		labelPassword.setBounds(36, 131, 101, 15);
		frmLogIn.getContentPane().add(labelPassword);
		
		textFieldPass = new JTextField();
		textFieldPass.setBounds(155, 131, 156, 19);
		frmLogIn.getContentPane().add(textFieldPass);
		textFieldPass.setColumns(10);
		
		JLabel labelUsername = new JLabel("Username :");
		labelUsername.setBounds(36, 72, 101, 15);
		frmLogIn.getContentPane().add(labelUsername);
		
		textFieldUser = new JTextField();
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(155, 72, 156, 19);
		frmLogIn.getContentPane().add(textFieldUser);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
				Account account = new Account();
				
				if (textFieldUser.getText().equals(account.getUsername())) {
					
				}
				
				else {
					JOptionPane.showMessageDialog(login, message1());
					return;
				}
				
				if (textFieldPass.getText().equals(account.getPassword())) {
					JOptionPane.showMessageDialog(login, message3());
				}
				
				else {
					JOptionPane.showMessageDialog(login, message2());
				}
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(login, message4());
					
				}
			}
		});
		
		btnLogIn.setBounds(112, 181, 114, 25);
		frmLogIn.getContentPane().add(btnLogIn);
		
		JMenuBar menuBar = new JMenuBar();
		frmLogIn.setJMenuBar(menuBar);
		
		JMenu mnHelp = new JMenu("More");
		menuBar.add(mnHelp);
		
		JMenuItem mntmEnter = new JMenuItem("Help");
		mntmEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(login, message5());
				
			}
		});
		mnHelp.add(mntmEnter);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnHelp.add(mntmExit);
	}
		private static void addPopup(Component component, final JPopupMenu popup) {
			component.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					if (e.isPopupTrigger()) {
						showMenu(e);
					}
				}
				public void mouseReleased(MouseEvent e) {
					if (e.isPopupTrigger()) {
						showMenu(e);
					}
				}
				private void showMenu(MouseEvent e) {
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			});
		}
}
