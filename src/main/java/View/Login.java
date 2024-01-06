package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.LoginController;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JPasswordField fieldSenha;
    private final LoginController loginController;

    /**
     * Create the frame.
     */
    public Login() {
        loginController = new LoginController(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 830);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    loginController.entrarNoSistema();
                } catch (SQLException e) {
                    e.getMessage();
                }
            }
        });

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnCadastrar.setBounds(240, 462, 117, 25);
        contentPane.add(btnCadastrar);

        fieldSenha = new JPasswordField();
        fieldSenha.setBounds(214, 358, 162, 31);
        contentPane.add(fieldSenha);
        btnEnviar.setBounds(240, 414, 117, 25);
        contentPane.add(btnEnviar);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setColumns(10);
        textFieldUsuario.setBounds(214, 272, 162, 31);
        contentPane.add(textFieldUsuario);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setFont(new Font("Dialog", Font.BOLD, 15));
        lblSenha.setBackground(Color.WHITE);
        lblSenha.setBounds(214, 302, 120, 60);
        contentPane.add(lblSenha);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Dialog", Font.BOLD, 15));
        lblUsuario.setBackground(Color.WHITE);
        lblUsuario.setBounds(214, 216, 120, 60);
        contentPane.add(lblUsuario);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Dialog", Font.BOLD, 25));
        lblLogin.setForeground(Color.WHITE);
        lblLogin.setBackground(Color.WHITE);
        lblLogin.setBounds(256, 165, 120, 60);
        contentPane.add(lblLogin);

        JLabel imagemDeFundo = new JLabel("");
        imagemDeFundo.setFont(new Font("Dialog", Font.BOLD, 25));
        imagemDeFundo.setIcon(new ImageIcon("src/imagens/painel-login.png"));
        imagemDeFundo.setBounds(61, 165, 441, 335);
        imagemDeFundo.setBackground(Color.WHITE);
        contentPane.add(imagemDeFundo);

        JLabel painelPreto = new JLabel("");
        painelPreto.setBounds(0, -49, 600, 885);
        painelPreto.setIcon(new ImageIcon("src/imagens/Logo.jpg"));
        contentPane.add(painelPreto);
    }

    public JTextField getTextFieldUsuario() {
        return textFieldUsuario;
    }

    public JPasswordField getFieldSenha() {
        return fieldSenha;
    }

    public String getUsuario() {
        return textFieldUsuario.getText();
    }

    public String getSenha() {
        return fieldSenha.getText();
    }

    public void exibirLogin() {
        setVisible(true);
    }
}
