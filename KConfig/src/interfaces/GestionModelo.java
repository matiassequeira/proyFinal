package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionModelo extends JPanel {

	/**
	 * Create the panel.
	 */
	public GestionModelo() {
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(147,45,293,196);
		add(textArea);
		
		JList list = new JList();
		list.setToolTipText("");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(23, 49, 111, 196);
		add(list);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAgregar.setBounds(23, 256, 59, 23);
		add(btnAgregar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(23, 35, 114, 14);
		add(lblNombre);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton.setBounds(92, 256, 59, 23);
		add(btnNewButton);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(351, 255, 89, 23);
		add(btnCorrer);

	}
}
