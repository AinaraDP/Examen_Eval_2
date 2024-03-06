package restproyectos.modelo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="empleados_en_proyectos")
public class EmpleadoEnProyecto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_entrada")
	int idEntrada;
	@Column(name="id_proyecto")
	Proyecto proyecto;
	@Column(name="id_empleado")
	Empleado empleado;
	@Column(name="dias_previstos")
	int diasPrevistos;
	@Column(name="fecha_incorporacion")
	Date fechaIncorporacion;
	
	
	

}
