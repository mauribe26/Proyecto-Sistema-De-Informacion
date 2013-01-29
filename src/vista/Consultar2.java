package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Consultar2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar2 window = new Consultar2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultar2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("J:\\usb juank\\to\\documentos\\logan.PNG"));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNombre.setBounds(28, 31, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblDocumento.setBounds(28, 56, 62, 14);
		frame.getContentPane().add(lblDocumento);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblCurso.setBounds(28, 81, 46, 14);
		frame.getContentPane().add(lblCurso);
		
		JLabel lblAoDeGraduacion = new JLabel("A\u00F1o de graduacion");
		lblAoDeGraduacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblAoDeGraduacion.setBounds(28, 106, 108, 14);
		frame.getContentPane().add(lblAoDeGraduacion);
		
		textField = new JTextField();
		textField.setBounds(148, 29, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 54, 108, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 79, 108, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 104, 108, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegresarAlInicio = new JButton("Regresar al inicio");
		btnRegresarAlInicio.setBounds(152, 176, 134, 23);
		frame.getContentPane().add(btnRegresarAlInicio);
	}

}
