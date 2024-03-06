package restproyectos.modelo.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import restproyectos.modelo.entities.Empleado;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProyectoDto {
	int idProyecto;
	String descripcion;
	Date fechaInicio;
	int diasPrevistos;
	int director;
	String estado;
}
