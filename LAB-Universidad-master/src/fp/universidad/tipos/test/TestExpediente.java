package fp.universidad.tipos.test;

import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.Convocatoria;
import fp.universidad.tipos.Expediente;
import fp.universidad.tipos.Nota;
import fp.universidad.tipos.TipoAsignatura;

public class TestExpediente {
	public static void main(String[] args) {
		Expediente e = new Expediente();
		e.nuevaNota(new Nota(new Asignatura("Programacion Java", "0000345", 6, 2, TipoAsignatura.SEGUNDO_CUATRIMESTRE), 3, Convocatoria.SEGUNDA, 7.0));
		e.nuevaNota(new Nota(new Asignatura("Programacion Python", "0000344", 6, 2, TipoAsignatura.PRIMER_CUATRIMESTRE), 3, Convocatoria.PRIMERA, 9.0));
		System.out.println(e.toString());
	}
	
}
