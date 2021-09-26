package org.pmoo.proyecto;

import org.pmoo.proyecto.Fuego;

import junit.framework.TestCase;

public class FuegoTest extends TestCase {
	Fuego Fuego1;

	public FuegoTest(String name) {
		super(name);
	}

	protected void setUp() {
		Fuego1 = new Fuego("Heaton",5);
		
	}

	protected void tearDown()  {
		Fuego1 = null;
		
	}

	public void testActualizarNivel() {
		Fuego1.actualizarNivel(6);
		assertEquals(Fuego1.getAtaque(),70);
		assertEquals(Fuego1.getDefensa(),28);
		assertEquals(Fuego1.getVelocidad(),46);
		assertEquals(Fuego1.getVidaActual(),70);
		assertEquals(Fuego1.getVidaMaxima(),72);
		assertEquals(Fuego1.getNivel(),6);
		
	}


}
