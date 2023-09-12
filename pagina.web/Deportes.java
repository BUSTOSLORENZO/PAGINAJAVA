package pagina.web;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Deportes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deportes frame = new Deportes();
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
	public Deportes() {
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
		btnNewButton.setIcon(new ImageIcon(Deportes.class.getResource("/com/images/twitter_header_photo_2 (9) (1).jpg")));
		
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
		lblDeportes.setIcon(new ImageIcon(Deportes.class.getResource("/com/images/twitter_header_photo_2 (4) (1).jpg")));
		lblDeportes.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeportes.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblDeportes.setBackground(new Color(128, 128, 128));
		lblDeportes.setBounds(202, 0, 587, 97);
		contentPane.add(lblDeportes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(202, 70, 582, 2);
		contentPane.add(separator_2);
		
		JLabel lblElMundoDel = new JLabel("El mundo del futbol");
		lblElMundoDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElMundoDel.setFont(new Font("Segoe UI", Font.BOLD, 22));
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
		
		JLabel LblNoticiaVarita1 = new JLabel("Se despide Varita\r\n\r\n");
		LblNoticiaVarita1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Varita frame = new Varita();
				frame.setVisible(true);
				dispose();
			}
		});
		LblNoticiaVarita1.setHorizontalTextPosition(SwingConstants.CENTER);
		LblNoticiaVarita1.setHorizontalAlignment(SwingConstants.CENTER);
		LblNoticiaVarita1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		LblNoticiaVarita1.setBounds(0, 140, 164, 75);
		panel_2.add(LblNoticiaVarita1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Varita frame = new Varita();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_5_1_2.setIcon(new ImageIcon(Deportes.class.getResource("/com/images/vartia 1.jpg")));
		lblNewLabel_5_1_2.setBounds(10, 11, 144, 129);
		panel_2.add(lblNewLabel_5_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(209, 11, 164, 215);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Noticiavarita frame = new Noticiavarita();
				frame.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_5_1.setIcon(new ImageIcon(Deportes.class.getResource("/com/images/WhatsApp Image 2023-08-15 at 15.17.53 (1) (1).jpg")));
		lblNewLabel_5_1.setBounds(10, 11, 144, 129);
		panel_2_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8 = new JLabel("Varita al Real Madrid");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Noticiavarita frame = new Noticiavarita();
				frame.setVisible(true);
				dispose();
			}
		});
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
		lblNewLabel_5_1_1.setIcon(new ImageIcon(Deportes.class.getResource("/com/images/ERRE DE PE (1) (1).jpg")));
		lblNewLabel_5_1_1.setBounds(10, 11, 144, 129);
		panel_2_2.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("Pega la vuelta?");
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_9.setBounds(0, 139, 164, 76);
		panel_2_2.add(lblNewLabel_9);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(-53, 237, 640, 2);
		panel_1.add(separator_1_1);
	}
}