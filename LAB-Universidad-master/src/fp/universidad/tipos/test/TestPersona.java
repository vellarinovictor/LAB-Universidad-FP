package fp.universidad.tipos.test;

import java.time.LocalDate;

import fp.universidad.tipos.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona("28864657W","Pascual", "García Vaquero", LocalDate.of(1999, 4, 13));
		System.out.println(p);
		System.out.println(p.getEdad());
	}
}
