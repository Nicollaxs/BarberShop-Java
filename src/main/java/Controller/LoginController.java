package Controller;

import Controller.Helper.LoginHelper;
import Modelo.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        // pegarUsuario da view
        Usuario usuario = helper.obterModelo();
        System.out.println(usuario.getNome());
        helper.limparTela();
        // pesquisar usuario no banco
        // se o usuario da view tiver o mesmo usuario vindo do banco eu redireciono ele
        // pro menu
        // se não vou mostrar uma mensagem ao usuario "usuario ou senha invalidos"
    }

    public void fizTarefa() {
        System.out.println("Busquei algo no banco de dados");
        System.out.println(view.getUsuario());
    }

}
