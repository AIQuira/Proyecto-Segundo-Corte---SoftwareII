package co.edu.unicauca.isii.revision.controlador;

import co.edu.unicauca.isii.revision.modelo.Autor;
import co.edu.unicauca.isii.revision.fachadaservicios.DTO.ArticuloDTO;
import co.edu.unicauca.isii.revision.fachadaservicios.DTO.CalificacionDTO;
import co.edu.unicauca.isii.revision.servicios.ArticuloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    private final ArticuloServiceImpl articuloService;
    private final Autor autor;

    @Autowired
    public ArticuloController(ArticuloServiceImpl articuloService, Autor autor) {
        this.articuloService = articuloService;
        this.autor = autor;
    }

    @PostMapping("/enviar")
    public ResponseEntity<ArticuloDTO> enviarArticulo(@RequestBody ArticuloDTO articuloDTO) {
        ArticuloDTO result = articuloService.enviarArticulo(autor, articuloDTO);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{id}/calificar")
    public ResponseEntity<String> calificarArticulo(@PathVariable int id, @RequestBody CalificacionDTO calificacion) {
        articuloService.calificarArticulo(id, calificacion.getCalificacionTitulo(), calificacion.getCalificacionDescripcion(),
                calificacion.getCalificacionResumen(), calificacion.getCalificacionKeyword());
        return ResponseEntity.ok("Artículo calificado con éxito");
    }

    @GetMapping
    public ResponseEntity<List<ArticuloDTO>> listarArticulos() {
        return ResponseEntity.ok(articuloService.listarArticulos());
    }
}
