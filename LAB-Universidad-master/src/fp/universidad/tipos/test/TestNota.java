package fp.universidad.tipos.test;

import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.Convocatoria;
import fp.universidad.tipos.Nota;
import fp.universidad.tipos.TipoAsignatura;

public class TestNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nota n = new Nota(new Asignatura("Fundamentos de Programacion","0000230",6,26,TipoAsignatura.ANUAL),
				2013, Convocatoria.PRIMERA, 7.5);
		System.out.println(n);
	}

}
