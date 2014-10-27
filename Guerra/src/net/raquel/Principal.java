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
ArrayList<LLUITADORESQ> guerreros;
ArrayList<LLUITADORDRET> peleones;
public void run(){
setSize(600,600);
guerreros = new ArrayList();
peleones = new ArrayList();
int posicion = 0;
for (int i = 0 ; i < 10;i++){
	guerreros.add(new LLUITADORESQ(i,posicion));
	peleones.add(new LLUITADORDRET(i,posicion));
	posicion = posicion + 50;
}

for (int i = 0; i < guerreros.size() ; i++){
	add(guerreros.get(i).getImatge());
	add(peleones.get(i).getImatge());
}
while(1 >0){
for (int i = 0; i < guerreros.size(); i++){

	guerreros.get(i).getImatge().move(5, 0);
	peleones.get(i).getImatge().move(-5, 0);


}
pause(100);
}
}}