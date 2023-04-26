package ar.edu.unlam.pb;

public class CuentaAdolescente extends Cuenta {
	
	private final Double SALDO_INICIAL =500.0;
	
	public CuentaAdolescente(Integer numero, Cliente cliente) {
		super(numero,cliente);
		setSaldo(SALDO_INICIAL);
	}

	public Double getSALDO_INICIAL() {
		return SALDO_INICIAL;
	}
	
	
	
	
	}


