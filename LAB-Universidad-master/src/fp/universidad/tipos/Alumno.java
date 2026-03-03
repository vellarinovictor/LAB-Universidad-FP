package fp.universidad.tipos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import fp.utiles.Checkers;

public class Alumno extends Persona{

	private Set<Asignatura> asignaturas;
	
	
	public Alumno(String dni, String nombre, String apellidos, String email, LocalDate fechaNacimiento) {
		super(dni, nombre, apellidos, email, fechaNacimiento);
		Checkers.check("Email no vacio", !email.isEmpty() && email.endsWith("@alum.us.es"));
		this.asignaturas = new HashSet<Asignatura>();
		// TODO Auto-generated constructor stub
	}


	public Set<Asignatura> getAsignaturas() {
		return new HashSet<Asignatura>(asignaturas);
	}
	
	public Integer getCurso() {
		
		List<Integer> cursos = new ArrayList<>();
		for (Asignatura a : asignaturas) {
			cursos.add(a.curso());
		}
		
		return !cursos.isEmpty() ? Collections.max(cursos) : 0;
		
	}
	
	public Boolean estaMatriculadoEn(Asignatura a) {
		return asignaturas.contains(a);
	}

	public void eliminarAsignatura(Asignatura a) {
		Checkers.check("No está matriculado", estaMatriculadoEn(a));
		asignaturas.remove(a);
	}
	
	public void matriculaAsignatura(Asignatura a) {
		Checkers.check("Ya está matriculado", !estaMatriculadoEn(a));
		asignaturas.add(a);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Boolean result = false;
		if(obj instanceof Alumno) {
			result = super.equals(obj) && Objects.equals(this.getCurso(), ((Alumno) obj).getCurso());
		}
		return result;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(),this.getCurso());
	}
	
	public String toString() {
		return "("+getCurso()+"º) " + super.toString();
	}
}
