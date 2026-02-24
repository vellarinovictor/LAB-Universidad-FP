package fp.universidad.tipos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Centro implements Comparable<Centro>{
	private String nombre, direccion;
	private Integer numeroPlantas, numeroSotanos;
	private Set<Espacio> espacios;
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Integer getNumeroPlantas() {
		return numeroPlantas;
	}
	public Integer getNumeroSotanos() {
		return numeroSotanos;
	}
	public Set<Espacio> getEspacios() {
		return new HashSet<Espacio>(espacios);
	}
	
	public Centro(String nombre, String direccion, Integer numeroPlantas, Integer numeroSotanos) {
		super();
		checkPlantas(numeroPlantas);
		checkSotanos(numeroSotanos);
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroPlantas = numeroPlantas;
		this.numeroSotanos = numeroSotanos;
		this.espacios = new HashSet<Espacio>();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centro other = (Centro) obj;
		return Objects.equals(nombre, other.nombre);
	}
	private void checkSotanos(Integer numeroSotanos) {
		// TODO Auto-generated method stub
		if(numeroSotanos<0) {
			throw new IllegalArgumentException();
		}
	}
	private void checkPlantas(Integer numeroPlantas) {
		// TODO Auto-generated method stub
		if(numeroPlantas<=0) {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public String toString() {
		return nombre;
	}
	public void nuevoEspacio(Espacio e) {
		if(e.getPlanta() <= this.numeroPlantas && e.getPlanta()-1 >= this.numeroSotanos) {
			espacios.add(e);
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	public void eliminaEspacio(Espacio e) {
		espacios.remove(e);
	}
	@Override
	public int compareTo(Centro other) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(other.nombre);
	}
}
