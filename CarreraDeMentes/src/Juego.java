import java.util.List;


public class Juego {
	private List<Jugador> jugadores;
	private Dado dado;
	private Tablero tablero;
	private int turnoActual=0;
	
	public Juego(List<Jugador> jugadores, Tablero tablero) {
		this.jugadores=jugadores;
		this.tablero=tablero;
		this.dado = new Dado();
	}
	
	public void empezarTurno() {
		Jugador jugador=jugadorActual();
		int numero = dado.tirarDado();
		System.out.println("El dado salio:" + numero);
		jugador.avanzar(numero);
		Casilla casilla=tablero.obtenerCasilla(jugador.getPosJugador());
		
		if (casilla.esGris()) {
		    TipoCategoria tipoElegido = jugador.elegirCategoria();
		    Categoria categoria = tablero.buscarCategoriaPorTipo(tipoElegido);
		    responderPregunta(categoria, jugador);
		} else {
		    Categoria categoria = casilla.obtenerCategoria();
		    System.out.println("La categoría es: " + categoria.getTipoDeCategoria());
		    System.out.println("La casilla es: " + casilla.getTipoCasilla());
		    boolean correcta = responderPregunta(categoria, jugador);
		    if (correcta && casilla.tieneEstrella()) {
		        jugador.agregarCategoriaG(categoria);
		        System.out.println("Ganaste la categoria!!");
		    }
		}
		terminarTurno();
		
		//System.out.println("Llego hasta aca."+jugador.getPosJugador()+casilla.obtenerNumCasilla());
		System.out.println("Llego hasta aca."+jugador.getPosJugador());
	}
	
	private boolean responderPregunta(Categoria categoria, Jugador jugador) {
	    Pregunta pregunta = categoria.obtenerPregunta();
	    System.out.println(pregunta.getPregunta());
	    String respuesta = jugador.responder();
	    boolean correcta = pregunta.esCorrecta(respuesta);
	    System.out.println(correcta ? "es correcta" : "es incorrecta");
	    return correcta;
	}
	
	public void terminarTurno() {
		turnoActual++;
	}
	
	
	public Jugador jugadorActual(){
		int cantJugadores=jugadores.size();
		if (turnoActual>=cantJugadores) {
			turnoActual=0;
		}
		return jugadores.get(turnoActual);
	}
}
