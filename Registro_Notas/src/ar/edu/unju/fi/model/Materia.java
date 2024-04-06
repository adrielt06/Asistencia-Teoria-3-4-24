package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombreMateria;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String codigo, String nombreMateria) {
		this.codigo = codigo;
		this.nombreMateria = nombreMateria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	@Override
	public String toString() {
		return "[codigo=" + codigo + ", nombreMateria=" + nombreMateria + "]";
	}

	
	
	
}
