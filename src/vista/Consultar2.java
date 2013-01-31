package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Consultar2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar2 frame = new Consultar2();
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
	public Consultar2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDelCurso = new JLabel("Nombre del curso");
		lblNombreDelCurso.setBounds(27, 40, 110, 14);
		contentPane.add(lblNombreDelCurso);
		
		textField = new JTextField();
		textField.setBounds(137, 37, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeroDeFicha = new JLabel("Numero de ficha");
		lblNumeroDeFicha.setBounds(306, 40, 110, 14);
		contentPane.add(lblNumeroDeFicha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(406, 37, 99, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegresarAlInicio = new JButton("Regresar al inicio");
		btnRegresarAlInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inicio miInicio = new Inicio();
				miInicio.setVisible(true);
				hide();
				
				
			}
		});
		btnRegresarAlInicio.setBounds(240, 383, 161, 23);
		contentPane.add(btnRegresarAlInicio);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre", "Documento", "Descripcion"},
				{"Dahian Tabares Hortua", "1094945447", "No aprobado"},
				{"Sebastian toro", "1097486528", "Aprobado"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Documento", "Descripcion"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.setBounds(69, 96, 459, 240);
		contentPane.add(table);
	}

}
