package pagina.web;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import modelo.conexion.Conexion;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;

import javax.swing.JSeparator;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private  JLabel lblNewLabel = new JLabel("New label");
	private JTextField txtApellido;
	private JPasswordField passwordField;
	private JTextField txtNombre;
	private JTextField txtMail;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Conexion cx;
	
	public SignUp() {
		setResizable(false);
		cx=new Conexion	();
		cx.conectar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/com/images/23d5b35d-3035-4862-b285-f458cd9cd462.jpg")));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(491, 0, 293, 461);
		panel.add(lblNewLabel);
		
		JLabel lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrate.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblRegistrate.setBounds(10, 72, 174, 50);
		panel.add(lblRegistrate);
		
		JLabel lblSurname = new JLabel("APELLIDO");
		lblSurname.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSurname.setHorizontalAlignment(SwingConstants.LEFT);
		lblSurname.setBounds(10, 243, 130, 22);
		panel.add(lblSurname);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtApellido.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtApellido.setText("");
			}
		});
		txtApellido.setBorder(null);
		txtApellido.setForeground(new Color(192, 192, 192));
		txtApellido.setText("Ingrese su apellido");
		txtApellido.setBounds(10, 265, 448, 32);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblPassword = new JLabel("CONTRASEÑA");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPassword.setBounds(10, 300, 130, 22);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				passwordField.setText("");
			}
		});
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		passwordField.setForeground(new Color(192, 192, 192));
		passwordField.setBorder(null);
		passwordField.setText("*********");
		passwordField.setBounds(10, 325, 448, 32);
		panel.add(passwordField);
		
		JPanel Registrarse = new JPanel();
		Registrarse.setBackground(new Color(27, 115, 167));
		Registrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Registrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

						String nombre=txtNombre.getText();
						String apellido=txtApellido.getText();
						String email=txtMail.getText();
						String pass=passwordField.getText();
						
						if(nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || pass.isEmpty()) {
							
							JOptionPane.showMessageDialog(null, "ERROR. Debe completar todos los campos");
							
						}else {

								try {
									String query = "INSERT INTO usuarios (nombre_usuario, apellido_usuario, mail_usuario, contrasena_usuario) "
											+ "VALUES ('"+nombre+"', '"+apellido+"', '"+email+"', '"+pass+"');";	
									Statement st=cx.conectar().createStatement();
									st.executeUpdate(query);
									JOptionPane.showMessageDialog(null, "Se registro el usuario correctamente :)");
									Login frame = new Login();
									frame.setVisible(true);
									dispose();
									
								}catch(Exception e1){
									JOptionPane.showMessageDialog(null, "Hubo un error en el sistema, intente nuevamente");
									e1.printStackTrace();
								}
						}
			}
		});
		Registrarse.setBounds(243, 402, 174, 50);
		panel.add(Registrarse);
		Registrarse.setLayout(null);
		
		JLabel lblRegistrarseB = new JLabel("REGISTRARSE");
		lblRegistrarseB.setBounds(0, 0, 174, 50);
		Registrarse.add(lblRegistrarseB);
		lblRegistrarseB.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarseB.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblRegistrarseB.setBackground(new Color(27, 115, 167));
		
		txtNombre = new JTextField();
		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtNombre.setText("");
			}
		});
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtNombre.setText("Ingrese su nombre");
		txtNombre.setForeground(Color.LIGHT_GRAY);
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBounds(10, 205, 448, 32);
		panel.add(txtNombre);
		
		JLabel lblName = new JLabel("NOMBRE");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblName.setBounds(10, 184, 130, 22);
		panel.add(lblName);
		
		txtMail = new JTextField();
		txtMail.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtMail.setText("");
			}
		});
		txtMail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtMail.setText("Ingrese su mail");
		txtMail.setForeground(Color.LIGHT_GRAY);
		txtMail.setColumns(10);
		txtMail.setBorder(null);
		txtMail.setBounds(10, 147, 448, 33);
		panel.add(txtMail);
		
		JLabel lblMail = new JLabel("INGRESE SU MAIL");
		lblMail.setHorizontalAlignment(SwingConstants.LEFT);
		lblMail.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblMail.setBounds(10, 126, 159, 22);
		panel.add(lblMail);
		
		JPanel cancelar = new JPanel();
		cancelar.setLayout(null);
		cancelar.setBackground(new Color(27, 115, 167));
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						Login frame = new Login();
						frame.setVisible(true);
						dispose();
					}
		});
		cancelar.setBounds(26, 402, 174, 50);
		panel.add(cancelar);
		
		JLabel lblCancelar = new JLabel("CANCELAR");
		lblCancelar.setBounds(0, 0, 174, 50);
		cancelar.add(lblCancelar);
		lblCancelar.setBackground(new Color(98, 156, 227));
		
		lblCancelar.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 180, 448, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 240, 448, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 300, 448, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(10, 360, 448, 2);
		panel.add(separator_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 0, 491, 74);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 207, 50);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(SignUp.class.getResource("/com/images/twitter_header_photo_2 (9).jpg")));
		
		JCheckBox mostrarpass = new JCheckBox("Mostrar contrase\u00F1a");
		mostrarpass.setBackground(new Color(255, 255, 255));
		mostrarpass.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange() == ItemEvent.SELECTED) {
                	 passwordField.setEchoChar((char) 0);
                 } else {
                     passwordField.setEchoChar('*');
                 }
             }
         });
		mostrarpass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mostrarpass.setBounds(9, 364, 145, 23);
		panel.add(mostrarpass);
	}
}