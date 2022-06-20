 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

 import static java.awt.Color.*;

 public class Menu extends JFrame {
     private JPanel painelMenu;
     private JButton button1;
     private JLabel gumboLabel;
     private JButton sairButton;
     private JTextField TextField;
     private JPanel conteudo;
     private JLabel menuLabel;
     private JList list1;
     private JButton entradaStockButton;
     private JButton quebraStockButton;
     private JButton saidaStockButton;
     private JPanel painelButtons;

     public Menu(String title) {
         super(title);

         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setContentPane(painelMenu);
         setSize(900, 700);
         setLocationRelativeTo(null);

                 JMenuBar menuBar = new JMenuBar();

                 JMenu fileMenu1 = new JMenu("Produtos");

                 JMenuItem eMenuItem1 = new JMenuItem("Adicionar");
                 JMenuItem eMenuItem2 = new JMenuItem("Editar");
                 JMenuItem eMenuItem3 = new JMenuItem("Remover");
                 eMenuItem1.setToolTipText("Adicionar Produtos");
                 eMenuItem1.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         var janela = new AdicionarProduto("Gumbo Adicionar Produto");
                         janela.setVisible(true);
                         janela.setSize(900, 700);
                         janela.setLocationRelativeTo(null);
                         setVisible(false);
                         dispose();
                     }
                 });
                eMenuItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    var janela = new EditarProduto("Gumbo Editar Produto");
                        janela.setVisible(true);
                        janela.setSize(900, 700);
                        janela.setLocationRelativeTo(null);
                        setVisible(false);
                        dispose();
                     }
                });
                 eMenuItem3.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         var janela = new RemoverProduto("Gumbo Remover Produto");
                         janela.setVisible(true);
                         janela.setSize(900, 700);
                         janela.setLocationRelativeTo(null);
                         setVisible(false);
                         dispose();
                     }
                 });

                entradaStockButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    var janela = new AdicionarStock("Gumbo Entrada de Stock");
                        janela.setVisible(true);
                        janela.setSize(900, 700);
                        janela.setLocationRelativeTo(null);
                        setVisible(false);
                        dispose();
                    }
                });

                 saidaStockButton.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         var janela = new SaidaStock("Gumbo Saída de Stock");
                         janela.setVisible(true);
                         janela.setSize(900, 700);
                         janela.setLocationRelativeTo(null);
                         setVisible(false);
                         dispose();
                     }
                 });

                 fileMenu1.add(eMenuItem1);
                 fileMenu1.add(eMenuItem2);
                 fileMenu1.add(eMenuItem3);
                 menuBar.add(fileMenu1);
                 setJMenuBar(menuBar);



         painelMenu.setBackground(new Color(66, 66, 66));
         painelButtons.setBackground(new Color(66, 66, 66));

         gumboLabel.setForeground(white);
         menuLabel.setForeground(white);
         TextField.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

         conteudo.setBackground(white);
         button1.setBackground(darkGray);
         button1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
         sairButton.setBackground(darkGray);
         sairButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
         entradaStockButton.setBackground(darkGray);
         entradaStockButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
         saidaStockButton.setBackground(darkGray);
         saidaStockButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
         quebraStockButton.setBackground(darkGray);
         quebraStockButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

         sairButton.addActionListener((event) -> System.exit(0));

         painelMenu.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));


     }
        public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            new Menu("Gumbo Menu").setVisible(true);
        }
 }
