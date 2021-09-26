package org.pmoo.proyecto;

import junit.framework.TestCase;

public class CasillaTest extends TestCase
{
	Jugador unJugador= Jugador.getJugador();
	Carta c1=new Fuego("heaton", 20);
	PersonajeDelMapa entren1=new PersonajeDelMapa("Look", c1);
	Casilla nuevaCas;
	protected void setUp() throws Exception {
		nuevaCas= new Casilla(entren1);
	}

	protected void tearDown() throws Exception {
		nuevaCas=null;
	}

	public void testCasilla() {
		assertNotNull(nuevaCas);
	}

	public void testGetEntrenador() 
	{
		assertEquals(nuevaCas.getEntrenador().getNombre(),"Look");
	}
	public void testLucharConEntrenador() 
	{ 
		assertTrue(nuevaCas.getEntrenador().getVecesDerrotado()==0);
		Carta c2=new Agua("Waterade", 25);
		Jugador.getJugador().getListaCartas().anadirCarta(c2);
		nuevaCas.lucharConEntrenador();
		assertTrue(nuevaCas.getEntrenador().getVecesDerrotado()>0);
	}

}
