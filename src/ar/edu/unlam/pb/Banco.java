package ar.edu.unlam.pb;


import java.util.HashSet;

public class Banco {

	private String nombre;
	HashSet<Cuenta>listaCuentas;
	
	public Banco(String nombre) {
		this.nombre=nombre;
		this.listaCuentas=new HashSet();
	}
	
	public boolean agregarCuenta(Cuenta nuevaCuenta) {
		return listaCuentas.add(nuevaCuenta);
	}
	
	public Integer getCantidadDeCuentas() {
		return listaCuentas.size();
	}
	
}
