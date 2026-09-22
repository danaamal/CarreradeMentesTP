
public class Casilla {
	private String color;
	private TipoCasilla tipoCasilla;
	private Categoria categoria;
	

	public Casilla(String color, Categoria categoria,TipoCasilla tipoCasilla) {
		this.color=color;
		this.categoria=categoria;
		this.tipoCasilla=tipoCasilla;
	}
	public TipoCasilla getTipoCasilla(){
		return tipoCasilla;
	}
	public Categoria obtenerCategoria() {
		return categoria;
	}
	
	
	public void setCategoria(Categoria c) {
		this.categoria=c;
	}
	public Boolean tieneEstrella() {
		if (tipoCasilla==TipoCasilla.ESTRELLA) {
			return true;
		}
		else {return false;}
	}
	public Boolean esGris() {
		if (tipoCasilla==TipoCasilla.GRIS) {
			return true;
		}
		else {return false;}
	}
}
