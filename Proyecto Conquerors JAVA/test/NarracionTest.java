package org.pmoo.proyecto;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

@SuppressWarnings("unused")
public class NarracionTest extends TestCase {
	Narracion n1;
	
	protected void setUp() {
		n1=new Narracion(99,"Hello World!");	
	}

	protected void tearDown() {
		n1=null;	
	}

	@Test
	public void testNarracion() {
		assertNotNull(n1);
	}

	@Test
	public void testImprimirTexto() {
		System.out.println("Asegurate de que imprima *Hello World*, (sin asteriscos). ");
		n1.imprimirTexto();
	}

	@Test
	public void testTieneEsteId() {
		assertTrue(n1.tieneEsteId(99));
	}
}
