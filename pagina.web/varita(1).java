package pagina.web;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URL;

public class Varita extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Varita frame = new Varita();
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
	public Varita() {
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
		btnNewButton.setBounds(0, 0, 217, 85);
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\twitter_header_photo_2 (9).jpg"));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-12, 96, 217, 2);
		panel.add(separator);
		separator.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Politica");
		lblNewLabel.setBounds(0, 102, 202, 59);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Economia");
		lblNewLabel_1.setBounds(0, 172, 202, 59);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(new Color(255, 128, 192));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Esports");
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
		
		JLabel lblNewLabel_4 = new JLabel("BUSQUEDA...");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(0, 409, 147, 52);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Tita\\Downloads\\lupeta (1).jpg"));
		lblNewLabel_6.setBounds(146, 409, 56, 52);
		panel.add(lblNewLabel_6);
		
		JLabel lblDeportes = new JLabel("");
		lblDeportes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Deportes frame = new Deportes();
				frame.setVisible(true);
				dispose();
			}
		});
		lblDeportes.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\twitter_header_photo_2 (4).jpg"));
		lblDeportes.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeportes.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblDeportes.setBackground(new Color(128, 128, 128));
		lblDeportes.setBounds(202, 0, 587, 97);
		contentPane.add(lblDeportes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(202, 70, 582, 2);
		contentPane.add(separator_2);
		
		JLabel lblElMundoDel = new JLabel("Ultimo partido de \"Varita\" con AAAJ");
		lblElMundoDel.setForeground(new Color(255, 255, 255));
		lblElMundoDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElMundoDel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblElMundoDel.setBackground(Color.WHITE);
		lblElMundoDel.setBounds(202, 95, 365, 50);
		contentPane.add(lblElMundoDel);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(202, 146, 582, 12);
		contentPane.add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBackground(new Color(0, 0, 0));
		separator_2_2.setBounds(192, 95, 582, 2);

         
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(202, 156, 587, 305);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(-53, 237, 640, 2);
		panel_1.add(separator_1_1);
		
		JTextArea txtrPropietarioArteGrfico = new JTextArea();
		txtrPropietarioArteGrfico.setBackground(new Color(128, 128, 128));
		txtrPropietarioArteGrfico.setForeground(new Color(255, 255, 255));
		txtrPropietarioArteGrfico.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		txtrPropietarioArteGrfico.setText("Propietario Arte Grafico\nEditorial Argentino S.A.1996-2023 VaritaNews.com.ar\nTodos los derechos reservados.");
		txtrPropietarioArteGrfico.setBounds(10, 250, 229, 44);
		panel_1.add(txtrPropietarioArteGrfico);
		
		JTextArea txtrSss = new JTextArea();
		txtrSss.setFont(new Font("Segoe UI", Font.BOLD, 10));
		txtrSss.setBackground(new Color(128, 128, 128));
		txtrSss.setForeground(new Color(255, 255, 255));
		txtrSss.setText("Redes Sociales del periodista:");
		txtrSss.setBounds(249, 237, 182, 18);
		panel_1.add(txtrSss);
		
		JTextArea txtrSss_1 = new JTextArea();
		txtrSss_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		txtrSss_1.setBackground(new Color(128, 128, 128));
		txtrSss_1.setForeground(new Color(255, 255, 255));
		txtrSss_1.setText("https://twitter.com/gastonedul\nhttps://www.instagram.com/gastonedul\nhttps://www.twitch.tv/gastonedul");
		txtrSss_1.setBounds(249, 252, 194, 50);
		panel_1.add(txtrSss_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Varita.class.getResource("/com/images/vartia 1.jpg")));
		lblNewLabel_5.setBounds(10, 0, 150, 132);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon(Varita.class.getResource("/com/images/varita 2.jpg")));
		lblNewLabel_5_1.setBounds(222, 0, 150, 132);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1.setIcon(new ImageIcon(Varita.class.getResource("/com/images/varita 3.jpg")));
		lblNewLabel_5_1_1.setBounds(427, 0, 150, 132);
		panel_1.add(lblNewLabel_5_1_1);
		
		JTextArea txtrSss_2 = new JTextArea();
		txtrSss_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtrSss_2.setBackground(new Color(128, 128, 128));
		txtrSss_2.setForeground(new Color(255, 255, 255));
		txtrSss_2.setText("Estas son algunas de las images del ultimo encuentro de Tiago Digon\nantes de partir hacai españa. El bicho gano el encuentro 4-1\ncon 2 tantos del pivot y se despide con su publico ganando los 3 puntos\npara el equipo de la paternal");
		txtrSss_2.setBounds(10, 143, 392, 83);
		panel_1.add(txtrSss_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI ("https://argentinosjuniors.com.ar/"));
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(Varita.class.getResource("/com/images/argentinos-juniors-logo-.jpg")));
		lblNewLabel_7.setBounds(503, 247, 55, 55);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblGastonEdul = new JLabel("Gaston Edul - 26/08/2023");
		lblGastonEdul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI ("https://www.tycsports.com/autor/gaston-edul.html"));
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		lblGastonEdul.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastonEdul.setForeground(Color.WHITE);
		lblGastonEdul.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblGastonEdul.setBackground(Color.WHITE);
		lblGastonEdul.setBounds(555, 97, 258, 50);
		contentPane.add(lblGastonEdul);
	}
}