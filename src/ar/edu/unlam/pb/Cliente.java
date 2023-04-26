package ar.edu.unlam.pb;

public class Cliente {
	
	private Integer cuil;
	private String nombreDeCliente;
	private String eMail;
	private String password;

	public Cliente(Integer cUIL, String nOMBRE_DE_CLIENTE, String e_MAIL, String pASSWORD) {
		this.cuil=cUIL;
		this.nombreDeCliente=nOMBRE_DE_CLIENTE;
		this.eMail=e_MAIL;
		this.password=pASSWORD;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	public String getNombreDeCliente() {
		return nombreDeCliente;
	}

	public void setNombreDeCliente(String nombreDeCliente) {
		this.nombreDeCliente = nombreDeCliente;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente [cuil=" + cuil + ", nombreDeCliente=" + nombreDeCliente + "]";
	}
	
	
	

}
