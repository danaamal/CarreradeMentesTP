
public class Pregunta {
	private String pregunta;
	private String respuestaCorrecta;
	
	public Pregunta(String pregunta,String respuestaCorrecta) {
		this.pregunta=pregunta;
		this.respuestaCorrecta=respuestaCorrecta;
	}
	
	public Boolean esCorrecta(String respuesta) {
		if (respuesta.equals(respuestaCorrecta)) {
			return true;
		}
		else
			{
			return false;
			}
		
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
}
