package fp.universidad.tipos.test;

import java.time.LocalDate;

import fp.universidad.tipos.Alumno;
import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.TipoAsignatura;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno("80808080X","Juan","SinMiedo","pepe@alum.us.es",LocalDate.of(2006, 3, 13));
		Asignatura as = new Asignatura("Fundamentos de Programacion","0000230",6,1,TipoAsignatura.ANUAL);
		Asignatura asd = new Asignatura("Fundamentos de Trogramacion","0000432",3,2,TipoAsignatura.ANUAL);
		a.matriculaAsignatura(as);
		a.matriculaAsignatura(asd);
		System.out.println(a);
	}

}
