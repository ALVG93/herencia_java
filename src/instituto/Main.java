package instituto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private static ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
	public static void main(String[] args) {		
		mostrarMenuOpciones();
	}
	
	private static void mostrarMenuOpciones() {
		System.out.print("Seleccione la operación que quiere realizar:\n\n");
		System.out.print("1. Registrar alumno\n");
		System.out.print("2. Registrar profesor\n");
		System.out.print("3. Mostrar listado de alumnos\n");
		System.out.print("4. Mostrar listado de profesores\n\n");
		System.out.print("Introduciendo el número correspondiente: ");
		
		Scanner in = new Scanner(System.in);
		String opcionLeida = in.nextLine();
		in.close();
		limpiarPantalla();
		
		if (!isNumeric(opcionLeida)) {
			opcionNoValida();
			mostrarMenuOpciones();
			return;
		}
		
		int opcion = Integer.parseInt(opcionLeida);
		
		switch (opcion) {
			case 1:
				registrarAlumno();
				break;
			case 2:
				registrarProfesor();
				break;
			case 3:
				mostrarAlumnos();
				break;
			case 4:
				mostrarProfesores();
				break;
			default:
				opcionNoValida();
				break;
		}
		
		mostrarMenuOpciones();
	}
	
	private static void registrarAlumno() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre: ");
		String nombre = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el primer apellido: ");
		String apellido1 = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el segundo apellido: ");
		String apellido2 = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el DNI: ");
		String DNI = in.nextLine();
		limpiarPantalla();
		
		boolean edadCorrecta = false;
		String edadString = "";
		int edad = 0;
		
		while (!edadCorrecta) {
			System.out.print("Introduzca la edad: ");
			edadString = in.nextLine();
			limpiarPantalla();
			
			if (isNumeric(edadString)) {
				edadCorrecta = true;
				edad = Integer.parseInt(edadString);
			} else {
				limpiarPantalla();
				System.out.print("La edad debe ser un número...\n\n");
			}
		}
		
		Alumno alumno = new Alumno(nombre, apellido1, apellido2, DNI, edad, 0, 0);
		alumnos.add(alumno);
		System.out.print("Alumno agregado correctamente.\n\n");
		in.close();
	}
	
	private static void registrarProfesor() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre: ");
		String nombre = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el primer apellido: ");
		String apellido1 = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el segundo apellido: ");
		String apellido2 = in.nextLine();
		limpiarPantalla();
		
		System.out.print("Introduzca el DNI: ");
		String DNI = in.nextLine();
		limpiarPantalla();
		
		boolean edadCorrecta = false;
		String edadString = "";
		int edad = 0;
		
		while (!edadCorrecta) {
			System.out.print("Introduzca la edad: ");
			edadString = in.nextLine();
			limpiarPantalla();
			
			if (isNumeric(edadString)) {
				edadCorrecta = true;
				edad = Integer.parseInt(edadString);
			} else {
				limpiarPantalla();
				System.out.print("La edad debe ser un número...\n\n");
			}
		}
		
		System.out.print("Introduzca el número de docente: ");
		String numeroDocente = in.nextLine();
		limpiarPantalla();
		
		Profesor profesor = new Profesor(nombre, apellido1, apellido2, DNI, edad, numeroDocente, false);
		profesores.add(profesor);
		System.out.print("Profesor agregado correctamente.\n\n");
		in.close();
	}
	
	public static void mostrarAlumnos() {
		if (alumnos.isEmpty()) {
			System.out.print("No hay alumnos inscritos...\n\n");
		}
		
		for (Alumno alumno : alumnos) {
			System.out.print("Alumno: \t\t" + alumno.getApellido1() + " " + alumno.getApellido2() + ", " + alumno.getNombre() + "\n");
			System.out.print("DNI: \t\t\t" + alumno.getDNI() + "\n");
			System.out.print("Edad: \t\t\t" + alumno.getEdad() + "\n");
			System.out.print("Número de suspensas: \t" + alumno.getNumeroSuspensas() + "\n");
			System.out.print("Número de partes: \t" + alumno.getNumeroPartes() + "\n\n\n");
		}
	}
	
	public static void mostrarProfesores() {
		if (profesores.isEmpty()) {
			System.out.print("No hay profesores inscritos...\n\n");
		}
		
		for (Profesor profesor : profesores) {
			System.out.print("Profesor: \t\t" + profesor.getApellido1() + " " + profesor.getApellido2() + ", " + profesor.getNombre() + "\n");
			System.out.print("DNI: \t\t\t" + profesor.getDNI() + "\n");
			System.out.print("Edad: \t\t\t" + profesor.getEdad() + "\n");
			System.out.print("Número de docente: \t" + profesor.getNumeroDocente() + "\n");
			
			if(profesor.isTutor()) {
				System.out.print("¿Es tutor?: \t\tSi\n\n\n");
			} else {
				System.out.print("¿Es tutor?: \t\tNo\n\n\n");
			}
		}
	}
	
	public static void opcionNoValida() {
		limpiarPantalla();
		System.out.print("La opción introducida no existe...\n\n");
	}
	
	public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
	
	private static void limpiarPantalla() {
		for (int i=0; i<30; i++) {
			System.out.print("\n");
		}
	}
}
