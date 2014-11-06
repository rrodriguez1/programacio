package net.raquel;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author alumne1daw
 *
 */
public class Exercit {
/**
 *
 */
private ArrayList<Soldat> soldats;
/**
 *
 */

private Random r = new Random();

private int direccio;

private int desti;

private int inici;

public Exercit (final int inicio, final int destino){
	soldats = new ArrayList<Soldat>();
	inici = inicio;
	desti = destino;
calculardireccion();
}

public void afegirsoldat(final Soldat nousoldat){
	soldats.add(nousoldat);
}

public void calculardireccion() {
	if (inici == 0){
		direccio =  1;
	}else{
		direccio = -1;
	}
}

public void cambiardireccion() {
	int guardar = inici;
	inici = desti;
	desti = guardar;
	calculardireccion();
}

public void posicionar(final int files) {
	int [] filescamp = new int[files];
	int y = 50;
	int x = 50;
	int px = 0;
	for (int i = 0; i < soldats.size(); i++){
		int fila = r.nextInt(files);
		y = y * fila;
		px = x * filescamp[fila] * direccio;
		soldats.get(i).posicionar(inici + px, y);
		filescamp[fila]++;
		y = 50;
	}
}

public ArrayList<Soldat> getSoldats() {
	return soldats;
}

public void moversoldados() {
	for (int i = 0; i < soldats.size(); i++){
		if (soldats.get(i).getImatge().getX() != desti){
			soldats.get(i).avanzar(direccio);
		}
	}

}


public int getDesti() {
	return desti;
}
}
