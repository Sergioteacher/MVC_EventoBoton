package mvc_EventoBoton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaEventoBoton extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VentanaEventoBoton() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton bBoton = new JButton("Di algo !!!");
		bBoton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(bBoton, BorderLayout.CENTER);
	}

}
