package org.pmoo.proyecto;

import org.pmoo.proyecto.Psico;

import junit.framework.TestCase;

public class PsicoTest extends TestCase {
	Psico Psico1;

	public PsicoTest(String name) {
		super(name);
	}

	protected void setUp() {
		Psico1 = new Psico("Himnotic",5);
		
	}

	protected void tearDown()  {
		Psico1 = null;
		
	}

	public void testActualizarNivel() {
		Psico1.actualizarNivel(6);
		assertEquals(Psico1.getAtaque(),18);
		assertEquals(Psico1.getDefensa(),18);
		assertEquals(Psico1.getVelocidad(),18);
		assertEquals(Psico1.getVidaActual(),15);
		assertEquals(Psico1.getVidaMaxima(),18);
		assertEquals(Psico1.getNivel(),6);
		
	}


}

