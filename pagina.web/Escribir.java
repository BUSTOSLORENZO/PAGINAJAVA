package pagina.web;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.conexion.Conexion;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Escribir extends JFrame {

	private JPanel contentPane;
	private JTextField txttitle;
	private JTextField txtcop;
	private JTextField txtimg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escribir frame = new Escribir();
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
	Conexion cx;
	
	public Escribir() {
		setResizable(false);
		cx=new Conexion	();
		cx.conectar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcat = new JLabel("SELECCIONE LA CATEGORIA DE LA NOTICIA");
		lblcat.setHorizontalAlignment(SwingConstants.LEFT);
		lblcat.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblcat.setBounds(10, 81, 360, 22);
		contentPane.add(lblcat);
		
		JComboBox racing = new JComboBox();
		racing.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Deportes", "Politica", "Esports", "Economia"}));
		racing.setForeground(Color.BLACK);
		racing.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		racing.setBackground(new Color(64, 189, 225));
		racing.setBounds(380, 80, 130, 30);
		contentPane.add(racing);
		
		JLabel lblarticulo = new JLabel("INGRESE EL TITULO DEL ARTICULO\r\n");
		lblarticulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblarticulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblarticulo.setBounds(10, 114, 518, 22);
		contentPane.add(lblarticulo);
		
		txttitle = new JTextField();
		txttitle.setText("Ingrese su el titulo del articulo");
		txttitle.setForeground(Color.LIGHT_GRAY);
		txttitle.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txttitle.setColumns(10);
		txttitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txttitle.setText("");
			}
		});
		txttitle.setBorder(null);
		txttitle.setBounds(10, 142, 500, 30);
		contentPane.add(txttitle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 178, 500, 2);
		contentPane.add(separator_1);
		
		JLabel lblcop = new JLabel("INGRESE EL COPETE DEL ARTICULO\r\n");
		lblcop.setHorizontalAlignment(SwingConstants.LEFT);
		lblcop.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblcop.setBounds(10, 183, 518, 22);
		contentPane.add(lblcop);
		
		txtcop = new JTextField();
		txtcop.setText("Ingrese su el copete del articulo");
		txtcop.setForeground(Color.LIGHT_GRAY);
		txtcop.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtcop.setColumns(10);
		txtcop.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtcop.setText("");
			}
		});
		txtcop.setBorder(null);
		txtcop.setBounds(10, 210, 500, 30);
		contentPane.add(txtcop);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(10, 245, 500, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblcuerpo = new JLabel("INGRESE EL CUERPO DEL ARTICULO\r\n");
		lblcuerpo.setHorizontalAlignment(SwingConstants.LEFT);
		lblcuerpo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblcuerpo.setBounds(10, 251, 518, 22);
		contentPane.add(lblcuerpo);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(10, 395, 500, 2);
		contentPane.add(separator_1_1_1);
		
        JTextArea textArea = new JTextArea();
        textArea.setForeground(new Color(192, 192, 192));
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Texto ingresado: " + textArea.getText());
                
            }
        });

        JScrollPane scrollPane = new JScrollPane(textArea); // Agregar el JTextArea al JScrollPane

        scrollPane.setBounds(10, 280, 500, 110); // Establecer las dimensiones del JScrollPane
        contentPane.add(scrollPane);
        
        JLabel lblimg = new JLabel("INGRESAR LINK DE IMAGEN");
        lblimg.setHorizontalAlignment(SwingConstants.LEFT);
        lblimg.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblimg.setBounds(10, 11, 518, 22);
        contentPane.add(lblimg);
        
        txtimg = new JTextField();
        txtimg.setText("Ingrese el link de la foto del articulo");
        txtimg.setForeground(Color.LIGHT_GRAY);
        txtimg.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtimg.setText("");
			}
		});
        txtimg.setColumns(10);
        txtimg.setBorder(null);
        txtimg.setBounds(10, 40, 500, 30);
        contentPane.add(txtimg);
        
        JSeparator separator_1_2 = new JSeparator();
        separator_1_2.setForeground(Color.BLACK);
        separator_1_2.setBounds(10, 74, 500, 2);
        contentPane.add(separator_1_2);
        
        JPanel subir = new JPanel();
        subir.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {		
				String imagen=txtimg.getText();
				String cuerpo=textArea.getText();
				String copete=txtcop.getText();
				String titulo=txttitle.getText();
				String categoria=racing.getSelectedItem().toString();
				
				if(imagen.isEmpty() || cuerpo.isEmpty() || copete.isEmpty() || titulo.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "ERROR. Debe completar todos los campos");
					
				}else {
					if(categoria.equalsIgnoreCase("Seleccionar")) {							
						
						JOptionPane.showMessageDialog(null, "ERROR. Debe seleccionar un tipo de usuario");
						
					}
					else {
						try {
							String query = "INSERT INTO noticias (titulo, fecha_publicacion, seccion, img, cuerpo, copete) "
									+ "VALUES ('"+titulo+"', CURDATE(), '"+categoria+"', '"+imagen+"', '"+cuerpo+"', '"+copete+"');";	
							Statement st=cx.conectar().createStatement();
							st.executeUpdate(query);
							JOptionPane.showMessageDialog(null, "Se subio la noticia correctamente :)");
							
						}catch(Exception e1){
							JOptionPane.showMessageDialog(null, "Hubo un error en el sistema, intente nuevamente");
							e1.printStackTrace();
						}
						
		        		txtimg.setText("");
						textArea.setText("");
						txtcop.setText("");
						txttitle.setText("");	
					}
				}
        	}
        });
        subir.setLayout(null);
        subir.setBackground(new Color(27, 115, 167));
        subir.setBounds(70, 407, 150, 43);
        contentPane.add(subir);
        
        JLabel lblNewLabel_5_1 = new JLabel("SUBIR");
        lblNewLabel_5_1.setBounds(0, 0, 150, 43);
        subir.add(lblNewLabel_5_1);
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblNewLabel_5_1.setBackground(new Color(38, 123, 155));
        
        JPanel volver = new JPanel();
        volver.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
        	}
        });
        volver.setLayout(null);
        volver.setBackground(new Color(27, 115, 167));
        volver.setBounds(300, 407, 150, 43);
        contentPane.add(volver);
        
        JLabel lblNewLabel_5 = new JLabel("VOLVER\r\n");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblNewLabel_5.setBackground(new Color(38, 123, 155));
        lblNewLabel_5.setBounds(0, 0, 150, 43);
        volver.add(lblNewLabel_5);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Escribir.class.getResource("/com/images/escribir (1).jpg")));
        lblNewLabel.setBounds(533, 0, 251, 461);
        contentPane.add(lblNewLabel);
		
	}
}
package pagina.web;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.conexion.Conexion;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Escribir extends JFrame {

	private JPanel contentPane;
	private JTextField txttitle;
	private JTextField txtcop;
	private JTextField txtimg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escribir frame = new Escribir();
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
	Conexion cx;
	
	public Escribir() {
		setResizable(false);
		cx=new Conexion	();
		cx.conectar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcat = new JLabel("SELECCIONE LA CATEGORIA DE LA NOTICIA");
		lblcat.setHorizontalAlignment(SwingConstants.LEFT);
		lblcat.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblcat.setBounds(10, 81, 360, 22);
		contentPane.add(lblcat);
		
		JComboBox racing = new JComboBox();
		racing.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Deportes", "Politica", "Esports", "Economia"}));
		racing.setForeground(Color.BLACK);
		racing.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		racing.setBackground(new Color(64, 189, 225));
		racing.setBounds(380, 80, 130, 30);
		contentPane.add(racing);
		
		JLabel lblarticulo = new JLabel("INGRESE EL TITULO DEL ARTICULO\r\n");
		lblarticulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblarticulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblarticulo.setBounds(10, 114, 518, 22);
		contentPane.add(lblarticulo);
		
		txttitle = new JTextField();
		txttitle.setText("Ingrese su el titulo del articulo");
		txttitle.setForeground(Color.LIGHT_GRAY);
		txttitle.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txttitle.setColumns(10);
		txttitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txttitle.setText("");
			}
		});
		txttitle.setBorder(null);
		txttitle.setBounds(10, 142, 500, 30);
		contentPane.add(txttitle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 178, 500, 2);
		contentPane.add(separator_1);
		
		JLabel lblcop = new JLabel("INGRESE EL COPETE DEL ARTICULO\r\n");
		lblcop.setHorizontalAlignment(SwingConstants.LEFT);
		lblcop.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblcop.setBounds(10, 183, 518, 22);
		contentPane.add(lblcop);
		
		txtcop = new JTextField();
		txtcop.setText("Ingrese su el copete del articulo");
		txtcop.setForeground(Color.LIGHT_GRAY);
		txtcop.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtcop.setColumns(10);
		txtcop.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtcop.setText("");
			}
		});
		txtcop.setBorder(null);
		txtcop.setBounds(10, 210, 500, 30);
		contentPane.add(txtcop);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(10, 245, 500, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblcuerpo = new JLabel("INGRESE EL CUERPO DEL ARTICULO\r\n");
		lblcuerpo.setHorizontalAlignment(SwingConstants.LEFT);
		lblcuerpo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblcuerpo.setBounds(10, 251, 518, 22);
		contentPane.add(lblcuerpo);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(10, 395, 500, 2);
		contentPane.add(separator_1_1_1);
		
        JTextArea textArea = new JTextArea();
        textArea.setForeground(new Color(192, 192, 192));
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Texto ingresado: " + textArea.getText());
                
            }
        });

        JScrollPane scrollPane = new JScrollPane(textArea); // Agregar el JTextArea al JScrollPane

        scrollPane.setBounds(10, 280, 500, 110); // Establecer las dimensiones del JScrollPane
        contentPane.add(scrollPane);
        
        JLabel lblimg = new JLabel("INGRESAR LINK DE IMAGEN");
        lblimg.setHorizontalAlignment(SwingConstants.LEFT);
        lblimg.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblimg.setBounds(10, 11, 518, 22);
        contentPane.add(lblimg);
        
        txtimg = new JTextField();
        txtimg.setText("Ingrese el link de la foto del articulo");
        txtimg.setForeground(Color.LIGHT_GRAY);
        txtimg.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				txtimg.setText("");
			}
		});
        txtimg.setColumns(10);
        txtimg.setBorder(null);
        txtimg.setBounds(10, 40, 500, 30);
        contentPane.add(txtimg);
        
        JSeparator separator_1_2 = new JSeparator();
        separator_1_2.setForeground(Color.BLACK);
        separator_1_2.setBounds(10, 74, 500, 2);
        contentPane.add(separator_1_2);
        
        JPanel subir = new JPanel();
        subir.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {		
				String imagen=txtimg.getText();
				String cuerpo=textArea.getText();
				String copete=txtcop.getText();
				String titulo=txttitle.getText();
				String categoria=racing.getSelectedItem().toString();
				
				if(imagen.isEmpty() || cuerpo.isEmpty() || copete.isEmpty() || titulo.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "ERROR. Debe completar todos los campos");
					
				}else {
					if(categoria.equalsIgnoreCase("Seleccionar")) {							
						
						JOptionPane.showMessageDialog(null, "ERROR. Debe seleccionar un tipo de usuario");
						
					}
					else {
						try {
							String query = "INSERT INTO noticias (titulo, fecha_publicacion, seccion, img, cuerpo, copete) "
									+ "VALUES ('"+titulo+"', CURDATE(), '"+categoria+"', '"+imagen+"', '"+cuerpo+"', '"+copete+"');";	
							Statement st=cx.conectar().createStatement();
							st.executeUpdate(query);
							JOptionPane.showMessageDialog(null, "Se subio la noticia correctamente :)");
							
						}catch(Exception e1){
							JOptionPane.showMessageDialog(null, "Hubo un error en el sistema, intente nuevamente");
							e1.printStackTrace();
						}
						
		        		txtimg.setText("");
						textArea.setText("");
						txtcop.setText("");
						txttitle.setText("");	
					}
				}
        	}
        });
        subir.setLayout(null);
        subir.setBackground(new Color(27, 115, 167));
        subir.setBounds(70, 407, 150, 43);
        contentPane.add(subir);
        
        JLabel lblNewLabel_5_1 = new JLabel("SUBIR");
        lblNewLabel_5_1.setBounds(0, 0, 150, 43);
        subir.add(lblNewLabel_5_1);
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5_1.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblNewLabel_5_1.setBackground(new Color(38, 123, 155));
        
        JPanel volver = new JPanel();
        volver.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
        	}
        });
        volver.setLayout(null);
        volver.setBackground(new Color(27, 115, 167));
        volver.setBounds(300, 407, 150, 43);
        contentPane.add(volver);
        
        JLabel lblNewLabel_5 = new JLabel("VOLVER\r\n");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblNewLabel_5.setBackground(new Color(38, 123, 155));
        lblNewLabel_5.setBounds(0, 0, 150, 43);
        volver.add(lblNewLabel_5);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Escribir.class.getResource("/com/images/escribir (1).jpg")));
        lblNewLabel.setBounds(533, 0, 251, 461);
        contentPane.add(lblNewLabel);
		
	}
}
