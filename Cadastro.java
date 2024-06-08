package LoginCadastro;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public record Cadastro() {
	

public void actionPerformed(ActionEvent e) {

	Object btnSair = null;
	Object btnCadastro = null;
	Object btnLogin = null;
	if (e.getSource() == btnLogin) {

		verificaLogin();

	} else if (e.getSource() == btnCadastro) {

		dispose();

		Cadastro cadastro = new Cadastro();

		cadastro.setVisible(true);

		

	}else if(e.getSource() == btnSair) {

		System.exit(0);			

	}

}

private void verificaLogin() {
	// TODO Stub de método gerado automaticamente
	
}

private void dispose() {
	// TODO Stub de método gerado automaticamente
	
}

private void setVisible(boolean b) {
	// TODO Stub de método gerado automaticamente
	
}

public static void main(String[] args) {

	SwingUtilities.invokeLater(() -> {

	JFrame janela = new Login();

	janela.setVisible(true);

	});

}

}