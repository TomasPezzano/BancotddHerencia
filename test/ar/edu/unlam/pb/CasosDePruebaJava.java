package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class CasosDePruebaJava {

	@Test
	public void queSePuedaCrearUnaCuentaBancaria() {
		
		//preparación
		Cuenta nueva;
		final Integer NUMERO_DE_CUENTA=1000;
		Cliente nuevoCliente;
		final String NOMBRE_DE_CLIENTE="Jimena";
		final Integer CUIL=2024512312;
		final String E_MAIL="jimena@unlam.edu.ar";
		final String PASSWORD ="Unlam2022";
		//ejecución
		nuevoCliente=new Cliente(CUIL,NOMBRE_DE_CLIENTE,E_MAIL,PASSWORD);
		nueva = new Cuenta(NUMERO_DE_CUENTA,nuevoCliente);
		
		
		//validación
		assertNotNull(nuevoCliente);
		assertNotNull(nueva);
		assertEquals(NUMERO_DE_CUENTA, nueva.getNumeroDeCuenta());
	}
	
	
	@Test
	public void queSePuedaDepositarDinero() {
		//preparación
		Cuenta nueva;
		Integer NUMERO_DE_CUENTA=1000;
		Cliente nuevoCliente;
		String NOMBRE_DE_CLIENTE="Jimena";
		Integer CUIL=2024512312;
		String E_MAIL="jimena@unlam.edu.ar";
		String PASSWORD ="Unlam2022";
		final Double IMPORTE_INICIAL=500.0;
		final Double IMPORTE_A_DEPOSITAR=1000.0;
		final Double SALDO_ESPERADO=IMPORTE_INICIAL+IMPORTE_A_DEPOSITAR;
		//ejecución
		nuevoCliente=new Cliente(CUIL,NOMBRE_DE_CLIENTE,E_MAIL,PASSWORD);
		nueva = new Cuenta(NUMERO_DE_CUENTA,nuevoCliente);
		nueva.depositar(IMPORTE_A_DEPOSITAR);
		nueva.depositar(IMPORTE_INICIAL);
		
		
		//validación
		assertEquals(SALDO_ESPERADO, nueva.getSaldo());
	}
	
	
	@Test
	public void queSePuedaAgregarUnaCuentaAlBanco() {
		//preparación
		Cuenta nueva;
		Integer NUMERO_DE_CUENTA=1000;
		Cliente nuevoCliente;
		String NOMBRE_DE_CLIENTE="Jimena";
		Integer CUIL=2024512312;
		String E_MAIL="jimena@unlam.edu.ar";
		String PASSWORD ="Unlam2022";
		Banco bna;
		final Integer CANTIDAD_DE_CUENTAS=1;
		//ejecución
		nuevoCliente=new Cliente(CUIL,NOMBRE_DE_CLIENTE,E_MAIL,PASSWORD);
		nueva = new Cuenta(NUMERO_DE_CUENTA,nuevoCliente);
		bna=new Banco("banco de la nacion");
		bna.agregarCuenta(nueva);
		
		
		
		//validación
		assertNotNull(bna);
		assertEquals(CANTIDAD_DE_CUENTAS, bna.getCantidadDeCuentas());
	}
	
	@Test
	public void queNoSePuedanAgregarDosCuentasConUnMismoNumero() {
		//preparación
		Cuenta cuentaMil,otraCuentaMil;
		Integer NUMERO_DE_CUENTA=1000;
		Cliente nuevoCliente;
		String NOMBRE_DE_CLIENTE="Jimena";
		Integer CUIL=2024512312;
		String E_MAIL="jimena@unlam.edu.ar";
		String PASSWORD ="Unlam2022";
		Banco bna;
		final Integer CANTIDAD_DE_CUENTAS=1;
		//ejecución
		nuevoCliente=new Cliente(CUIL,NOMBRE_DE_CLIENTE,E_MAIL,PASSWORD);
		cuentaMil = new Cuenta(NUMERO_DE_CUENTA,nuevoCliente);
		otraCuentaMil = new Cuenta(NUMERO_DE_CUENTA,nuevoCliente);
		bna=new Banco("banco de la nacion");
		
		
		
		//validación
		assertNotNull(bna);
		assertTrue(bna.agregarCuenta(cuentaMil));
		assertFalse(bna.agregarCuenta(otraCuentaMil));
		assertEquals(CANTIDAD_DE_CUENTAS, bna.getCantidadDeCuentas());
	}
	
	@Test
	public void queNoSePuedaCrearUnaCuentaYSuSaldoInicialSea500() {
		//preparación
		CuentaAdolescente cuentaMiSobrina;
		Integer NUMERO_DE_CUENTA=1000;
		Cliente nuevoCliente;
		String NOMBRE_DE_CLIENTE="Lola";
		Integer CUIL=2024512312;
		String E_MAIL="jimena@unlam.edu.ar";
		String PASSWORD ="Unlam2022";
		Banco bna;
		final Integer CANTIDAD_DE_CUENTAS=1;
		//ejecución
		
		Double saldoEsperado=500.0;
		nuevoCliente=new Cliente(CUIL,NOMBRE_DE_CLIENTE,E_MAIL,PASSWORD);
		cuentaMiSobrina=new CuentaAdolescente(NUMERO_DE_CUENTA,nuevoCliente);
		bna=new Banco("banco de la nacion");
		
		
		
		//validación
		assertNotNull(cuentaMiSobrina);
		assertEquals(saldoEsperado,cuentaMiSobrina.getSaldo());
	}

}
