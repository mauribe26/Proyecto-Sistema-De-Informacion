package vista;

import java.awt.EventQueue;
import vista.Consultar;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.File;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes"+File.separator+"logan.PNG"));
		frame.setBounds(100, 100, 489, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Consultar miConsulta = new Consultar();
				miConsulta.setVisible(true);
				
				
				
				
			}
		});
		btnConsultar.setBackground(new Color(192, 192, 192));
		btnConsultar.setBounds(196, 89, 91, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnLibroVerde = new JButton("Libro Verde");
		btnLibroVerde.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnLibroVerde.setBackground(new Color(192, 192, 192));
		btnLibroVerde.setBounds(185, 136, 114, 23);
		frame.getContentPane().add(btnLibroVerde);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnSalir.setBackground(new Color(192, 192, 192));
		btnSalir.setBounds(196, 189, 91, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("imagenes"+File.separator+"logan.PNG"));
		lblNewLabel.setBounds(0, 0, 478, 345);
		frame.getContentPane().add(lblNewLabel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
