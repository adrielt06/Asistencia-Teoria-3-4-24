package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//REGISTRO DE NOTAS DE PROG VISUAL Y POO PARA ALUMNO
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
		
		
		}

	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo de alumno: ");
		Integer legajo = sc.nextInt();
		
		System.out.println("Ingrese el apellido del alumno: ");
		String apellido = sc.next();
		
		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = sc.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner sc = new Scanner(System.in);
		while(numMaterias > 0) {
			//carga de materia
			System.out.println("Ingrese el codigo de materia: ");
			String codMateria = sc.next();
			
			System.out.println("Ingrese el nombre de materia: ");
			String nomMateria = sc.next();
			
			Materia materia = new Materia(codMateria, nomMateria);
			
			//carga de registro
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codNota = sc.next();
			
			System.out.println("Ingrese la nota final: ");
			Float notaFinal = sc.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codNota, alumno, materia, notaFinal);
			
			System.out.println(registroNota.toString());
			numMaterias--;
			}
		}
}
