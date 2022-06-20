import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.darkGray;
import static java.awt.Color.white;

public class SaidaStock extends JFrame {
    private JPanel painelSaidaStock;
    private JButton btnCancelar;
    private JPanel painelButtons;
    private JLabel labelProduto;
    private JLabel labelData;
    private JLabel labelLote;
    private JLabel labelQuantidade;
    private JTextField produtoTextField;
    private JTextField dataTextField;
    private JTextField loteTextField;
    private JTextField quantidadeTextField;
    private JComboBox unidadeComboBox;
    private JButton btnRegistar;
    private JLabel gumboLabel;
    private JLabel topLabel;

    public SaidaStock(String title){
        super(title);
        setContentPane(painelSaidaStock);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();

        painelSaidaStock.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelSaidaStock.setBackground(new Color(66, 66, 66));
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

    public static void main(String[] args) {new AdicionarProduto("Gumbo Saida de Stock").setVisible(true);
    }
}

