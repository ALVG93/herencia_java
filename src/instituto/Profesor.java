package instituto;

public class Profesor extends Persona {
	private String numeroDocente;
	private boolean tutor;
	
	Profesor(String nombre, String apellido1, String apellido2, String DNI, int edad, String numeroDocente, boolean tutor) {
		super(nombre, apellido1, apellido2, DNI, edad);
		this.numeroDocente = numeroDocente;
		this.tutor = tutor;
	}
	
	public String getNumeroDocente() {
		return this.numeroDocente;
	}
	
	public void setNumeroDocente(String numeroDocente) {
		this.numeroDocente = numeroDocente;
	}
	
	public boolean isTutor() {
		return this.tutor;
	}
	
	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}
}
