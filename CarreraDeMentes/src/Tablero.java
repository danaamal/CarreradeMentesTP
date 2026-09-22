import java.util.ArrayList;
import java.util.List;

public class Tablero {
	private List<Casilla> casillas;
	private List<Categoria> categorias;
	
	public Tablero() {
		
		this.casillas=new ArrayList<>();
		this.categorias = new ArrayList<>();
		
		List<Pregunta> preguntasHistoriayGeo = new ArrayList<>();
		preguntasHistoriayGeo.add(new Pregunta("¿En qué año comenzó la Revolución de Mayo?", "1810"));;
		Categoria historiaygeo = new Categoria(TipoCategoria.HISTORIAYGEOGRAFIA, preguntasHistoriayGeo);
		categorias.add(historiaygeo);
		
		List<Pregunta> preguntasArteyLit = new ArrayList<>();
		preguntasArteyLit.add(new Pregunta("¿Quien pinto la monalisa?", "Da Vinci"));
		Categoria arteylit = new Categoria(TipoCategoria.ARTEYLITERATURA, preguntasArteyLit);
		categorias.add(arteylit);
		
		List<Pregunta> preguntasNatyCiencia = new ArrayList<>();
		preguntasNatyCiencia.add(new Pregunta("¿Que satelite natural tiene la tierra?", "Luna"));
		Categoria natyciencia = new Categoria(TipoCategoria.NATURALEZAYCIENCIA, preguntasNatyCiencia);
		categorias.add(natyciencia);
		
		
		casillas.add(new Casilla("Celeste", historiaygeo,TipoCasilla.NORMAL));
		casillas.add(new Casilla("Celeste", historiaygeo ,TipoCasilla.ESTRELLA));
		casillas.add(new Casilla("Marron", arteylit ,TipoCasilla.NORMAL));
		casillas.add(new Casilla("Marron", arteylit ,TipoCasilla.ESTRELLA));
		casillas.add(new Casilla("Amarillo", natyciencia ,TipoCasilla.NORMAL));
		casillas.add(new Casilla("Amarillo", natyciencia ,TipoCasilla.ESTRELLA));		
	
		casillas.add(new Casilla("Celeste",null ,TipoCasilla.GRIS));
		
		//casillas.add(new Casilla ))
		//casillas.add(new Casilla ))
		//casillas.add(new Casilla ))
		//casillas.add(new Casilla ))
	}
	
	public Casilla obtenerCasilla(int posicion) {
		
		
		return casillas.get(posicion-1);
	}
	
	
	public Categoria buscarCategoriaPorTipo(TipoCategoria tipoElegido) {
	    for (Categoria categoria : categorias) {
	        if (categoria.getTipoDeCategoria() == tipoElegido) {
	            return categoria;
	        }
	    }
	    
	    return null;
	}
	
}
