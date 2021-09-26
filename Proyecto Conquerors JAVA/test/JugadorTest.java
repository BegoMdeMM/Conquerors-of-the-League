package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JugadorTest extends TestCase{

	
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		Jugador.getJugador().resetear();
	}

	@Test
	public void testJugador() {
		assertNotNull (Jugador.getJugador());
	}

	@Test
	public void testGetJugador() {
		assertNotNull (Jugador.getJugador());
	}

	@Test
	public void testGetNombre() {
		assertEquals(Jugador.getJugador().getNombre(),null);
		Jugador.getJugador().setNombre("Anon");
		assertEquals(Jugador.getJugador().getNombre(),"Anon");
	}

	@Test
	public void testGetMiCarta() {
		//assertNull(Jugador.getJugador().getListaCartas().elegirCarta().getNombre());
		Carta carta1=new Agua("Wettyk", 10);
		Jugador.getJugador().getListaCartas().anadirCarta(carta1);
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getNombre(),"Wettyk");
	}

	@Test
	public void testSetNombre() {
		Jugador.getJugador().setNombre("Ares");
		assertEquals(Jugador.getJugador().getNombre(),"Ares");	}

	@Test
	public void testSetMiCarta() {
		Carta carta1=new Fuego("Heaton", 10);
		Jugador.getJugador().getListaCartas().anadirCarta(carta1);
		assertTrue(Jugador.getJugador().getListaCartas().esta(carta1));
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getNombre(),"Heaton");
	}

	@Test
	public void testIniciarJugador() {
		Jugador.getJugador().iniciarJugador();
		//Aparece por consola.
	}

	@Test
	public void testCombatirCon() {
		Carta pCartaRival=new Fuego("Firer", 5);
		pCartaRival.recuperarVida();
		Carta miCarta=new Agua("Aqura", 12);
		miCarta.recuperarVida();
		Jugador.getJugador().getListaCartas().anadirCarta(miCarta);
		assertEquals(pCartaRival.getVidaActual(),pCartaRival.getVidaMaxima());
		assertEquals(miCarta.getVidaActual(),miCarta.getVidaMaxima());
		Jugador.getJugador().combatirCon(pCartaRival);
		assertNotSame(miCarta.getVidaActual(),miCarta.getVidaMaxima());
		//No puedo mirar la vida del otro oponente al finalizar el combate porque se vuelve a recuperar de manera automatica
		//Se ve por consola que funciona.
	}

	@Test
	public void testRecuperarHP() {
		Carta carta1=new Fuego("Heaton", 5);
		Jugador.getJugador().getListaCartas().anadirCarta(carta1);
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getNombre(),"Heaton");	
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getVidaActual(),70);	
		Jugador.getJugador().getListaCartas().elegirCarta().setVidaActual(0);
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getVidaActual(),0);	
		Jugador.getJugador().getListaCartas().elegirCarta().recuperarVida();
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getVidaActual(),70);	
	}

	@Test
	public void testAvanzar() {
		Coordenada pCoordenada=new Coordenada(0, 5);
		Jugador.getJugador().setCoordenada(pCoordenada);
		int resul=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul, 50);
		Jugador.getJugador().avanzar();
		int resul2=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul2, 60);
	}

	@Test
	public void testRetroceder() {
		Coordenada pCoordenada=new Coordenada(1, 1);
		Jugador.getJugador().setCoordenada(pCoordenada);
		int resul=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul, 11);
		Jugador.getJugador().retroceder();
		int resul2=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul2, 01);
	}

	@Test
	public void testGetCoordenada() {
		Coordenada pCoordenada=new Coordenada(0, 5);
		Jugador.getJugador().setCoordenada(pCoordenada);
		assertNotNull(Jugador.getJugador().getCoordenada());
	}

	@Test
	public void testConvertirCoordenada() {
		Coordenada pCoordenada=new Coordenada(0, 5);
		Jugador.getJugador().setCoordenada(pCoordenada);
		int resul=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul,50);
		Coordenada pCoordenada2=new Coordenada(2, 5);
		Jugador.getJugador().setCoordenada(pCoordenada2);
		int resul2=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul2,52);
	}

	@Test
	public void testSetCoordenada() {
		Coordenada pCoordenada=new Coordenada(1, 1);
		Jugador.getJugador().setCoordenada(pCoordenada);
		int resul=Jugador.getJugador().convertirCoordenada();
		assertEquals(resul, 11);
	}
	
	@Test
	public void testResetear() {
		Jugador.getJugador().setNombre("Ares");
		assertEquals(Jugador.getJugador().getNombre(),"Ares");
		Carta carta1=new Fuego("Heaton", 10);
		Jugador.getJugador().getListaCartas().anadirCarta(carta1);
		assertEquals(Jugador.getJugador().getListaCartas().elegirCarta().getNombre(),"Heaton");	
		Coordenada pCoordenada=new Coordenada(1, 1);
		Jugador.getJugador().setCoordenada(pCoordenada);
		Jugador.getJugador().resetear();
		assertNull(Jugador.getJugador().getNombre());
		assertNotNull(Jugador.getJugador().getCoordenada()); //Not null porque lo resetea a 0,0.
	}

}
