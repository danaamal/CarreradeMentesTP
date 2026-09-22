import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador {
	private int numJugador;
	private List<Categoria> categoriasGanadas;
	private int posicionJugador;

	public Jugador(int numJugador) {
		this.numJugador=numJugador;
		this.categoriasGanadas= new ArrayList<>(5);
		this.posicionJugador=0;
	}
	
	public void avanzar(int pasos) {
		
		posicionJugador=(posicionJugador+pasos);
											
	}

	public String responder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba su respuesta: ");
		String respuesta = scanner.nextLine();
		System.out.println(respuesta);
		scanner.close();
		return respuesta;
	}
	
	public void agregarCategoriaG(Categoria c) {
		categoriasGanadas.add(c);
	}
	
	public int getPosJugador() {
		return posicionJugador;
	}
	
	public TipoCategoria elegirCategoria() {
			System.out.println("Elija categoría:");
			System.out.println("1. Historia y Geografía");
			System.out.println("2. Naturaleza y Ciencia");
			System.out.println("3. Arte y Literatura");
			System.out.println("4. Deportes y Juegos");
			System.out.println("5. Entretenimiento y Espectaculo");
			Scanner scanner = new Scanner(System.in);
			int respuesta = scanner.nextInt();
			scanner.close();
			switch (respuesta) {
			    case 1:
			        System.out.println("Elegiste Historia y Geografía");
			        return TipoCategoria.HISTORIAYGEOGRAFIA;
			        
			    case 2:
			        System.out.println("Elegiste Naturaleza y Ciencia");
			        return TipoCategoria.NATURALEZAYCIENCIA;

			    case 3:
			        System.out.println("Elegiste Arte y Literatura");
			        return TipoCategoria.ARTEYLITERATURA;
			    case 4:
			        System.out.println("Elegiste Deportes y Juegos");
			        return TipoCategoria.DEPORTESYJUEGOS;
			    case 5:
			        System.out.println("Elegiste Entretenimiento y Espectaculo");
			        return TipoCategoria.ENTYESPECTAC;

			    default:
			        System.out.println("Categoría inválida");
		}
			return null;
			}
	}

