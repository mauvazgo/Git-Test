package com.ayesa.redmine;

import junit.framework.TestCase;

public class DummyTest extends TestCase {
	public void test1Ok() {
		System.out.println("Hola mundo desde " + getName());
		// Este funciona
		assertTrue(true);
		assertFalse(false);
		assertEquals(1, 1);
		assertNotNull("hola");
		assertNull(null);
	}

	public void test2Falla() {
		System.out.println("Este test " + getName() + " debe fallar!");
		try {
			// Esta operación va a fallar
			new Long("esto no es un numero");
		} catch (NumberFormatException e) {
			fail(e.getMessage());
		}
	}

	public void test3Falla() {
		System.out.println("Este test " + getName() + " debe fallar!");
		assertTrue(false);
	}
}