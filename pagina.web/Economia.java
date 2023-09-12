package pagina.web;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JTextArea;

public class Economia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Economia frame = new Economia();
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
	public Economia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 202, 461);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Principal frame = new Principal();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 0, 217, 95);
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\twitter_header_photo_2 (9) (1).jpg"));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-12, 96, 217, 2);
		panel.add(separator);
		separator.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Politica");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Politica frame = new Politica();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setBounds(0, 102, 202, 59);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Economia");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Economia frame = new Economia();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setBounds(0, 172, 202, 59);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(new Color(255, 128, 192));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Esports");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Esports frame = new Esports();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setBounds(4, 242, 202, 59);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBackground(new Color(255, 128, 192));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Deportes");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Deportes frame = new Deportes();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_3.setBounds(0, 312, 202, 59);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_3.setBackground(new Color(255, 128, 192));
		panel.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 393, 206, 2);
		separator_1.setBackground(new Color(0, 0, 0));
		panel.add(separator_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(Economia.class.getResource("/com/images/lupa (1).jpg")));
		lblNewLabel_6.setBounds(119, 405, 45, 45);
		panel.add(lblNewLabel_6);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(101, 393, 1, 900);
		panel.add(separator_3);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon(Economia.class.getResource("/com/images/salir (2).jpg")));
		lblNewLabel_6_1.setBounds(26, 395, 65, 65);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblDeportes = new JLabel("");
		lblDeportes.setIcon(new ImageIcon(Economia.class.getResource("/com/images/twitter_header_photo_2 (12) (1).jpg")));
		lblDeportes.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeportes.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblDeportes.setBackground(new Color(128, 128, 128));
		lblDeportes.setBounds(202, 0, 587, 97);
		contentPane.add(lblDeportes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(202, 70, 582, 2);
		contentPane.add(separator_2);
		
		JLabel lblElMundoDel = new JLabel("La economia en el pais");
		lblElMundoDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElMundoDel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblElMundoDel.setBackground(Color.WHITE);
		lblElMundoDel.setBounds(202, 95, 582, 50);
		contentPane.add(lblElMundoDel);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(202, 146, 582, 12);
		contentPane.add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBackground(new Color(0, 0, 0));
		separator_2_2.setBounds(192, 95, 582, 2);
		contentPane.add(separator_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(202, 156, 587, 305);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 164, 215);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Economia.class.getResource("/com/images/dolar (1).jpg")));
		lblNewLabel_5.setBounds(10, 11, 144, 129);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Cuanto esta el dolar?");
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7.setBounds(0, 140, 164, 75);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(209, 11, 164, 215);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon(Economia.class.getResource("/com/images/inflacion (1).jpg")));
		lblNewLabel_5_1.setBounds(10, 11, 144, 129);
		panel_2_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8 = new JLabel("Inflacion en el pais");
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_8.setBounds(0, 142, 164, 73);
		panel_2_1.add(lblNewLabel_8);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(413, 11, 164, 215);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon(Economia.class.getResource("/com/images/super (1).jpg")));
		lblNewLabel_5_1_1.setBounds(10, 11, 144, 129);
		panel_2_2.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("Acuerdo en los Super");
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_9.setBounds(0, 139, 164, 76);
		panel_2_2.add(lblNewLabel_9);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(-53, 237, 640, 2);
		panel_1.add(separator_1_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI ("https://www.tycsports.com/autor/gaston-edul.html"));
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		lblNewLabel_5_2.setIcon(new ImageIcon(Principal.class.getResource("/com/images/site_image logo ty (1).jpg")));
		lblNewLabel_5_2.setBounds(453, 250, 124, 44);
		panel_1.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("New label");
		lblNewLabel_5_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI ("https://tn.com.ar/"));
				} catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		lblNewLabel_5_2_1.setIcon(new ImageIcon(Principal.class.getResource("/com/images/TN.jpg")));
		lblNewLabel_5_2_1.setBounds(306, 250, 124, 44);
		panel_1.add(lblNewLabel_5_2_1);
		
		JTextArea txtrPropietarioArteGrfico = new JTextArea();
		txtrPropietarioArteGrfico.setText("Propietario Arte Grafico\nEditorial Argentino S.A.1996-2023 VaritaNews.com.ar\nTodos los derechos reservados.");
		txtrPropietarioArteGrfico.setForeground(Color.WHITE);
		txtrPropietarioArteGrfico.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		txtrPropietarioArteGrfico.setBackground(Color.GRAY);
		txtrPropietarioArteGrfico.setBounds(10, 250, 229, 44);
		panel_1.add(txtrPropietarioArteGrfico);
	}
}