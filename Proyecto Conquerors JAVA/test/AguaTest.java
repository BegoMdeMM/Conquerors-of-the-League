package org.pmoo.proyecto;

import org.pmoo.proyecto.Agua;

import junit.framework.TestCase;

public class AguaTest extends TestCase {
	Agua Agua1;

	public AguaTest(String name) {
		super(name);
	}

	protected void setUp() {
		Agua1 = new Agua("Water",5);
		
	}

	protected void tearDown()  {
		Agua1 = null;
		
	}

	public void testActualizarNivel() {
		Agua1.actualizarNivel(6);
		assertEquals(Agua1.getAtaque(),12);
		assertEquals(Agua1.getDefensa(),24);
		assertEquals(Agua1.getVelocidad(),18);
		assertEquals(Agua1.getVidaActual(),75);
		assertEquals(Agua1.getVidaMaxima(),80);
		assertEquals(Agua1.getNivel(),6);
		
	}


}

