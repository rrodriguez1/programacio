/**
 *
 */
package net.raquel;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import java.util.ArrayList;
/**
 * @author Raquel
 *
 */
public class Principal extends GraphicsProgram {

public void run(){

setSize(600,600);
CampJoc campo = new CampJoc(this);
Exercit exercit = new Exercit(0,550);
for (int i = 0; i < 10; i++){
	Soldat a = new Soldat("esquerra.jpg",+1);
	add(a.getImatge());
	exercit.afegirsoldat(a);
}
campo.afegirexercit(exercit);
exercit = new Exercit(550,0);
for (int i = 0; i < 10; i++){
	Soldat a = new Soldat("dreta.gif",-1);
	add(a.getImatge());
	exercit.afegirsoldat(a);
}
campo.afegirexercit(exercit);

	campo.posicionar();
	campo.mover();
}
}