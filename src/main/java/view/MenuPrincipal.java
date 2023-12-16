package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public MenuPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 795, 600);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu btnCadastro = new JMenu("Cadastro");
        menuBar.add(btnCadastro);

        JMenuItem opcaoUsuario = new JMenuItem("Usuario");
        btnCadastro.add(opcaoUsuario);

        JMenuItem opcaoServico = new JMenuItem("Serviço");
        btnCadastro.add(opcaoServico);

        JMenuItem opcaoCliente = new JMenuItem("Cliente");
        btnCadastro.add(opcaoCliente);

        JMenu btnOperacao = new JMenu("Operação");
        menuBar.add(btnOperacao);

        JMenuItem mntmTeste_1 = new JMenuItem("Teste2");
        btnOperacao.add(mntmTeste_1);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblImagemMenuPrincipal = new JLabel("");
        lblImagemMenuPrincipal.setBounds(0, -30, 912, 600);
        lblImagemMenuPrincipal.setIcon(new ImageIcon(
                "/home/nicollas/eclipse-workspace/BarberShop/src/main/java/view/imagens/menuPrincipal.jpg"));
        contentPane.add(lblImagemMenuPrincipal);
    }

    public void exibirMenuPrincipal() {
        setVisible(true);
    }

}
