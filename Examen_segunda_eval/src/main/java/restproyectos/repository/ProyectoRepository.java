package restproyectos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restproyectos.modelo.entities.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{

}
