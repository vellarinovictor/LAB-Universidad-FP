package fp.universidad.tipos.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import fp.universidad.tipos.Tutoria;

public class TestTutoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutoria t1 = new Tutoria(DayOfWeek.THURSDAY, LocalTime.of(13, 0), LocalTime.of(14, 15));
		Tutoria t2 = new Tutoria(DayOfWeek.MONDAY, LocalTime.of(11, 0), 65);

		System.out.println(t1);
		System.out.println(t2);
	}

}
