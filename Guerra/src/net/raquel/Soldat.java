package net.raquel;
/**
 *
 */
import java.awt.Image;

import acm.graphics.GImage;
/**
 *
 * @author alumne1daw
 *
 */
public class Soldat {

private GImage imatge;

private int direccio;

private int velocidad = 5;

public GImage getImatge() {
	return imatge;
}

public Soldat(final String imagen, final int direccion) {
	imatge = new GImage(imagen);
	imatge.setSize(50, 50);
	direccio = direccion;
}

public void posicionar(final int x, final int y){
	imatge.setLocation(x, y);
}

public void setDireccio(int direccio) {
	this.direccio = direccio;
}

public void avanzar(final int direccion){
	this.imatge.move(velocidad * direccion, 0);
}

public int getDireccio() {
	return direccio;
}
}