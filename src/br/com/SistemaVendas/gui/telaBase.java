package br.com.SistemaVendas.gui;
import java.awt.*;
import javax.swing.*;

public class telaBase {
	
	public void inserirCompMeio(JFrame frame, Component comp){
		frame.add(BorderLayout.CENTER, comp);
	}
	public void inserirCompEsq(JFrame frame, Component comp){
		frame.add(BorderLayout.WEST, comp);
	}
	public void inserirCompDir(JFrame frame, Component comp){
		frame.add(BorderLayout.EAST, comp);
	}
	public void inserirCompCima(JFrame frame, Component comp){
		frame.add(BorderLayout.NORTH, comp);
	}
	public void inserirCompBaixo(JFrame frame, Component comp){
		frame.add(BorderLayout.SOUTH, comp);
	}
	

}
