package proyecto_final.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nivel", nullable = false)
	private Long nivel;
	
	@Column(name = "etapa", nullable = false)
	private String etapa;
	
	@OneToMany(mappedBy = "curso")
	private Set<Asignatura> asignaturas;
	
	
	@OneToMany(mappedBy = "curso")
	private Set<Alumno> alumnos;


	public Long getId_curso() {
		return id;
	}


	public void setId_curso(Long id) {
		this.id = id;
	}


	public Long getNivel() {
		return nivel;
	}


	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}


	public String getEtapa() {
		return etapa;
	}


	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}


	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}


	public Set<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
