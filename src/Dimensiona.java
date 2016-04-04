import java.awt.Dimension;


/**
 * Classe responsavel por calcular as dimensoes do objeto 
 * enquanto o usuario redimensiona a tela
 * 
 * @author Marcos Thomaz
 *
 */
public class Dimensiona {
	
	private float x;
	private float y;
	
	/**
	 * Construtor da classe
	 * @param x
	 * @param y
	 */
	public Dimensiona(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(Dimension dim) {
		return (int)(this.x*dim.width);
	}
	
	public int getY(Dimension dim) {
		return (int)(this.y*dim.height);
	}
}
