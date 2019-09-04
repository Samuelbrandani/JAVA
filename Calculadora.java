package blablabla;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela1 extends JFrame {
	private JPanel contentPane;

	public Tela1() {
		setTitle("Calculadora");
		setSize(300, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		FlowLayout flow  = new FlowLayout();
		flow.setHgap(0);
		flow.setVgap(0);
		setLayout(flow);
		initialize();
	}

	private void initialize() {
		int t = 94;
		JTextField text = new JTextField(26);
		getContentPane().add(text);
		JButton um = new JButton();
		um.setText("1");
		um.setFont(new Font("Arial", 1,22));
		um.setPreferredSize(new Dimension(t,t));
		getContentPane().add(um);
		
		JButton dois = new JButton();
		dois.setText("2");
		dois.setFont(new Font("Arial", 1,22));
		dois.setPreferredSize(new Dimension(t,t));
		getContentPane().add(dois);
		
		JButton tres = new JButton();
		tres.setText("3");
		tres.setFont(new Font("Arial", 1,22));
		tres.setPreferredSize(new Dimension(t,t));
		getContentPane().add(tres);
		
		JButton quatro = new JButton();
		quatro.setText("4");
		quatro.setFont(new Font("Arial", 1,22));
		quatro.setPreferredSize(new Dimension(t,t));
		getContentPane().add(quatro);
		
		JButton cinco = new JButton();
		cinco.setText("5");
		cinco.setFont(new Font("Arial", 1,22));
		cinco.setPreferredSize(new Dimension(t,t));
		getContentPane().add(cinco);
		
		JButton seis = new JButton();
		seis.setText("6");
		seis.setFont(new Font("Arial", 1,22));
		seis.setPreferredSize(new Dimension(t,t));
		getContentPane().add(seis);
		
		JButton sete = new JButton();
		sete.setText("7");
		sete.setFont(new Font("Arial", 1,22));
		sete.setPreferredSize(new Dimension(t,t));
		getContentPane().add(sete);
		
		JButton oito = new JButton();
		oito.setText("8");
		oito.setFont(new Font("Arial", 1,22));
		oito.setPreferredSize(new Dimension(t,t));
		getContentPane().add(oito);
		
		JButton nove = new JButton();
		nove.setText("9");
		nove.setFont(new Font("Arial", 1,22));
		nove.setPreferredSize(new Dimension(t,t));
		getContentPane().add(nove);
		
		JButton mais = new JButton();
		mais.setText("+");
		mais.setFont(new Font("Arial", 1,22));
		mais.setPreferredSize(new Dimension(t,t));
		getContentPane().add(mais);
		
		JButton zero = new JButton();
		zero.setText("0");
		zero.setFont(new Font("Arial", 1,22));
		zero.setPreferredSize(new Dimension(t,t));
		getContentPane().add(zero);
		
		JButton menos = new JButton();
		menos.setText("-");
		menos.setFont(new Font("Arial", 1,22));
		menos.setPreferredSize(new Dimension(t,t));
		getContentPane().add(menos);
		
		JButton igual = new JButton();
		igual.setText("=");
		igual.setFont(new Font("Arial", 1,22));
		igual.setPreferredSize(new Dimension(300,t));
		getContentPane().add(igual);

	}
	

}
