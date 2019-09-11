package pacote;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Telinha extends JFrame {
	private JPanel contentPane;
	public Telinha() {
		setSize(400,400);
		setTitle("Telinha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}
	
	JTextField nameTextField = new JTextField();
	JTextField registryTextField = new JTextField();
	Object[][] dadosTable = {};
	Object[] columnName = {
			"Nome", "Matrícula"
	};
	JTable table = new JTable(new DefaultTableModel(dadosTable, columnName));
	public void initialize(){
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		// label nome
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(nameLabel, gbc);
		
		// inp nome
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(nameTextField, gbc);
		
		//label matricula
		JLabel registryLabel = new JLabel();
		registryLabel.setText("Matricula");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(registryLabel, gbc);
		
		// inp matricula
		JTextField registryTextField = new JTextField();
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(registryTextField, gbc);
		
		//
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		gbc.gridwidth = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = nameTextField.getText();
				String matricula = registryTextField.getText();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{nome, matricula});
			}
		});
		
		contentPane.add(saveButton, gbc);

		
		JScrollPane studentTableScroll = new JScrollPane(table);
		studentTableScroll.setMinimumSize(new Dimension(50, 200));
		studentTableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		studentTableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 1.0;
		gbc.gridwidth = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(studentTableScroll, gbc);
	}
	
}
