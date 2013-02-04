package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Editar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar frame = new Editar();
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
	public Editar() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				int n = JOptionPane.showConfirmDialog( null,"Desea Salir","Desea Salir",JOptionPane.YES_NO_OPTION);
                if(n==0)
                {
                       dispose();
                }
				
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(25, 63, 72, 14);
		contentPane.add(lblDocumento);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			Editar1 miEdito = new Editar1();
			miEdito.setVisible(true);
			hide();
			}
		});
		btnNewButton.setBounds(128, 114, 91, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(133, 60, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
