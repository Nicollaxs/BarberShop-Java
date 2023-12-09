package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsuario;
    private JPasswordField fieldSenha;

    /**
     * Create the frame.
     */
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 830);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Adicione aqui a lógica que deseja executar quando o botão "Enviar" for clicado.
            }
        });

        fieldSenha = new JPasswordField();
        fieldSenha.setBounds(214, 377, 162, 31);
        contentPane.add(fieldSenha);
        btnEnviar.setBounds(235, 454, 117, 25);
        contentPane.add(btnEnviar);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setColumns(10);
        textFieldUsuario.setBounds(214, 282, 162, 31);
        contentPane.add(textFieldUsuario);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setForeground(Color.WHITE);
        lblSenha.setFont(new Font("Dialog", Font.BOLD, 15));
        lblSenha.setBackground(Color.WHITE);
        lblSenha.setBounds(214, 321, 120, 60);
        contentPane.add(lblSenha);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Dialog", Font.BOLD, 15));
        lblUsuario.setBackground(Color.WHITE);
        lblUsuario.setBounds(214, 230, 120, 60);
        contentPane.add(lblUsuario);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Dialog", Font.BOLD, 25));
        lblLogin.setForeground(Color.WHITE);
        lblLogin.setBackground(Color.WHITE);
        lblLogin.setBounds(256, 165, 120, 60);
        contentPane.add(lblLogin);

        JLabel imagemDeFundo = new JLabel("");
        imagemDeFundo.setFont(new Font("Dialog", Font.BOLD, 25));
        imagemDeFundo.setIcon(new ImageIcon("/home/nicollas/eclipse-workspace/BarberShop/src/main/java/view/imagens/painel-login.png"));
        imagemDeFundo.setBounds(61, 165, 441, 335);
        imagemDeFundo.setBackground(Color.WHITE);
        contentPane.add(imagemDeFundo);

        JLabel painelPreto = new JLabel("");
        painelPreto.setBounds(0, -49, 600, 885);
        painelPreto.setIcon(new ImageIcon("/home/nicollas/eclipse-workspace/BarberShop/src/main/java/view/imagens/Logo.jpg"));
        contentPane.add(painelPreto);
    }

    // Método público para exibir o frame
    public void exibirLogin() {
        setVisible(true);
    }
}
