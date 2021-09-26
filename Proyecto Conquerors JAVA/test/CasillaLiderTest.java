package org.pmoo.proyecto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasillaLiderTest {
	
	int contrasena;
	Fuego cartFuego;
	Hoja cartHoja;
	Agua cartAgua;
	Psico cartPsico;
	PersonajeDelMapa entrenador,lider;
	CasillaLider c1;

	@Before
	public void setUp() throws Exception {
		cartFuego=new Fuego ("Celtic",5);
		cartAgua = new Agua("Heaton",7);
		cartHoja =new Hoja("Lake",9);
		cartPsico= new Psico("TUT",11);
		entrenador=new PersonajeDelMapa("TUT",cartPsico);
		lider=new PersonajeDelMapa("Ass",cartFuego);
		c1=new CasillaLider(entrenador, lider)	;
	}

	@After
	public void tearDown() throws Exception {
		cartFuego=null;
		cartAgua =null;
		cartHoja =null;
		cartPsico=null;
		lider=null;
		c1=null;
	}

	@Test
	public void testCasillaLider() {
		assertNotNull(c1);
	}

	@Test
	public void testGetHaGanadoALider() {
		assertEquals(c1.getLider().getVecesDerrotado(),0);
		assertFalse(c1.getHaGanadoALider());
		Carta cart1=new Fuego("Firer", 99);
		Jugador.getJugador().getListaCartas().anadirCarta(cart1);
		c1.lucharConLider();
		assertEquals(c1.getLider().getVecesDerrotado(),1);
		assertTrue(c1.getHaGanadoALider());
	}

	@Test
	public void testLucharConLider() {
		Carta cart1=new Fuego("Firer", 99);
		Jugador.getJugador().getListaCartas().anadirCarta(cart1);
		c1.lucharConLider();
		}

	@Test
	public void testLucharConEntrenador() {
		Carta cart1=new Fuego("Firer", 99);
		Jugador.getJugador().getListaCartas().anadirCarta(cart1);
		c1.lucharConEntrenador();
		}

	@Test
	public void testCasilla() {
		assertNotNull(c1);
	}

	@Test
	public void testGetEntrenador() {
		assertNotNull(c1.getEntrenador());
	}
}