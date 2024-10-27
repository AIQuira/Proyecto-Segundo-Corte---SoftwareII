package co.edu.unicauca.isii.proyecto_api_rest_revision;

import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Autor;
import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Revisor;
import co.edu.unicauca.isii.proyecto_api_rest_revision.fachadaservicios.DTO.ArticuloDTO;
import co.edu.unicauca.isii.proyecto_api_rest_revision.servicios.ArticuloServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApiRestRevisionApplication {
    
    public static void main(String[] args) {
        // Crear un autor
        Autor autor = new Autor(123, "Juan Pérez", "juan.perez@example.com", "password123", 123456789, 1);

        // Crear un revisor
        Revisor revisor = new Revisor(456, "Maria García", "maria.garcia@example.com", "password456", 987654321, 2, "Lic. en Letras");

        // Crear el servicio de artículos
        ArticuloServiceImpl articuloService = new ArticuloServiceImpl(revisor);

        // Enviar un artículo por el autor
        ArticuloDTO articuloDTO = new ArticuloDTO();
        articuloDTO.setTitulo("Importancia de la Educación");
        articuloDTO.setDescripcion("Un artículo sobre la importancia de la educación en la sociedad.");
        articuloDTO.setResumen("Este artículo explora los beneficios de una educación de calidad.");
        articuloDTO.setKeyword("Educación, Sociedad, Beneficios");

        System.out.println("=== Enviando Artículo ===");
        ArticuloDTO articuloEnviado = articuloService.enviarArticulo(autor, articuloDTO);
        System.out.println("Artículo Enviado: " + articuloEnviado);

        // Calificar el artículo
        System.out.println("\n=== Calificando Artículo ===");
        articuloService.calificarArticulo(0, 4, 3, 4, 2); // Calificaciones para título, descripción, resumen, y keyword
        System.out.println("Calificación completa");

        // Listar todos los artículos para verificar calificaciones
        System.out.println("\n=== Lista de Artículos con Calificaciones ===");
        for (ArticuloDTO articulo : articuloService.listarArticulos()) {
            System.out.println("Título: " + articulo.getTitulo());
            System.out.println("Descripción: " + articulo.getDescripcion());
            System.out.println("Resumen: " + articulo.getResumen());
            System.out.println("Keyword: " + articulo.getKeyword());
            // Se espera que la calificación esté en el Articulo, no en el DTO
        }
    }
}
