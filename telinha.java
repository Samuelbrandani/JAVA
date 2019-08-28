
package ea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Telinha extends JFrame {
	private JPanel contentPane;

	public Telinha() {
		setSize(600, 500);
		setTitle("Chamado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initialize();
	}

	public void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		title(gbc);
		nomeLabel(gbc);
		inputNome(gbc);
		setorLabel(gbc);
		inputSetor(gbc);
		motivoLabel(gbc);
		inputMotivo(gbc);
		prioridadeLabel(gbc);
		button(gbc);
	}

	public void title(GridBagConstraints gbc) {
		JLabel label = new JLabel();
		label.setText("Help Desk");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.CENTER;
		contentPane.add(label, gbc);
	}

	public void nomeLabel(GridBagConstraints gbc) {
		JLabel label = new JLabel();
		label.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(label, gbc);
	}

	public void inputNome(GridBagConstraints gbc) {
		JTextField input = new JTextField();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 0;
		gbc.weightx = 1.0;
		contentPane.add(input, gbc);
	}

	public void setorLabel(GridBagConstraints gbc) {
		JLabel label = new JLabel();
		label.setText("Setor:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		contentPane.add(label, gbc);
	}

	public void inputSetor(GridBagConstraints gbc) {
		JTextField input = new JTextField();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 0;
		gbc.weightx = 1.0;
		contentPane.add(input, gbc);
	}

	public void motivoLabel(GridBagConstraints gbc) {
		JLabel label = new JLabel();
		label.setText("Motivo:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		contentPane.add(label, gbc);
	}

	public void inputMotivo(GridBagConstraints gbc) {
		JTextField input = new JTextField();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 0;
		gbc.weightx = 1.0;
		contentPane.add(input, gbc);
	}

	public void prioridadeLabel(GridBagConstraints gbc) {
		JLabel label = new JLabel();
		label.setText("Prioridade:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(label, gbc);

		JRadioButton radioBaixa = new JRadioButton();
		radioBaixa.setText("Baixa");
		JRadioButton radioMedia = new JRadioButton();
		radioMedia.setText("Média");
		JRadioButton radioAlta = new JRadioButton();
		radioAlta.setText("Urgente");
		
		ButtonGroup options = new ButtonGroup();
		options.add(radioBaixa);
		options.add(radioMedia);
		options.add(radioAlta);
		
		JPanel optionPanel = new JPanel( new GridBagLayout());
		optionPanel.setPreferredSize(new Dimension(500, 50));
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 2.0;
		gbc.gridwidth = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		optionPanel.add(radioBaixa);
		optionPanel.add(radioMedia);
		optionPanel.add(radioAlta);
		contentPane.add(optionPanel);
	}
	
	public void button(GridBagConstraints gbc){
		gbc.fill = GridBagConstraints.NONE;
		JButton b = new JButton();
		gbc.gridx = 0;
		gbc.gridy = 6;
		b.setText("Abrir Chamado");
		contentPane.add(b, gbc);
	}

}
