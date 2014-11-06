package net.raquel;

import java.util.ArrayList;

import acm.program.GraphicsProgram;

public class CampJoc extends GraphicsProgram {

private ArrayList<Exercit> exercits;

private Principal campo;

private int files = 6;

public CampJoc(final Principal canvas) {
	campo = canvas;
	exercits = new ArrayList<Exercit>();
}


public void afegirexercit(Exercit exercit) {
	exercits.add(exercit);
}

public void posicionar(){
exercits.get(0).posicionar(files);
exercits.get(1).posicionar(files);
}

public void mover(){
	while(1 > 0){
		for (int i = 0; i < exercits.size(); i++) {
			exercits.get(i).moversoldados();
			pause(100);
			if (exercits.get(i).getSoldats().get(i).getImatge().getX() == exercits.get(i).getDesti()){
				cambiardireccion();
				posicionar();
			}
		}

	//	
		//campo.posicionar();
	}

}

public void cambiardireccion() {
	for (int i = 0; i < exercits.size(); i ++) {
		exercits.get(i).cambiardireccion();
	}
}

}

