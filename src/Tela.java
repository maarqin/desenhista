import javax.swing.*;

import java.awt.*;
import java.io.IOException;

class Tela extends JPanel {
    
    /**
     * Construtor padrao da classe. Configura algumas opcoes de cores da tela e atribibutos do
     * pincel.
     * 
     */
	
	private JFrame frame;
    public Tela() {
    	
    	frame = new JFrame();
    	frame.setResizable(false);
    	
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        
    }
    
    /**
     * Outro construtor para a Tela.
     * 
     * @param desenho Nome do desenho a ser pintado inicialmente.
     */
    public Tela(String desenho) {
        this();
        
        this.desenhoEscolhido = desenho;
    }
    
    
    /**
     * Define um novo desenho para ser pintado na tela.
     * 
     * @para desenho Nome do novo desenho a ser pintado.
     */
    public void setDesenho(String desenho) {
        this.desenhoEscolhido = desenho;
    }
    
    
    /**
     * Metodo que escreve informacoes auxiliares uteis:
     *  - Dimensoes da tela
     *  - Desenho Escolhido
     * 
     * @param g2d Pincel utilizado para desenhar na tela.
     */
    private void exibirInfosUteis(Graphics2D g2d) {
        Dimension dim = getSize();
        StringBuilder txtDim = new StringBuilder("Dimensoes da tela: ");
        txtDim.append(dim.width).append(" X ").append(dim.height);
        g2d.drawString(txtDim.toString(), TAMANHO_MARGEM_TXT, TAMANHO_LINHA_TXT);
        
        StringBuilder txtDesenho = new StringBuilder("Pintura: ");
        txtDesenho.append(this.desenhoEscolhido);
        g2d.drawString(txtDesenho.toString(), TAMANHO_MARGEM_TXT, TAMANHO_LINHA_TXT * 2);
    }
    
    
    /**
     * Metodo responsavel por desenhar tudo o que ira aparecer na tela. Eh aqui que os alunos deverao
     * trabalhar. Porem devem evitar de fazerem um codigo demasiadamente grande, devem separar em
     * metodos auxiliares (subrotinas) sempre que possivel.
     * 
     * @param g Pincel do desenhista.
     * @see java.awt.Graphics, java.swing.Graphics2D
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        exibirInfosUteis(g2d);
                
        switch(desenhoEscolhido) {
    		case "Asterisco":
        		Desenhos.desenharAsterisco(g2d, getSize());
        		break;                               
			case "Smiles":
				Desenhos.desenharSmiles(g2d, getSize());
				break;
			case "Computador":
				try {
					Desenhos.desenhaGabinete(g2d, getSize());
				} catch (IOException e) {
					e.printStackTrace();
				}
	            break;
			case "Poligono":
				int numFaces = 0;
				
				do {
					numFaces = (int)(Math.random()*10);
				} while ( numFaces < 3 );
				
				Desenhos.desenharPoligono(g2d, 200, 200, 200, numFaces);
				break;
            default:
				Desenhos.desenhoLivre(g2d, getSize());

        }
        
    }
    
    // Constantes importantes
    private final int TAMANHO_MARGEM_TXT = 10;
    private final int TAMANHO_LINHA_TXT = 15;
    
    // Atributos da classe
    private String desenhoEscolhido = "";
}