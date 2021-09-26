package org.pmoo.proyecto;

import org.pmoo.proyecto.Carta;

import junit.framework.TestCase;

public class CartaTest extends TestCase {
	
		Carta carta1;
		Carta carta2;


	protected void setUp()  {
		carta1= new Hoja("Celtic",5);
		carta2= new Fuego("Heaton",3);
	
	}

	protected void tearDown()  {
		carta1 = null;
		carta2=null;
	}

	public void testCarta() {
		assertNotNull(carta1);
		assertNotNull(carta2);
		assertEquals(carta1.getNombre(),"Celtic");
		assertEquals(carta1.getNivel(),5);
		assertEquals(carta2.getNombre(),"Heaton");
		assertEquals(carta2.getNivel(),3);
	}

	public void testGetNombre() {
		carta1.setNombre("Celtic");
		carta2.setNombre("Heaton");
		assertEquals(carta1.getNombre(),"Celtic");
		assertEquals(carta2.getNombre(),"Heaton");
	}

	
	public void testRecuperarVida() {
		carta1.recuperarVida();
		assertEquals(carta1.getVidaActual(),carta1.getVidaMaxima());
	}

}
