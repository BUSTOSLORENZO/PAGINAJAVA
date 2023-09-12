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
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class Login extends JFrame {
	
	private JPanel contentPane;
	private final JLabel ImagenFondo = new JLabel("New label");
	private JTextField IngresarMail;
	private JPasswordField IngresarPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Conexion cx;
	
	/*public usuario() {
		int usuario = ;
		
		return usuario;
	}*/
	
	public Login() {
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
		ImagenFondo.setIcon(new ImageIcon(Login.class.getResource("/com/images/23d5b35d-3035-4862-b285-f458cd9cd462.jpg")));
		ImagenFondo.setForeground(new Color(0, 128, 0));
		ImagenFondo.setBackground(new Color(0, 0, 0));
		ImagenFondo.setBounds(481, 0, 293, 461);
		panel.add(ImagenFondo);
		
		JLabel InicioSesion = new JLabel("Iniciar sesi\u00F3n\r\n");
		InicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		InicioSesion.setFont(new Font("Segoe UI", Font.BOLD, 24));
		InicioSesion.setBounds(10, 79, 174, 50);
		panel.add(InicioSesion);
		
		JLabel Usuario = new JLabel("USUARIO");
		Usuario.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Usuario.setHorizontalAlignment(SwingConstants.LEFT);
		Usuario.setBounds(10, 181, 130, 22);
		panel.add(Usuario);
		
		IngresarMail = new JTextField();
		IngresarMail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		IngresarMail.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				IngresarMail.setText("");
			}
		});
		IngresarMail.setBorder(null);
		IngresarMail.setForeground(new Color(192, 192, 192));
		IngresarMail.setText("Ingrese su nombre de ususario");
		IngresarMail.setBounds(10, 214, 448, 30);
		panel.add(IngresarMail);
		IngresarMail.setColumns(10);
		
		JLabel Password = new JLabel("CONTRASEÑA");
		Password.setHorizontalAlignment(SwingConstants.LEFT);
		Password.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Password.setBounds(10, 255, 130, 22);
		panel.add(Password);
		
		IngresarPassword = new JPasswordField();
		IngresarPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				IngresarPassword.setText("");
			}
		});
		IngresarPassword.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		IngresarPassword.setBorder(null);
		IngresarPassword.setForeground(new Color(192, 192, 192));
		IngresarPassword.setText("*********");
		IngresarPassword.setBounds(10, 286, 448, 30);
		panel.add(IngresarPassword);
		
		JComboBox racing = new JComboBox();
		racing.setBackground(new Color(64, 189, 225));
		racing.setForeground(new Color(0, 0, 0));
		racing.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		racing.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Escritor", "Lector"}));
		racing.setBounds(315, 135, 143, 30);
		panel.add(racing);
		
		JPanel LogIn = new JPanel();
		LogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tipousuario=racing.getSelectedItem().toString();
				String user = IngresarMail.getText();
				String password = String.valueOf(IngresarPassword.getPassword());
				
				if(user.isEmpty() || password.isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "ERROR. Debe completar todos los campos");
						
				}else {
					if(tipousuario.equalsIgnoreCase("Seleccionar")) {							
						
						JOptionPane.showMessageDialog(null, "ERROR. Debe seleccionar un tipo de usuario");
						
					}if (tipousuario.equalsIgnoreCase("Escritor")){
						try {
						String query = "SELECT * FROM escritor WHERE mail_escritor ='"+user+"' and contrasena_escritor ='"+password+"'";
						Statement st=cx.conectar().createStatement();
						ResultSet rs = st.executeQuery(query);
	
							if(rs.next()) {
								//System.out.println("BIEN");
								Escribir frame = new Escribir();
								frame.setVisible(true);
								dispose();
								JOptionPane.showMessageDialog(null, "BIENVENIDO, ESCRIBA UN ARTICULO");
							}
							else {
								//System.out.println("MAL");
								JOptionPane.showMessageDialog(null, "ERROR. El escritor no esta registrado");
							}
							
							}catch(Exception e1){
								JOptionPane.showMessageDialog(null, "Hubo un error en el sistema, intente nuevamente");
								e1.printStackTrace();
							}
						
						}if (tipousuario.equalsIgnoreCase("Lector")){
							try {
								String query = "SELECT * FROM usuarios WHERE mail_usuario ='"+user+"' and contrasena_usuario ='"+password+"'";
								Statement st=cx.conectar().createStatement();
								ResultSet rs = st.executeQuery(query);
								
								System.out.println(st);
								
								if(rs.next()) {
									//System.out.println("BIEN");
									Principal frame = new Principal();
									frame.setVisible(true);
									dispose();
									JOptionPane.showMessageDialog(null, "BIENVENIDO A VARITA NEWS");
								}
								else {
									//System.out.println("MAL");
									JOptionPane.showMessageDialog(null, "ERROR. El usuario no esta registrado");
								}
							}catch(Exception e1){
								JOptionPane.showMessageDialog(null, "Hubo un error en el sistema, intente nuevamente");
								e1.printStackTrace();
							}
							
						}
						
					}

			}
		});
		LogIn.setBackground(new Color(27, 115, 167));
		LogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LogIn.setBounds(161, 355, 150, 43);
		panel.add(LogIn);
		LogIn.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("LOGIN\r\n");
		lblNewLabel_5.setBounds(0, 0, 150, 43);
		LogIn.add(lblNewLabel_5);
		lblNewLabel_5.setBackground(new Color(38, 123, 155));
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel SignUp = new JPanel();
		SignUp.setBackground(new Color(38, 123, 155));
		SignUp.setBounds(103, 408, 264, 30);
		SignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						//System.out.println("BIEN");
						SignUp frame = new SignUp();
						frame.setVisible(true);
						dispose();
					}
		});
		SignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(SignUp);
		
		JLabel Registrarse = new JLabel("No tenes cuenta? Registrate");
		SignUp.add(Registrarse);
		Registrarse.setHorizontalAlignment(SwingConstants.CENTER);
		Registrarse.setFont(new Font("Roboto Black", Font.PLAIN, 16));
		
		JLabel lblSeleccioneElTipo = new JLabel("SELECCIONE EL TIPO DE USUARIO");
		lblSeleccioneElTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccioneElTipo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSeleccioneElTipo.setBounds(10, 143, 264, 22);
		panel.add(lblSeleccioneElTipo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 242, 1, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(10, 247, 448, 2);
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(10, 321, 448, 2);
		panel.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(10, 176, 448, 2);
		panel.add(separator_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 0, 482, 73);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Logo = new JLabel("New label");
		Logo.setBounds(10, 11, 210, 50);
		panel_1.add(Logo);
		Logo.setIcon(new ImageIcon(Login.class.getResource("/com/images/twitter_header_photo_2 (9).jpg")));
		
		JCheckBox mostrarpass = new JCheckBox("Mostrar contrase\u00F1a");
		mostrarpass.setBackground(new Color(255, 255, 255));
		mostrarpass.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange() == ItemEvent.SELECTED) {
                	 IngresarPassword.setEchoChar((char) 0);
                 } else {
                     IngresarPassword.setEchoChar('*');
                 }
             }
         });
		mostrarpass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mostrarpass.setBounds(9, 323, 145, 23);
		panel.add(mostrarpass);
		
		
		
	}
}