package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    Agenda agenda = new Agenda();
    private JPanel contentPane;

    public MenuPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 795, 600);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu btnCadastro = new JMenu("Cadastro");
        menuBar.add(btnCadastro);

        JMenuItem opcaoUsuario = new JMenuItem("Usuario");
        opcaoUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCadastro.add(opcaoUsuario);

        JMenuItem opcaoServico = new JMenuItem("Serviço");
        opcaoServico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agenda.exibirTelaAgenda();

            }
        });
        btnCadastro.add(opcaoServico);

        JMenuItem opcaoCliente = new JMenuItem("Cliente");
        opcaoCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnCadastro.add(opcaoCliente);

        JMenu btnOperacao = new JMenu("Operação");
        menuBar.add(btnOperacao);

        JMenuItem mntmTeste_1 = new JMenuItem("Teste2");
        mntmTeste_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnOperacao.add(mntmTeste_1);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblImagemMenuPrincipal = new JLabel("");
        lblImagemMenuPrincipal.setBounds(0, -30, 912, 600);
        lblImagemMenuPrincipal.setIcon(new ImageIcon("src/imagens/menuPrincipal.jpg"));
        contentPane.add(lblImagemMenuPrincipal);
    }

    public void exibirMenuPrincipal() {
        setVisible(true);
    }
}
