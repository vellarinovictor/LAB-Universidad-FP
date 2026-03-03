package fp.universidad.tipos.test;

import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.TipoAsignatura;

public class TestAsignatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura a = new Asignatura("Fundamentos de Programacion","0000230",6,3,TipoAsignatura.ANUAL);
		System.out.println(a);
		System.out.println(a.getAcronimo());
	}

}
