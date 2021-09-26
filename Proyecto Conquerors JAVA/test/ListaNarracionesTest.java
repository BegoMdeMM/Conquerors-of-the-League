package org.pmoo.proyecto;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class ListaNarracionesTest extends TestCase {
	
	Narracion n1;
	Narracion n2;
	Narracion n3;
	Narracion n4;
	Narracion n5;
	Narracion n6;

	@Before
	public void setUp() throws Exception {
		n1=new Narracion(01, "Esta es la narracion 1.");
		n2=new Narracion(02, "Esta es la narracion 2.");
		n3=new Narracion(03, "Esta es la narracion 3.");
		n4=new Narracion(04, "Esta es la narracion 4.");
		n5=new Narracion(05, "Esta es la narracion 5.");
		n6=new Narracion(06, "Esta es la narracion 6.");
	}

	@After
	public void tearDown() throws Exception {
		n1=null;
		n2=null;
		n3=null;
		n4=null;
		n5=null;
		n6=null;
		ListaNarraciones.getListaNarraciones().resetear();
	}

	@Test
	public void testGetListaNarraciones() {
		assertNotNull(ListaNarraciones.getListaNarraciones());
	}

	@Test
	public void testBuscarNarracionPorId() {
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n1);
		assertNotNull(ListaNarraciones.getListaNarraciones().buscarNarracionPorId(01));
		assertNull(ListaNarraciones.getListaNarraciones().buscarNarracionPorId(02));
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n2);
		assertNotNull(ListaNarraciones.getListaNarraciones().buscarNarracionPorId(02));
	}

	@Test
	public void testAniadirNarracion() {
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),0);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n1);
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),1);
	}

	@Test
	public void testResetear() {
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n1);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n2);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n3);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n4);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n5);
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),5);
		ListaNarraciones.getListaNarraciones().resetear();
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),0);
	}

	@Test
	public void testInicializarLista() {
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),0);
		ListaNarraciones.getListaNarraciones().inicializarLista();
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),35);
		}

	@Test
	public void testGetTamano() {
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),0);
		ListaNarraciones.getListaNarraciones().aniadirNarracion(n1);
		assertEquals(ListaNarraciones.getListaNarraciones().getTamano(),1);	}
}
