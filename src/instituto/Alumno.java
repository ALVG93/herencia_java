package instituto;

public class Alumno extends Persona{
	private int numeroSuspensas;
	private int numeroPartes;
	
	Alumno(String nombre, String apellido1, String apellido2, String DNI, int edad, int numeroSuspensas, int numeroPartes) {
		super(nombre, apellido1, apellido2, DNI, edad);
		this.numeroSuspensas = numeroSuspensas;
		this.numeroPartes = numeroPartes;
	}
	
	public int getNumeroSuspensas() {
		return this.numeroSuspensas;
	}
	
	public void setNumeroSuspensas(int numeroSuspensas) {
		this.numeroSuspensas = numeroSuspensas;
	}
	
	public int getNumeroPartes() {
		return this.numeroPartes;
	}
	
	public void setNumeroPartes(int numeroPartes) {
		this.numeroPartes = numeroPartes;
	}
}
