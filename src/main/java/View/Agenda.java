package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.AgendaController;
import Modelo.Servico;

import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldValor;
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTextArea textAreaObservacao;
	private JTable table;
	private AgendaController agendaController;
	private JTextField textFieldNome;
	private JComboBox<Servico> comboBoxServico;
	private Servico itemSelecionado;

	public Agenda() {
		agendaController = new AgendaController(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 835, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		DefaultTableModel model = new DefaultTableModel(
				new Object[][] {},
				new String[] {
						"Id",
						"Cliente",
						"Servico",
						"Valor",
						"Data",
						"Hora",
						"Observacao"
				}) {
			Class[] columnTypes = new Class[] {
					Object.class,
					Object.class,
					Object.class,
					Object.class,
					Object.class,
					Object.class,
					Object.class
			};

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		};

		JButton btnEnviarAgenda = new JButton("Enviar");
		btnEnviarAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agendaController.salvaAgenda();
				textAreaObservacao.setText("");
				textFieldData.setText("");
				textFieldHora.setText("");
				textFieldNome.setText("");
				textFieldValor.setText("");
			}
		});

		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(134, 114, 155, 26);
		contentPane.add(textFieldNome);
		btnEnviarAgenda.setForeground(new Color(255, 255, 255));
		btnEnviarAgenda.setBackground(new Color(51, 209, 122));
		btnEnviarAgenda.setBounds(470, 247, 320, 35);
		contentPane.add(btnEnviarAgenda);

		JPanel panel = new JPanel();
		panel.setBounds(34, 420, 756, 181);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout());

		table = new JTable(model);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane, BorderLayout.NORTH);

		textAreaObservacao = new JTextArea();
		textAreaObservacao.setBounds(473, 114, 317, 105);
		contentPane.add(textAreaObservacao);

		JLabel labelObservacao = new JLabel("Observação :");
		labelObservacao.setForeground(Color.WHITE);
		labelObservacao.setFont(new Font("Dialog", Font.BOLD, 17));
		labelObservacao.setBounds(338, 118, 161, 15);
		contentPane.add(labelObservacao);

		textFieldHora = new JTextField();
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(134, 320, 155, 26);
		contentPane.add(textFieldHora);

		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(134, 269, 155, 26);
		contentPane.add(textFieldData);

		textFieldValor = new JTextField();
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(134, 218, 155, 26);
		contentPane.add(textFieldValor);

		comboBoxServico = new JComboBox();
		comboBoxServico.setBounds(134, 165, 157, 24);
		contentPane.add(comboBoxServico);

		for (Servico servico : Servico.values()) {
			comboBoxServico.addItem(servico);
		}

		JLabel labelHora = new JLabel("Hora");
		labelHora.setForeground(Color.WHITE);
		labelHora.setFont(new Font("Dialog", Font.BOLD, 17));
		labelHora.setBounds(34, 324, 70, 15);
		contentPane.add(labelHora);

		JLabel labelData = new JLabel("Data");
		labelData.setForeground(Color.WHITE);
		labelData.setFont(new Font("Dialog", Font.BOLD, 17));
		labelData.setBounds(34, 273, 70, 15);
		contentPane.add(labelData);

		JLabel labelValor = new JLabel("Valor");
		labelValor.setForeground(Color.WHITE);
		labelValor.setFont(new Font("Dialog", Font.BOLD, 17));
		labelValor.setBounds(34, 222, 70, 15);
		contentPane.add(labelValor);

		JLabel labelServico = new JLabel("Serviço");
		labelServico.setForeground(Color.WHITE);
		labelServico.setFont(new Font("Dialog", Font.BOLD, 17));
		labelServico.setBounds(34, 169, 70, 15);
		contentPane.add(labelServico);

		JLabel labelCliente = new JLabel("Cliente");
		labelCliente.setForeground(Color.WHITE);
		labelCliente.setFont(new Font("Dialog", Font.BOLD, 17));
		labelCliente.setBounds(34, 118, 70, 15);
		contentPane.add(labelCliente);

		JLabel lblNewLabel = new JLabel("Agenda");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(356, 12, 174, 71);
		contentPane.add(lblNewLabel);

		JLabel painelPretoAgenda = new JLabel("");
		painelPretoAgenda.setIcon(new ImageIcon(
				getClass().getResource("imagens/Agenda-PainelFundo.png")));
		painelPretoAgenda.setBounds(-24, 12, 837, 603);
		contentPane.add(painelPretoAgenda);

		JLabel imagemDeFundoAgenda = new JLabel("");
		imagemDeFundoAgenda.setIcon(new ImageIcon(
				getClass().getResource(
						"imagens/AgendaFundo.png")));
		imagemDeFundoAgenda.setBounds(0, 0, 825, 627);
		contentPane.add(imagemDeFundoAgenda);
	}

	public int getValor() {
		int valor = Integer.parseInt(textFieldValor.getText());
		return valor;
	}

	public String getNome() {
		String nome = textFieldNome.getText();
		return nome;
	}

	public String getData() {
		String data = textFieldData.getText();
		return data;
	}

	public String getHora() {
		String hora = textFieldHora.getText();
		return hora;
	}

	public String getObservacao() {
		String obs = textAreaObservacao.getText();
		return obs;
	}

	public Servico getServico() {
		Servico itemSelecionado = (Servico) comboBoxServico.getSelectedItem();
		return itemSelecionado;
	}

	public void exibirTelaAgenda() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}