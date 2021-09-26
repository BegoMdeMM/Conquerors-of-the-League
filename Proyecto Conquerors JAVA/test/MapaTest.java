package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MapaTest extends TestCase{

	@Before
	public void setUp() throws Exception {
		Mapa.getMapa().iniciarMapa();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAniadirCasilla() {
		Casilla pCas1=new Casilla(null);
		Mapa.getMapa().aniadirCasilla(pCas1, 0, 0);
		assertNotNull(Mapa.getMapa().getCasilla(0, 0));
		assertNull(Mapa.getMapa().getCasilla(0, 0).getEntrenador());
		assertNotNull(Mapa.getMapa().getCasilla(0, 1).getEntrenador());
	}

	@Test
	public void testGetMapa() {
		assertNotNull(Mapa.getMapa());
	}


	@Test
	public void testExistenCoordenadas() {
		Coordenada coord1=new Coordenada(2, 5);
		Coordenada coord2=new Coordenada(9, 7);
		assertTrue(Mapa.getMapa().existenCoordenadas(coord1));
		assertFalse(Mapa.getMapa().existenCoordenadas(coord2));
	}

}
