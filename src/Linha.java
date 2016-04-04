
/**
 * Classe que recebe os pontos da linha (X, Y)
 * @author Marcos Thomaz
 *
 */
public class Linha {
	
	private Dimensiona ponto0;
	private Dimensiona ponto1;
	
	/**
	 * 
	 * @param p0
	 * @param p1
	 */
	public Linha(Dimensiona p0, Dimensiona p1) {
		this.ponto0 = p0;
		this.ponto1 = p1;
	}
	
	/**
	 * 
	 * @return {@link Dimensiona}
	 */
	public Dimensiona getPonto0() {
		return this.ponto0;
	}
	
	/**
	 * 
	 * @return {@link Dimensiona}
	 */
	public Dimensiona getPonto1() {
		return this.ponto1;
	}
}
