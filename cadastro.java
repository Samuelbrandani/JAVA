package blablabla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Tela1 extends JFrame {
	private JPanel contentPane;

	public Tela1() {
		setTitle("Calculadora");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		FlowLayout flow  = new FlowLayout();
		flow.setHgap(0);
		flow.setVgap(0);
		setLayout(flow);
		initialize();
	}
	
	private void initialize() {
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
	
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridBagLayout());
		addCenterContent(centerPanel);
		contentPane.add(centerPanel, BorderLayout.CENTER);
	
	}

	private void addCenterContent(JPanel centerPanel) {
		GridBagConstraints gbc = new GridBagConstraints();
		//

		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.0;
		gbc.insets = new Insets(15, 15, 15, 15);
		centerPanel.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(nameTextField, gbc);

		//
		JLabel matriculaLabel = new JLabel();
		matriculaLabel.setText("Matricula:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		centerPanel.add(matriculaLabel, gbc);
		
		JTextField matriculaLabelTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(matriculaLabelTextField, gbc);
		
		//
		JLabel CPFLabel = new JLabel();
		CPFLabel.setText("CPF:");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		centerPanel.add(CPFLabel, gbc);
		
		JTextField CPFLabelTextField = new JTextField();
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(CPFLabelTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		gbc.insets = new Insets(15, 15, 15, 15);
		centerPanel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 3;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(emailTextField, gbc);
//		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 1.0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(saveButton, gbc);
		
		String[] columnName = {"Nome", "Matricula", "CPF", "E-mail"};
		
		Object[][] tableData = {};
		
		JTable userTable = new JTable(tableData, columnName);
		userTable.setFillsViewportHeight(true);
		
		JScrollPane tableScroll = new JScrollPane(userTable);
		tableScroll.setMinimumSize(new Dimension(100, 350));
		tableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 1.0;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(tableScroll, gbc);
	}

}
