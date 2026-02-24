package fp.universidad.tipos;

import java.util.Objects;

public record Asignatura(String nombre, String codigo, Integer creditos, Integer curso, TipoAsignatura tipo) {
	public String getAcronimo() {
		String result = "";
		for (Character c : nombre.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result += c;
			}
		}
		return result;
	}

	public Asignatura{
		checkCodigo(codigo);
		checkCreditos(creditos);
		checkCurso(curso);
	}
	
	private void checkCurso(Integer curso) {
		// TODO Auto-generated method stub
		if(curso>4) {
			throw new IllegalArgumentException();
		}
	}

	private void checkCreditos(Integer creditos) {
		// TODO Auto-generated method stub
		if (creditos<=0) {
			throw new IllegalArgumentException();
		}
	}

	private void checkCodigo(String codigo) {
		// TODO Auto-generated method stub
		if(codigo.length()!=7) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(codigo, other.codigo);
	}



	@Override
	public String toString() {
		return "(" + codigo + ") " + nombre;
	}
}
