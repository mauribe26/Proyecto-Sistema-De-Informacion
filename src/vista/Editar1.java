package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Editar1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar1 frame = new Editar1();
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
	public Editar1() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				int n = JOptionPane.showConfirmDialog( null,"Desea Salir","Desea Salir",JOptionPane.YES_NO_OPTION);
                if(n==0)
                {
                       dispose();
                }
				
				
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 555, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(123, 99, 46, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(241, 96, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setBounds(123, 138, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono");
		lblNewLabel_1.setBounds(123, 178, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 175, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Curso");
		lblNewLabel_2.setBounds(123, 224, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(241, 221, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"T.I", "C.C"}));
		comboBox.setToolTipText("T.I\r\nC.C");
		comboBox.setBounds(241, 134, 46, 22);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(321, 135, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblActualizarAprendiz = new JLabel("Actualizar Aprendiz");
		lblActualizarAprendiz.setForeground(Color.RED);
		lblActualizarAprendiz.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblActualizarAprendiz.setBounds(230, 34, 140, 14);
		contentPane.add(lblActualizarAprendiz);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(241, 276, 91, 23);
		contentPane.add(btnAceptar);
	}
}
