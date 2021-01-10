package spaceInvaders;

import capitulo5.bloque1.Utils;

public class Humano {

int puntosDeVida = Utils.obtenerNumeroAzar(50, 100);
String nombre;
boolean vivo = true;
int disparoRecibido = 0;

public int getDisparoRecibido() {
	return disparoRecibido;
}

public void setDisparoRecibido(int disparoRecibido) {
	this.disparoRecibido = disparoRecibido;
}

public int getPuntosDeVida() {
	return puntosDeVida;
}

public void setPuntosDeVida(int puntosDeVida) {
	this.puntosDeVida = puntosDeVida;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean isVivo() {
	return vivo;
}

public void setVivo(boolean vivo) {
	this.vivo = vivo;
}
public Humano() {
	
}
public Humano(String nombre) {
	this.nombre = nombre;

}

@Override
public String toString() {
	return "Humano [puntosDeVida=" + puntosDeVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
}
}
