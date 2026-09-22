import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main (String[] args) {
		Tablero tablero= new Tablero();
		List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1));
        jugadores.add(new Jugador(2));
		Juego juego = new Juego(jugadores,tablero);
		juego.empezarTurno();
	
	}
}
