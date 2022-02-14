package Clases;

public class Alumno extends Persona {

	String expediente;

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public Alumno(String expediente) {
		super();
		this.expediente = expediente;
	}
	
	
}
