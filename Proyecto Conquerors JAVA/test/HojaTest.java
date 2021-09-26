package org.pmoo.proyecto;

import org.pmoo.proyecto.Hoja;

import junit.framework.TestCase;

public class HojaTest extends TestCase {
	Hoja Verde1;

	public HojaTest(String name) {
		super(name);
	}

	protected void setUp() {
		Verde1 = new Hoja("Celtic",5);
		
	}

	protected void tearDown()  {
		Verde1 = null;
		
	}

	public void testActualizarNivel() {
		Verde1.actualizarNivel(6);
		assertEquals(Verde1.getAtaque(),52);
		assertEquals(Verde1.getDefensa(),28);
		assertEquals(Verde1.getVelocidad(),40);
		assertEquals(Verde1.getVidaActual(),70);
		assertEquals(Verde1.getVidaMaxima(),72);
		assertEquals(Verde1.getNivel(),6);
		
	}


}
