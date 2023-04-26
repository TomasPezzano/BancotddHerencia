package ar.edu.unlam.pb;

import java.util.Objects;

public class Cuenta {
	
	private Integer numeroDeCuenta;
	private Cliente nuevoCliente;
	private Double saldo;
	

	public Cuenta(Integer nUMERO_DE_CUENTA, Cliente nuevoCliente) {
		this.nuevoCliente=nuevoCliente;
		this.numeroDeCuenta=nUMERO_DE_CUENTA;
		this.saldo=0.0;
	}

	public Integer getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(Integer numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public Cliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(Cliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	

	public void depositar(Double importe) {
		this.saldo+=importe;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroDeCuenta=" + numeroDeCuenta + ", nuevoCliente=" + nuevoCliente + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(numeroDeCuenta, other.numeroDeCuenta);
	}
	
	
	

}
