import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * Write a description of class Desenhos here.
 * 
 * @author Marcos Thomaz 
 * @version 1.0
 */
public class Desenhos
{
    public static void desenhoLivre(Graphics2D g2d, Dimension dim) {
    		    	
    }
    
    public static void desenharAsterisco(Graphics2D g2d, Dimension dim) {
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.BLUE);
        
        Linha diagonal1 = new Linha(new Dimensiona(.125f, .125f), new Dimensiona(.5f, .5f));        
        g2d.drawLine(diagonal1.getPonto0().getX(dim), diagonal1.getPonto0().getY(dim),
        				diagonal1.getPonto1().getX(dim), diagonal1.getPonto1().getY(dim));
        
        Linha diagonal2 = new Linha(new Dimensiona(.125f, .5f), new Dimensiona(.5f, .125f));
        g2d.drawLine(diagonal2.getPonto0().getX(dim), diagonal2.getPonto0().getY(dim),
        		diagonal2.getPonto1().getX(dim), diagonal2.getPonto1().getY(dim));
        
        g2d.setColor(Color.RED);
        
        Linha vertical = new Linha(new Dimensiona(.3125f, .0625f), new Dimensiona(.3125f, .5625f));
        g2d.drawLine(vertical.getPonto0().getX(dim), vertical.getPonto0().getY(dim),
        		vertical.getPonto1().getX(dim), vertical.getPonto1().getY(dim));
       
        Linha linha = new Linha(new Dimensiona(.0625f, .3125f), new Dimensiona(.5625f, .3125f));
        g2d.drawLine(linha.getPonto0().getX(dim), linha.getPonto0().getY(dim),
        		linha.getPonto1().getX(dim), linha.getPonto1().getY(dim));
    }
    
    public static void desenharSmiles(Graphics2D g2d, Dimension dim) {
    	
    	// Rosto    
    	Dimensiona tamBola = new Dimensiona(.225f, .30f);
    	
    	g2d.setColor(Color.GREEN);
    	Dimensiona pBola1 = new Dimensiona(.03125f, .125f);
    	g2d.fillOval(pBola1.getX(dim), pBola1.getY(dim), tamBola.getX(dim), tamBola.getY(dim));
    	
    	g2d.setColor(Color.YELLOW);
    	Dimensiona pBola2 = new Dimensiona(.3f, .125f);
    	g2d.fillOval(pBola2.getX(dim), pBola2.getY(dim), tamBola.getX(dim), tamBola.getY(dim)) ;
    	
    	g2d.setColor(Color.RED);
    	Dimensiona pBola3 = new Dimensiona(.57f, .125f);
    	g2d.fillOval(pBola3.getX(dim), pBola3.getY(dim), tamBola.getX(dim), tamBola.getY(dim));
    	
    	g2d.setColor(Color.BLACK);
    	g2d.setStroke(new BasicStroke(5));
    	g2d.drawOval(pBola1.getX(dim), pBola1.getY(dim), tamBola.getX(dim), tamBola.getY(dim));
  		g2d.drawOval(pBola2.getX(dim), pBola2.getY(dim), tamBola.getX(dim), tamBola.getY(dim));
  		g2d.drawOval(pBola3.getX(dim), pBola3.getY(dim), tamBola.getX(dim), tamBola.getY(dim));
    	// Fim do rosto
  		
    	//Olhos
    	Dimensiona tamOlho = new Dimensiona(.04f, .055f);
    	//Primeiro
    	Dimensiona olho01 = new Dimensiona(.085f, .2f);
    	g2d.fillOval(olho01.getX(dim), olho01.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Left
    	
    	Dimensiona olho02 = new Dimensiona(.170f, .2f);
    	g2d.fillOval(olho02.getX(dim), olho02.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Right
    	
    	// Segundo
    	Dimensiona olho11 = new Dimensiona(.350f, .2f);
    	g2d.fillOval(olho11.getX(dim), olho11.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Left
    	
    	Dimensiona olho12 = new Dimensiona(.440f, .2f);
    	g2d.fillOval(olho12.getX(dim), olho12.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Right
    	
    	// Terceiro
    	Dimensiona olho31 = new Dimensiona(.615f, .2f);
    	g2d.fillOval(olho31.getX(dim), olho31.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Left
    	
    	Dimensiona olho32 = new Dimensiona(.710f, .2f);
    	g2d.fillOval(olho32.getX(dim), olho32.getY(dim), tamOlho.getX(dim), tamOlho.getY(dim)); // Right
    	  
    	//Boca
    	Dimensiona bocaP = new Dimensiona(.08f, .2f);
    	Dimensiona bocaT = new Dimensiona(.13f, .2f);
    	g2d.fillArc(bocaP.getX(dim), bocaP.getY(dim), bocaT.getX(dim), bocaT.getY(dim), 180,180); // Primeira
    	
    	Dimensiona boca1 = new Dimensiona(.360f, .34f);
    	Dimensiona boca2 = new Dimensiona(.47f, .34f);
    	g2d.drawLine(boca1.getX(dim), boca1.getY(dim), boca2.getX(dim), boca2.getY(dim)); // Segunda

    	Dimensiona boca30 = new Dimensiona(.620f, .30f);
    	Dimensiona boca31 = new Dimensiona(.13f, .14f);
    	g2d.drawArc(boca30.getX(dim), boca30.getY(dim), boca31.getX(dim), boca31.getY(dim), 180, -180); // Terceira
    	// Fim boca
    	
    	// Extra bravo
    	Dimensiona bravo0 = new Dimensiona(.635f, .18f);
    	Dimensiona bravo1 = new Dimensiona(.685f, .20f);
    	Dimensiona bravo2 = new Dimensiona(.735f, .18f);

        int[] xSin = {bravo0.getX(dim), bravo1.getX(dim), bravo2.getX(dim)};
        int[] ySin = {bravo0.getY(dim), bravo1.getY(dim), bravo2.getY(dim)};

        g2d.drawPolyline(xSin, ySin, xSin.length);
    	
    }
    
    public static void desenhaGabinete(Graphics2D g2d, Dimension dim) throws IOException{    	
    	//PC
    	Object o = new Object();
        String fileLoc = o.getClass().getResource("/img/iamwho.jpg").getPath();    	
    	BufferedImage img = ImageIO.read(new File(fileLoc));

    	g2d.drawImage(img, 100, 50, null);
    	    	
    	//Baias
    	int[][] x = {{110, 120}, {110, 120}, {110, 120}};
    	int[][] w = {{250, 230}, {250, 230}, {250, 230}};
    	int[][] y = {{60, 70}, {140, 150}, {220, 230}};
    	int[][] h = {{70, 30}, {70, 30}, {70, 30}};
    	int[][] bto = {{330, 105}, {330, 185}, {330, 265}};
    	for (int i = 0; i < 3; i++) {
        	g2d.setColor(Color.DARK_GRAY);
        	g2d.fillRect(x[i][0], y[i][0], w[i][0],h[i][0]);
        	g2d.setColor(Color.WHITE);
        	g2d.drawRect(x[i][1], y[i][1], w[i][1],h[i][1]);
        	g2d.fillOval(bto[i][0], bto[i][1], 15, 15);
		}

    	//Disquete
    	int[][] x1 = {{110, 115}, {110, 115}};
    	int[][] w1 = {{170, 160}, {170, 160}};
    	int[][] y1 = {{320, 325}, {360, 365}};
    	int[][] h1 = {{30, 10}, {30, 10}};
    	int[][] bto1 = {{260, 337}, {260, 377}};
    	for (int i = 0; i < 2; i++) {
        	g2d.setColor(Color.DARK_GRAY);
        	g2d.fillRect(x1[i][0], y1[i][0], w1[i][0],h1[i][0]);
        	g2d.setColor(Color.WHITE);
        	g2d.drawRect(x1[i][1], y1[i][1], w1[i][1],h1[i][1]);
        	g2d.fillOval(bto1[i][0], bto1[i][1], 10, 10);
		}
    	
    	//USB e P2
    	g2d.setColor(Color.DARK_GRAY);
    	g2d.fillRect(320, 320, 40, 13);
    	g2d.fillRect(320, 337, 40, 13);

    	g2d.fillOval(320, 355, 10, 10);
    	g2d.fillOval(335, 355, 10, 10);

    	//Marca do pc
    	g2d.setColor(Color.WHITE);
    	g2d.drawString("AlunoTEC", 215, 540);
    }
    
    public static void desenharPoligono(Graphics2D g2d, int x0, int y0, int diametro, int numFaces){
    	Polygon p = new Polygon();
    	for(int i = 0; i < numFaces;i++){
    		p.addPoint ((int) (diametro/2 * Math.cos( i* 2 * Math.PI/ numFaces) + x0),(int) (diametro/2 * Math.sin( i* 2 * Math. PI/ numFaces) + y0));
    	}
    		
    	g2d.setColor(new Color(251, 200, 2)); // Set uma cor para o poligono
    	g2d.fillPolygon(p);	
    }
    
    
    	
}
