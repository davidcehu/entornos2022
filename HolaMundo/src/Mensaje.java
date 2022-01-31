import java.util.Date;

public class Mensaje {
	private String emisor;
	private String cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraModificacion;
	
 	public Mensaje() {
		this.emisor = "Emisor desconocido";
		this.cuerpo = "Texto desconocido";
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}
	
	public void actualizarFechaHoraModificacion() {
		this.fechaHoraModificacion = new Date();
		System.out.println("Hora actualizada");
	}

	public Mensaje(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.cuerpo = texto;
		this.fechaHoraCreacion =  new Date();
		this.fechaHoraModificacion = new Date();
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public Date getFechaHoraCreacion() {
		return fechaHoraCreacion;
	}

	public void setFechaHoraCreacion(Date fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
	}

	public Date getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	public void setFechaHoraModificacion(Date fechaHoraModificacion) {
		this.fechaHoraModificacion = fechaHoraModificacion;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String texto) {
		this.cuerpo = texto;
	}

	@Override
	public String toString() {
		return "(" + fechaHoraModificacion + ") Mensaje de " + emisor + ": "+ cuerpo;
	}
	
	
	 
}
