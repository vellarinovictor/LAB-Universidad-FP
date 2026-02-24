package fp.universidad.tipos;

import java.util.Objects;

public class Espacio {
	private String nombre;
	private Integer capacidad,planta;
	private TipoEspacio tipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public TipoEspacio getTipo() {
		return tipo;
	}
	public void setTipo(TipoEspacio tipo) {
		this.tipo = tipo;
	}
	public Integer getPlanta() {
		return planta;
	}
	public Espacio(String nombre, Integer capacidad, Integer planta, TipoEspacio tipo) {
		super();
		checkCapacidad(capacidad);
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.planta = planta;
		this.tipo = tipo;
	}
	private void checkCapacidad(Integer capacidad) {
		// TODO Auto-generated method stub
		if(capacidad<=0) {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public String toString() {
		return nombre + " (planta " + planta + ")";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, planta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Espacio other = (Espacio) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(planta, other.planta);
	}
	
	
	
}
