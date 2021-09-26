package org.pmoo.proyecto;

import org.pmoo.proyecto.Carta;
import junit.framework.TestCase;

public class ListaCartasTest extends TestCase {
	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	public void setUp() throws Exception {
		c1=new Hoja("Celtic", 5);
		c2=new Fuego("Heaton", 4);
		c3=new Psico("Pacer", 3);
		c4=new Agua("Laker", 2);
	}
	public void tearDown() throws Exception {
		c1=null;
		c2=null;
		c3=null;
		c4=null;
		Jugador.getJugador().getListaCartas().resetear();
	}
	
	public void testGetLista() {
		assertNotNull(Jugador.getJugador().getListaCartas());
	}


	public void testAnadirCarta() {
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),0);
		Jugador.getJugador().getListaCartas().anadirCarta(c1);
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),1);
	}

	public void testEliminarCarta() {
		Jugador.getJugador().getListaCartas().anadirCarta(c1);
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),1);
		Jugador.getJugador().getListaCartas().anadirCarta(c2);
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),2);
		assertNotNull(Jugador.getJugador().getListaCartas().buscarCartaPorId(01,3));
		Jugador.getJugador().getListaCartas().eliminarCarta(c1);
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),1);
		assertNull(Jugador.getJugador().getListaCartas().buscarCartaPorId(01,3));
		assertTrue(Jugador.getJugador().getListaCartas().esta(c2));
	}

	public void testResetear() {
		Jugador.getJugador().getListaCartas().anadirCarta(c1);
		Jugador.getJugador().getListaCartas().anadirCarta(c2);
		Jugador.getJugador().getListaCartas().anadirCarta(c3);
		Jugador.getJugador().getListaCartas().anadirCarta(c4);
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),4);
		Jugador.getJugador().getListaCartas().resetear();
		assertEquals(Jugador.getJugador().getListaCartas().getTamano(),0);
	}


	public void testEsta() {
		Jugador.getJugador().getListaCartas().anadirCarta(c1);
		assertTrue(Jugador.getJugador().getListaCartas().esta(c1));
		assertFalse(Jugador.getJugador().getListaCartas().esta(c2));
	}

	public void testBuscarCartaPorId() {
		Jugador.getJugador().getListaCartas().anadirCarta(c1);
		assertTrue(Jugador.getJugador().getListaCartas().esta(c1));
		assertNull(Jugador.getJugador().getListaCartas().buscarCartaPorId(02,3));
		Jugador.getJugador().getListaCartas().anadirCarta(c2);
		assertTrue(Jugador.getJugador().getListaCartas().esta(c2));
	}
}