package Controller.Helper;

import Modelo.Usuario;
import View.Login;

public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModelo() {
        Usuario modelo = new Usuario(0, view.getUsuario(), view.getSenha());
        return modelo;
    }

    public void setModelo(Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();

        view.getTextFieldUsuario().setText(nome);
        view.getFieldSenha().setText(senha);
    }

    public void limparTela() {
        view.getTextFieldUsuario().setText("");
        view.getFieldSenha().setText("");
    }
}
