package restproyectos.restcontroller;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restproyectos.modelo.entities.Proyecto;
import restproyectos.service.EmpleadoService;
import restproyectos.service.ProyectoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rest/proyectos")
public class ProyectoRestController {
	
	@Autowired
	ProyectoService proyectoservice;
	
	@Autowired
	EmpleadoService empleadoservice;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/")
	public List<Proyecto> todos(){
		return proyectoservice.findAll();
	}
	
	@GetMapping("/{idProyecto}")
	public Proyecto uno(@PathVariable int idProyecto) {
		return proyectoservice.findOne(idProyecto);
	}
	
	@PutMapping("/modificar")
	public Proyecto modificacion(@RequestBody Proyecto proyecto) {
		
		return proyectoservice.updateOne(proyecto);
	}
	
	@PostMapping("/")
	public Proyecto alta(@RequestBody Proyecto proyecto) {
		return proyectoservice.insertOne(proyecto);
	}
	
	
	
	

}
