import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Desenhista extends JFrame {
    
    // Elementos (widgets) da nossa interface
    private Tela tela;
    private JButton btnDesenhar;
    private JComboBox<String> boxListaDesenhos;
    
    
    /**
     * O construtor do aplicativo Desenhista. Eh aqui que todos os elementos da interface grafica sao
     * construidos, configurados e posicionados. Por enquanto, aqui tambem e feito o tratamento de 
     * eventos (input de usuario atraves de mouse e teclado), utilizando classes anonimas.
     * Provavelmente vamos separar esta funcionalidade no futuro.
     * 
     * @see javax.swing.JFrame
     */
    public Desenhista() {
        
        // Cria e configura botao Desenhar Arranjo
        btnDesenhar = new JButton("Desenhar!");
        btnDesenhar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Verifica o desenho escolhido no ComboBox e repassa a tela para pintura
                String desenho = (String) boxListaDesenhos.getSelectedItem();
                tela.setDesenho(desenho);
                tela.repaint();
                requestFocusInWindow();
            } 
        });
        
        // Cria e configura o campo de entrada de arranjos
        String nomesExercicios[] = { "Desenho Livre", "Asterisco", "Smiles", "Computador", "Poligono" };
        boxListaDesenhos = new JComboBox<String>(nomesExercicios);
        
        // Campo para abrigar e organizar os botoes e campos de entrada
        JPanel pnlBotoes = new JPanel(new FlowLayout());
        pnlBotoes.add(boxListaDesenhos);
        pnlBotoes.add(btnDesenhar);
        
        // Cria e configura a tela do desenhista
        tela = new Tela(/*txtEntradaArranjo.getText()*/);
        tela.setPreferredSize(new Dimension(800, 600));

        // Container que organiza o posicionamento dos botoes e da tela
        Container organizacao = getContentPane();
        organizacao.setLayout(new BorderLayout());
        organizacao.add(tela, BorderLayout.CENTER);
        organizacao.add(pnlBotoes, BorderLayout.SOUTH);

        // Configuracoes de comportamento do aplicativo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Desenhista - Lab. Comp. II");
        pack();
        setVisible(true);
        requestFocus();
    }
    
    
    /**
     * Ponto de inicio do programa. Simplesmente informa que e um aplicativo grafico e passa o controle
     * para o construtor do metodo. Utiliza uma segunda thread para isso.
     * 
     * @param args Argumentos recebidos da linha de comando.
     */
    public static void main(String[] args) {
        // Codigo que inicializa o aplicativo grafico
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Desenhista();
            }
        }); 
    }
}