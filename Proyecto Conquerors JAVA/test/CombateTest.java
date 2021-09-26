package org.pmoo.proyecto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CombateTest {

	Carta wake;
	PersonajeDelMapa pEntrenador;
	Casilla c1;
	Carta niko;
	
	@Before
	public void setUp() throws Exception {
		wake=new Fuego("Wake", 30);
		pEntrenador= new PersonajeDelMapa("Alan", wake);
		c1=new Casilla(pEntrenador);
		niko=new Agua("Niko", 36);
		Jugador.getJugador().getListaCartas().anadirCarta(niko);
	}

	@After
	public void tearDown() throws Exception {
		wake=null;
		pEntrenador=null;
		c1=null;
		niko=null;
	}

	@Test
	public void testCombate() {
		assertTrue(c1.getEntrenador().getVecesDerrotado()==0);
		c1.lucharConEntrenador();
		assertTrue(c1.getEntrenador().getVecesDerrotado()>0);
	}

	@Test
	public void testGetCarta1() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCarta2() {
		fail("Not yet implemented");
	}

	@Test
	public void testSimularCombate() {
		assertTrue(c1.getEntrenador().getVecesDerrotado()==0);
		c1.lucharConEntrenador();
		assertTrue(c1.getEntrenador().getVecesDerrotado()>0);
	}

}
