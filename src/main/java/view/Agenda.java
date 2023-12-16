package view;

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
import javax.swing.ListSelectionModel;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldValor;
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTable table;

	public Agenda() {
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

		JTextArea textAreaObservacao = new JTextArea();
		textAreaObservacao.setBounds(473, 110, 317, 257);
		contentPane.add(textAreaObservacao);

		JLabel labelObservacao = new JLabel("Observação :");
		labelObservacao.setForeground(Color.WHITE);
		labelObservacao.setFont(new Font("Dialog", Font.BOLD, 17));
		labelObservacao.setBounds(338, 118, 161, 15);
		contentPane.add(labelObservacao);

		textFieldHora = new JTextField();
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(134, 341, 155, 26);
		contentPane.add(textFieldHora);

		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(134, 296, 155, 26);
		contentPane.add(textFieldData);

		textFieldValor = new JTextField();
		textFieldValor.setColumns(10);
		textFieldValor.setBounds(134, 251, 155, 26);
		contentPane.add(textFieldValor);

		JComboBox comboBoxServico = new JComboBox();
		comboBoxServico.setBounds(132, 203, 157, 24);
		contentPane.add(comboBoxServico);

		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(132, 159, 157, 24);
		contentPane.add(comboBoxCliente);

		textFieldId = new JTextField();
		textFieldId.setBounds(134, 110, 155, 26);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		JLabel labelHora = new JLabel("Hora");
		labelHora.setForeground(Color.WHITE);
		labelHora.setFont(new Font("Dialog", Font.BOLD, 17));
		labelHora.setBounds(36, 342, 70, 15);
		contentPane.add(labelHora);

		JLabel labelData = new JLabel("Data");
		labelData.setForeground(Color.WHITE);
		labelData.setFont(new Font("Dialog", Font.BOLD, 17));
		labelData.setBounds(36, 297, 70, 15);
		contentPane.add(labelData);

		JLabel labelValor = new JLabel("Valor");
		labelValor.setForeground(Color.WHITE);
		labelValor.setFont(new Font("Dialog", Font.BOLD, 17));
		labelValor.setBounds(36, 252, 70, 15);
		contentPane.add(labelValor);

		JLabel labelServico = new JLabel("Serviço");
		labelServico.setForeground(Color.WHITE);
		labelServico.setFont(new Font("Dialog", Font.BOLD, 17));
		labelServico.setBounds(36, 207, 70, 15);
		contentPane.add(labelServico);

		JLabel labelCliente = new JLabel("Cliente");
		labelCliente.setForeground(Color.WHITE);
		labelCliente.setFont(new Font("Dialog", Font.BOLD, 17));
		labelCliente.setBounds(36, 163, 70, 15);
		contentPane.add(labelCliente);

		JLabel labelId = new JLabel("Id");
		labelId.setFont(new Font("Dialog", Font.BOLD, 17));
		labelId.setForeground(new Color(255, 255, 255));
		labelId.setBounds(36, 118, 70, 15);
		contentPane.add(labelId);

		JLabel lblNewLabel = new JLabel("Agenda");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(356, 12, 174, 71);
		contentPane.add(lblNewLabel);

		JLabel painelPretoAgenda = new JLabel("");
		painelPretoAgenda.setIcon(new ImageIcon(
				"/home/nicollas/eclipse-workspace/BarberShop/src/main/java/view/imagens/Agenda-PainelFundo.png"));
		painelPretoAgenda.setBounds(-24, 12, 837, 603);
		contentPane.add(painelPretoAgenda);

		JLabel imagemDeFundoAgenda = new JLabel("");
		imagemDeFundoAgenda.setIcon(new ImageIcon(
				"/home/nicollas/eclipse-workspace/BarberShop/src/main/java/view/imagens/AgendaFundo.png"));
		imagemDeFundoAgenda.setBounds(0, 0, 825, 627);
		contentPane.add(imagemDeFundoAgenda);

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