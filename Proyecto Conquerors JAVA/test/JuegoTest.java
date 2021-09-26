package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest extends TestCase{
	Juego juego1;

	@Before
	public void setUp() throws Exception {
		juego1=new Juego();
	}

	@After
	public void tearDown() throws Exception {
		juego1=null;
	}

	@Test
	public void testJuego() {
		assertNotNull(juego1);
	}
	
	@Test
	public void testComprobarContrasena(){
		assertTrue(juego1.comprobarContrasena(199));
		assertFalse(juego1.comprobarContrasena(000));
		assertFalse(juego1.comprobarContrasena(1134));
		assertTrue(juego1.comprobarContrasena(105));
		assertTrue(juego1.comprobarContrasena(499));
		assertTrue(juego1.comprobarContrasena(400));
		assertFalse(juego1.comprobarContrasena(500));
		assertTrue(juego1.comprobarContrasena(005));
	}
	

	@Test
	public void testPedirContrasena() {
		System.out.println("En esta prueba hay que comprobar que se nos pida la contrasena.");
		System.out.println("Si metemos una contrasena falsa nos dice que es incorrecta.");
		System.out.println("Si metemos una contrasena verdadera nos dice que es correcta.");
		juego1.pedirContrasena();
		//La prueba funciona correctamente.
		}
	

	@Test
	public void testEscribirNarracion(){
		Narracion pNarracion=new Narracion(00, "Hello World!");
		ListaNarraciones.getListaNarraciones().aniadirNarracion(pNarracion);
		juego1.escribirNarracion();
		//Correcto, la narracion aparece por consola.
	}

	@Test
	public void testGetMiJuego() {
		assertNotNull(Juego.getMiJuego());
	}

}
