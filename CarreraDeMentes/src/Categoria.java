import java.util.List;
import java.util.Random;

public class Categoria {
	private TipoCategoria tipoDeCategoria;
	private List<Pregunta> listaDePreguntas;
	
	public Categoria(TipoCategoria tipoDeCategoria,List<Pregunta> listaDePreguntas) {
		this.tipoDeCategoria=tipoDeCategoria;
		this.listaDePreguntas=listaDePreguntas;//q las construya el main yo ni problema ue
	}
	
	public Pregunta obtenerPregunta() {
		Random random = new Random();
		return listaDePreguntas.get(random.nextInt(listaDePreguntas.size()));// 
		
	}
	public void mostrarInfo() {
		System.out.println(tipoDeCategoria);
	}
	public TipoCategoria getTipoDeCategoria() {
		return tipoDeCategoria;
	}
	public void setTipoDeCategoria(TipoCategoria tipoDeCategoria) {
		this.tipoDeCategoria = tipoDeCategoria;
	}
	
}
