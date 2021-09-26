package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonajeDelMapaTest extends TestCase{
	
	PersonajeDelMapa personaje;
	Fuego cartFuego;
	@Before
	public void setUp() throws Exception {
		cartFuego=new Fuego ("Celtic",5);
		personaje=new PersonajeDelMapa("Ass",cartFuego);
	}

	@After
	public void tearDown() throws Exception {
		personaje=null;
	}

	@Test
	public void testPersonajeDelMapa() {
		assertNotNull(personaje);
		assertEquals(personaje.getNombre(),"Ass");
		assertEquals(personaje.getSuCarta().getNombre(),"Celtic");
		assertEquals(personaje.getVecesDerrotado(),0);
	}

	@Test
	public void testGetNombre() {
		personaje.setNombre("Ass");
		assertEquals(personaje.getNombre(),"Ass");
	}

	@Test
	public void testGetSuCarta() {
		personaje.getSuCarta().setNombre("Celtic");
		personaje.getSuCarta().setNivel(5);
		assertEquals(personaje.getSuCarta(),cartFuego);
	}


}
