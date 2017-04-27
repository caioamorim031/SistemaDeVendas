package br.com.SistemaVendas.controller;

import javafx.scene.control.TextField;

public class textfieldController extends TextField {
	
	private final int limite;

    public textfieldController(int limite) {
        this.limite = limite;
    }

    @Override
    public void replaceText(int start, int end, String text) {
        super.replaceText(start, end, text);
        verify();
    }

    @Override
    public void replaceSelection(String text) {
        super.replaceSelection(text);
        verify();
    }

    private void verify() {
        if (getText().length() > limite) {
            setText(getText().substring(0, limite));
        }

    }
}
