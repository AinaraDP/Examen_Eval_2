package restproyectos.service;

import java.util.List;
import restproyectos.modelo.entities.Proyecto;

public interface ProyectoService {

	Proyecto insertOne(Proyecto proyecto);
	Proyecto updateOne(Proyecto proyecto);
	boolean deleteOne(int idProyecto);
	Proyecto findOne(int idProyecto);
	List<Proyecto> findAll();
	
}
