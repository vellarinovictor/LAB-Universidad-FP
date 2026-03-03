package fp.universidad.tipos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.SortedSet;
import java.util.TreeSet;

import fp.utiles.Checkers;

public class Profesor extends Persona {
	
	private Categoria categoria;
	private SortedSet<Tutoria> tutorias;
	
	
	public Profesor(String dni, String nombre, String apellidos, String email, LocalDate fechaNacimiento, Categoria categoria) {
		super(dni, nombre, apellidos, email, fechaNacimiento);
		// TODO Auto-generated constructor stub
		Checkers.check("Edad incorrecta", fechaNacimiento.until(LocalDate.now()).getYears()>=18);
		this.categoria = categoria;
		this.tutorias = new TreeSet<Tutoria>();
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		return super.toString() +"("+categoria+")";
	}
	
	public void nuevaTutoria(LocalTime hora,Integer duracion,DayOfWeek dia) {
		tutorias.add(new Tutoria(dia,hora,duracion));
	}
	
	public void borraTutoria()
	
}
