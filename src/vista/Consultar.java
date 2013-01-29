package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Consultar {

	private JFrame Consultar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar window = new Consultar();
					window.Consultar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Consultar = new JFrame();
		Consultar.getContentPane().setBackground(new Color(255, 255, 255));
		Consultar.setTitle("Consultar");
		Consultar.setBounds(100, 100, 450, 300);
		Consultar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Consultar.getContentPane().setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDocumento.setBounds(28, 57, 86, 18);
		Consultar.getContentPane().add(lblDocumento);
		
		textField = new JTextField();
		textField.setBounds(116, 58, 91, 20);
		Consultar.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnAceptar.setBounds(172, 134, 91, 23);
		Consultar.getContentPane().add(btnAceptar);
	}

}
