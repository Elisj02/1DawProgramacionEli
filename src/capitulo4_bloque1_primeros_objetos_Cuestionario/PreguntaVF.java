package capitulo4_bloque1_primeros_objetos_Cuestionario;

public class PreguntaVF extends Preguntas {

	public String respuestaCorrecta;

	public PreguntaVF() {
	}

	public PreguntaVF(String enunciado, String respuestaCorrecta) {
		super(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
	}

	@Override
	public void muestraEnPantalla() {
		System.out.println(enunciado);
		System.out.println("V-Para verdadero" + "\t" + "F- Para falso");
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	@Override
	public String toString() {
		return "PreguntaVF [respuestaCorrecta=" + respuestaCorrecta + ", enunciado=" + enunciado + ", esCorecta()="
				+ esCorecta(respuestaCorrecta) + ", getRespuestaCorrecta()=" + getRespuestaCorrecta() + "]";
	}

	@Override
	public boolean esCorecta(String respuestaUsuario) {
		if (respuestaUsuario.equals(respuestaCorrecta)) {
			return true;
		}
		return false;
	}

}