import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import static java.awt.Color.darkGray;
import static java.awt.Color.white;

public class AdicionarStock extends JFrame {
    private JPanel painelAdicionarStock;
    private JLabel gumboLabel;
    private JLabel labelProduto;
    private JComboBox unidadeComboBox;
    private JButton btnCancelar;
    private JLabel topLabel;
    private JLabel labelQuantidade;
    private JButton btnRegistar;
    private JTextField produtoTextField;
    private JTextField quantidadeTextField;
    private JLabel labelData;
    private JTextField dataTextField;
    private JTextField loteTextField;
    private JLabel labelLote;
    private JLabel labelValidade;
    private JTextField validadeTextField;
    private JPanel painelButtons;

    public AdicionarStock(String title) {
        super(title);
        setContentPane(painelAdicionarStock);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();

        painelAdicionarStock.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelAdicionarStock.setBackground(new Color(66, 66, 66));
        painelButtons.setBackground(new Color(66, 66, 66));

        unidadeComboBox.addItem("UN");
        unidadeComboBox.addItem("KG");
        unidadeComboBox.addItem("LT");


        gumboLabel.setForeground(white);
        topLabel.setForeground(white);
        labelProduto.setForeground(white);
        labelQuantidade.setForeground(white);
        labelData.setForeground(white);
        labelLote.setForeground(white);
        labelValidade.setForeground(white);
        btnRegistar.setBackground(darkGray);
        btnCancelar.setBackground(darkGray);


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

    public static void main(String[] args) {new AdicionarProduto("Gumbo Entrada de Stock").setVisible(true);
    }
}
