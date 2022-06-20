import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.darkGray;
import static java.awt.Color.white;

public class EditarProduto extends JFrame {
    private JPanel painelEditarProduto;
    private JLabel gumboLabel;
    private JLabel topLabel;
    private JTextField nomeTextField;
    private JComboBox categoriaComboBox;
    private JTextField preçoTextField;
    private JComboBox unidadeComboBox;
    private JButton btnCancelar;
    private JButton btnAdicionar;
    private JLabel labelNome;
    private JLabel labelDescricao;
    private JLabel labelPreco;
    private JLabel labelCategoria;
    private JTextArea descricaoTextArea;

    public EditarProduto(String title) {
        super(title);
        setContentPane(painelEditarProduto);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();

        painelEditarProduto.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelEditarProduto.setBackground(new Color(66, 66, 66));
        gumboLabel.setForeground(white);
        topLabel.setForeground(white);
        labelNome.setForeground(white);
        labelDescricao.setForeground(white);
        labelPreco.setForeground(white);
        labelCategoria.setForeground(white);
        btnAdicionar.setBackground(darkGray);
        btnCancelar.setBackground(darkGray);

        descricaoTextArea.setLineWrap(true);

        categoriaComboBox.addItem("Fruta");
        categoriaComboBox.addItem("Legume");
        categoriaComboBox.addItem("Laticínio");
        categoriaComboBox.addItem("Fungo");
        categoriaComboBox.addItem("Especiaria");
        categoriaComboBox.addItem("Verdura");
        categoriaComboBox.addItem("Semente");
        categoriaComboBox.addItem("Doce");
        categoriaComboBox.addItem("Salgado");
        categoriaComboBox.addItem("Outro");

        unidadeComboBox.addItem("UN");
        unidadeComboBox.addItem("KG");
        unidadeComboBox.addItem("LT");

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var janela = new Menu("Gumbo Menu");
                janela.setVisible(true);
                janela.setSize(900, 700);
                janela.setLocationRelativeTo(null);
                setVisible(false);
                dispose();
            }
        });
    }

    public static void main(String[] args) {new AdicionarProduto("Gumbo Adicionar Produto").setVisible(true);
    }
}