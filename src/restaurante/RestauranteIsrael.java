package restaurante;

/**
 * La clase RestauranteIsrael gestiona el stock de comida y numero de comensales
 * a los que puede servir
 * 
 * @author daw1xx
 * @version 1.0
 */
public class RestauranteIsrael {
	private int patatas;
	private int calamares;
	private static RestauranteIsrael miRestaurante;

	/**
	 * Constructor de la clase RestauranteIsrael para la gestion del restaurante
	 * 
	 * @param a Indica el numero de patatas que hay en el stock
	 * @param b Indica el numero de calamares que hay en el stock
	 */
	public RestauranteIsrael(int a, int b) {
		this.setPatatas(a);
		this.setCalamares(b);
	}

// Metodo por el que se calcula el numero de comensales por cada patata salen 3 raciones
	int cantP() {
		int a = this.getPatatas() * 3;
		return a;
	}

	// Metodo por el que se calcula el numero de comensales por cada calamar salen 6
	// raciones
	int cantC() {
		int ch = this.getCalamares() * 6;
		return ch;
	}

	/**
	 * Metodo por el cual se añade una cantidad de calamares al stock del
	 * restaurante
	 * 
	 * @param c La cantidad de calamaras a añadir al stock
	 */
	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	/**
	 * Metodo por el cual se añade una cantidad de calamares al stock del
	 * restaurante
	 * 
	 * @param d La cantidad de patatas a añadir al stock
	 */
	public void addPatatas(int d) {
		this.setPatatas(this.getPatatas() + d);
	}

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		miRestaurante = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + miRestaurante.getCalamares());
		System.out.println("Cantidad de patatas: " + miRestaurante.getPatatas());
		calculaComensales(miRestaurante);
		miRestaurante.addCalamares(1);
		miRestaurante.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(miRestaurante.getPatatas() + " patatas.\n" + miRestaurante.getCalamares() + " calamares");
		calculaComensales(miRestaurante);
	}

	private static void calculaComensales(RestauranteIsrael r1) {
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getPatatas() {
		return patatas;
	}

	/**
	 * 
	 * @param patatas
	 */
	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	/**
	 * 
	 * @return
	 */
	public int getCalamares() {
		return calamares;
	}

	/**
	 * 
	 * @param calamares
	 */
	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}