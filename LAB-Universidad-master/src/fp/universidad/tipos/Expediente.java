package fp.universidad.tipos;

import java.util.ArrayList;
import java.util.List;

public class Expediente {
	private List<Nota> notas;

	public Expediente() {
		super();
		this.notas = new ArrayList<Nota>();
	}
	
	public Double getNotaMedia() {
		Double media = 0.0;
		for (Nota nota : notas) {
			if (nota.valor()>=5){
				media += nota.valor()/notas.size();				
			}
		}
		return media;
	}

	@Override
	public String toString() {
		String result = "[ ";
		for (Nota nota : notas) {
			result += nota.toString()+", ";
		}
		return result+" ]";
	}
	
	public void nuevaNota(Nota nuevaNota) {
		for (Nota nota : notas) {
			if (nuevaNota.equals(nota)) {
				notas.remove(nota);
				notas.add(nuevaNota);
			}
		}
	}
}
