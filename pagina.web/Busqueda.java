package pagina.web;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Busqueda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Busqueda frame = new Busqueda();
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
	public Busqueda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 203, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 202, 461);
		panel.add(panel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(Busqueda.class.getResource("/com/images/twitter_header_photo_2 (9) (1).jpg")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(0, 0, 217, 92);
		panel_1.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(-12, 96, 217, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel = new JLabel("Politica");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 102, 202, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Economia");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(new Color(255, 128, 192));
		lblNewLabel_1.setBounds(0, 172, 202, 59);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Esports");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_2.setBackground(new Color(255, 128, 192));
		lblNewLabel_2.setBounds(4, 242, 202, 59);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Deportes");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_3.setBackground(new Color(255, 128, 192));
		lblNewLabel_3.setBounds(0, 312, 202, 59);
		panel_1.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 393, 206, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_4 = new JLabel("BUSQUEDA...");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setBounds(0, 409, 147, 52);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(146, 409, 56, 52);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(202, 0, 582, 461);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Busqueda.class.getResource("/com/images/busqueda.jpg")));
		lblNewLabel_5.setBounds(0, 0, 582, 97);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("BUSQUE SU NOTICIA:");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(148, 99, 289, 71);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setToolTipText("");
		panel_3.setBounds(10, 167, 562, 51);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btnNewButton_1.setBounds(453, 11, 88, 29);
		panel_3.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(85, 13, 349, 25);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Descripcion:\r\n");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 13, 65, 25);
		panel_3.add(lblNewLabel_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 229, 562, 221);
		panel_2.add(panel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(464, 121, 89, 29);
		panel_2.add(comboBox);
	}
}
