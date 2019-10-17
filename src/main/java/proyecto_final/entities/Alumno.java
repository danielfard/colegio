package proyecto_final.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Alumnos")
public class Alumno implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido_1", nullable = false)
	private String apellido_1;
	
	@Column(name = "apellido_2", nullable = false)
	private String apellido_2;
	
	@Column(name = "cedula", nullable = false)
	private long cedula;
	
	@Column(name = "telefono", nullable = false)
	private long telefono;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "repetidor", nullable = false)
	private Long repetidor;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_alta", nullable = false)
	private Date fecha_alta;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_baja", nullable = false)
	private Date fecha_baja;
	
	@Column(name = "observaciones", nullable = false)
	private String observaciones;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_curso")
	private Curso curso;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acudiente")
	private Acudiente acudiente;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="clase_alumno",joinColumns = @JoinColumn(name="alumno_id",referencedColumnName="id"),inverseJoinColumns =@JoinColumn(name= "clase_id",referencedColumnName="id"))
	private Set<Clase> clases;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getRepetidor() {
		return repetidor;
	}

	public void setRepetidor(Long repetidor) {
		this.repetidor = repetidor;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Acudiente getAcudiente() {
		return acudiente;
	}

	public void setAcudiente(Acudiente acudiente) {
		this.acudiente = acudiente;
	}

	public Set<Clase> getClases() {
		return clases;
	}

	public void setClases(Set<Clase> clases) {
		this.clases = clases;
	}

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
