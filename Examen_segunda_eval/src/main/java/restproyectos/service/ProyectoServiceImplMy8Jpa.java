package restproyectos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restproyectos.modelo.entities.Proyecto;
import restproyectos.repository.ProyectoRepository;

@Service
public class ProyectoServiceImplMy8Jpa implements ProyectoService{

	@Autowired
	ProyectoRepository proyectorepository;
	
	@Override
	public Proyecto insertOne(Proyecto proyecto) {
		try {
			return proyectorepository.save(proyecto);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Proyecto updateOne(Proyecto proyecto) {
			try {
				if(findOne(proyecto.getIdProyecto()) != null)
					return proyectorepository.save(proyecto);
				else
					return null;
			} catch (Exception e) {
				return null;
			}
		
	}

	@Override
	public boolean deleteOne(int idProyecto) {
		try {
			if (findOne(idProyecto)!= null) {
				proyectorepository.deleteById(idProyecto);
				return true;
			}else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Proyecto findOne(int idProyecto) {
		
		return proyectorepository.findById(idProyecto).orElse(null);
	}

	@Override
	public List<Proyecto> findAll() {
		
		return proyectorepository.findAll();
	}

}
