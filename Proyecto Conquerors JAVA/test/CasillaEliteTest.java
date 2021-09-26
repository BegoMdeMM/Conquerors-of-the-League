package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CasillaEliteTest extends TestCase{
	int contrasena;
	Fuego cartFuego;
	Hoja cartHoja;
	Agua cartAgua;
	Psico cartPsico;
	PersonajeDelMapa entrenador,personaje1,personaje2,personaje3;
	CasillaElite c1;
	
	@Before
	public void setUp() throws Exception {
		cartFuego=new Fuego ("Celtic",5);
		cartAgua = new Agua("Heaton",7);
		cartHoja =new Hoja("Lake",9);
		cartPsico= new Psico("TUT",11);
		entrenador=new PersonajeDelMapa("TUT",cartPsico);
		personaje1=new PersonajeDelMapa("Ass",cartFuego);
		personaje2=new PersonajeDelMapa("Ess",cartAgua);
		personaje3=new PersonajeDelMapa("Iss",cartHoja);
		c1=new CasillaElite(entrenador, personaje1, personaje2, personaje3)	;	
}

	@After
	public void tearDown() throws Exception {
		cartFuego=null;
		cartAgua =null;
		cartHoja =null;
		cartPsico=null;
		personaje1=null;
		personaje2=null;
		personaje3=null;
		c1=null;
	}

	@Test
	public void testCasillaElite() {
		assertNotNull(c1);
	}

	@Test
	public void testGetElite1() {
		assertEquals(c1.getElite1().getNombre(),"Ass");
	}

	@Test
	public void testGetElite2() {
		assertEquals(c1.getElite2().getNombre(),"Ess");
	}

	@Test
	public void testGetElite3() {
		assertEquals(c1.getElite3().getNombre(),"Iss");
	}

	@Test
	public void testLucharConElite() {
		Coordenada pCoordenada=new Coordenada(0,6);
		Jugador.getJugador().setCoordenada(pCoordenada);
		Fuego cart1=new Fuego("Fire", 30);
		cart1.recuperarVida();
		Jugador.getJugador().getListaCartas().anadirCarta(cart1);
		int nivelAnterior=c1.getElite1().getSuCarta().getNivel();
		//Coordenada pCoordenada=new Coordenada(0,0);
		//Jugador pJugador=new Jugador("Anon", cartFuego, pCoordenada);
		c1.lucharConElite();
		assertFalse(c1.getElite1().getSuCarta().getNivel()==nivelAnterior);
	}

	@Test
	public void testEscribirContrasena() {		
		Coordenada pCoordenada=new Coordenada(0,6);
		Jugador.getJugador().setCoordenada(pCoordenada);
		Fuego cart1=new Fuego("Fire", 30);
		cart1.recuperarVida();
		Jugador.getJugador().getListaCartas().anadirCarta(cart1);
		personaje1.getSuCarta().setVidaActual(0);
		personaje2.getSuCarta().setVidaActual(0);
		personaje3.getSuCarta().setVidaActual(0);		
		
		int contrasena = (Jugador.getJugador().getListaCartas().elegirCarta().getNivel())+((Jugador.getJugador().getCoordenada().getPosCol())*100);
		System.out.println("La contrasena esperada es: "+contrasena+ " y el programa dice que es ");
		c1.escribirContrasena();
	}

	@Test
	public void testCasilla() {
		assertNotNull(c1);
	}

	@Test
	public void testGetEntrenador() {
		assertNotNull(entrenador);
		assertEquals(entrenador.getNombre(),"TUT");
	}

	@Test
	public void testLucharConEntrenador() {
		c1.lucharConEntrenador();
	}

}
