package restproyectos.service;

import java.util.List;

import restproyectos.modelo.entities.Empleado;

public interface EmpleadoService {

	Empleado insertOne(Empleado empleado);
	Empleado updateOne(Empleado empleado);
	boolean deleteOne(int idEmpleado);
	Empleado findOne(int idEmpleado);
	List<Empleado> findAll();
	
}
