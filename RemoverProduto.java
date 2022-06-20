import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.darkGray;
import static java.awt.Color.white;

public class RemoverProduto extends JFrame {
    private JPanel painelRemoverProduto;
    private JButton btnCancelar;
    private JPanel painelButtons;
    private JLabel labelProduto;
    private JTextField produtoTextField;
    private JButton btnRemover;
    private JLabel gumboLabel;
    private JLabel topLabel;
    private JLabel labelAviso;

    public RemoverProduto(String title){
        super(title);
        setContentPane(painelRemoverProduto);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();

        painelRemoverProduto.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelRemoverProduto.setBackground(new Color(66, 66, 66));
        painelButtons.setBackground(new Color(66, 66, 66));

        gumboLabel.setForeground(white);
        topLabel.setForeground(white);
        labelProduto.setForeground(white);
        btnCancelar.setBackground(darkGray);
        btnRemover.setBackground(darkGray);
        labelAviso.setForeground(white);

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

    public static void main(String[] args) {new AdicionarProduto("Gumbo Remover Produto").setVisible(true);
    }
}

