package br.com.SistemaVendas.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class telaLogin extends telaBase implements ActionListener {
	
	private JButton login, quit;
	JTextField username = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	
	public void init(){
		JFrame tela = new JFrame("SISTEMA DE VENDAS");
		setIcon(tela);
		showWindow(tela);
	}
	
	private void showWindow(JFrame window){
		initPanel(window);
		window.setUndecorated(true);
		window.setVisible(true);
		window.setSize(400, 200);
		window.setLocationRelativeTo(null); //CENTRALIZAR A JANELA DE ACORDO COM A TELA
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*
	 * ADICIONA OS PAINEIS NA JANELA
	 */
	private void initPanel(JFrame window){
		JPanel painelMid = new JPanel(new GridBagLayout());
		JPanel painelSup = new JPanel();
		JPanel painelInf = new JPanel();
		painelSup.setBackground(Color.GRAY);
		painelSup.add(setRotulo("SISTEMA DE VENDAS | SOLUÇÕES PARA O SEU NEGÓCIO", Color.WHITE, 11));
		inserirCompCima(window, painelSup);
		inserirCompMeio(window, painelMid);
		inserirCompBaixo(window, painelInf);
		painelSup.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painelMid.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painelInf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLoginField(painelMid);
		setLoginButton(painelInf);
		quit.addActionListener(this);
	}
	/*
	 * RECEBE UM PAINEL TIPO GRIDBAGLAYOUT
	 * ADICIONA OS TEXTOS E OS CAMPOS
	 * E ORDENA DE ACORDO COM O PAINEL
	 */
	private void setLoginField(JPanel painel){
		JPanel camposLogin = new JPanel();
		username.setColumns(10);
		password.setColumns(10);
		camposLogin.add(new JLabel("Usuário:"));
		camposLogin.add(username);
		camposLogin.add(new JLabel("Senha:"));
		camposLogin.add(password);
		painel.add(camposLogin);
		painel.setAlignmentX(Component.CENTER_ALIGNMENT);
		setLineBox(camposLogin);
		
	}
	private void setLineBox(JPanel box){
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border title = BorderFactory.createTitledBorder(loweredetched, "LOGIN");
        box.setBorder(title);
	}
	private void setLoginButton(JPanel painel){
		JPanel botoes = new JPanel();
		login = new JButton("ENTRAR");
		quit = new JButton("SAIR");
		botoes.add(login);
		botoes.add(quit);
		painel.add(botoes);
	}
	public void aposClick(ActionEvent evento){
		if(evento.getSource()==quit){
			Runtime.getRuntime().exit(0);
		}
	}
	//TROCA DE ÍCONE DA JANELA
	private void setIcon(JFrame janela){
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage("img/logo.png");  
		janela.setIconImage(iconeTitulo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		aposClick(e);
	}
	
}
