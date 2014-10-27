package net.raquel;

import acm.graphics.GImage;

public class LLUITADORESQ {

	private GImage imatge;

	private int id;
	private int velocitat;

	public LLUITADORESQ (final int idparam, final int y){
		id = idparam;
		velocitat = 5;
		imatge = new GImage("esquerra.jpg");
		imatge.setSize(50, 50);
		imatge.setLocation(0,y);
	}

	public GImage getImatge() {
		return imatge;
	}

	public int getId() {
		return id;
	}

	public int getVelocitat() {
		return velocitat;
	}


}
