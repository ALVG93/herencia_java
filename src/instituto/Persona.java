package instituto;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String DNI;
	private int edad;
	
	Persona(String nombre, String apellido1, String apellido2, String DNI, int edad) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.DNI = DNI;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return this.apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return this.apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
