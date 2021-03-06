package banco.cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

import banco.personas.Cliente;

public class CuentaSueldoTest {

	@Test
	public void testAndaConstructor() {
		
		Cliente german = new Cliente("German", 35227679);
		CuentaSueldo miObjetoCuentaSueldo = new CuentaSueldo(12345,
															"Epidata",
															german,
															0);
		
	}

	@Test
	public void testVerSaldo() {
		Cliente german = new Cliente("German", 35227679);
		CuentaSueldo miObjetoCuentaSueldo = new CuentaSueldo(12345,
															"Epidata",
															german,
															5000);
		assertTrue(miObjetoCuentaSueldo.verSaldo()==5000);
	}
	
	@Test
	public void testDepositar() {
		Cliente german = new Cliente("German", 35227679);
		CuentaSueldo miObjetoCuentaSueldo = new CuentaSueldo(12345,
															"Epidata",
															german,
															5000);
		double nuevoSaldo;
		nuevoSaldo = miObjetoCuentaSueldo.depositar(3000);
		assertTrue(nuevoSaldo==8000);
	}	

	@Test
	public void testExtraerCantidadMenorAlSaldo() {
		Cliente german = new Cliente("German", 35227679);
		CuentaSueldo miObjetoCuentaSueldo = new CuentaSueldo(12345,
															"Epidata",
															german,
															5000);
		miObjetoCuentaSueldo.extraer(3500);
		assertTrue(miObjetoCuentaSueldo.verSaldo()==1500);		
	}
	
	@Test
	public void testExtraerCantidadMayorAlSaldo() {
		Cliente german = new Cliente("German", 35227679);
		CuentaSueldo miObjetoCuentaSueldo = new CuentaSueldo(12345,
															"Epidata",
															german,
															5000);
		miObjetoCuentaSueldo.extraer(6000);
		assertFalse(miObjetoCuentaSueldo.verSaldo()<0);
		assertTrue(miObjetoCuentaSueldo.verSaldo()==5000);
	}
	
}
