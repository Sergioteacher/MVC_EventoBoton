package mvc_EventoBoton;

import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


/**
 * Clase del interfaz gráfico
 * @author Sergio Teacher
 *
 */
public class VentanaEventoBoton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * El "botón"  centro del proyecto.
	 */
	private JButton bBoton;
	private JLabel lblHola;
	//Usado como ensayo
	//private Integer conta;

	/**
	 * Creado el frame principal.
	 */
	public VentanaEventoBoton() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//conta=0;
		setBounds(100, 100, 260, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setbBoton(new JButton("Di algo !!!"));
		/*
		bBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conta++;
				lblHola.setText("Hola "+ conta.toString()   +" veces");
				System.out.println("Hola "+ conta.toString()   +" veces");
			}
		});
		*/
		getbBoton().setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(getbBoton(), BorderLayout.CENTER);
		
		setLblHola(new JLabel("Hola"));
		getLblHola().setHorizontalAlignment(SwingConstants.CENTER);
		getLblHola().setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(getLblHola(), BorderLayout.NORTH);
	}

	public JButton getbBoton() {
		return bBoton;
	}

	public void setbBoton(JButton bBoton) {
		this.bBoton = bBoton;
	}

	public JLabel getLblHola() {
		return lblHola;
	}

	public void setLblHola(JLabel lblHola) {
		this.lblHola = lblHola;
	}

}
