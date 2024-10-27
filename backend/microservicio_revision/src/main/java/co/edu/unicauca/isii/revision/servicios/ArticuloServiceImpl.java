package co.edu.unicauca.isii.revision.servicios;

import co.edu.unicauca.isii.revision.modelo.Articulo;
import co.edu.unicauca.isii.revision.modelo.Autor;
import co.edu.unicauca.isii.revision.modelo.Revisor;
import co.edu.unicauca.isii.revision.fachadaservicios.DTO.ArticuloDTO;
import co.edu.unicauca.isii.revision.fachadaservicios.mapper.ArticuloMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @class ArticuloServiceImpl
 * @brief Implementación del servicio para la gestión de operaciones relacionadas con artículos.
 */
@Service
public class ArticuloServiceImpl {
    private final List<Articulo> articulos = new ArrayList<>();
    private final Revisor revisor;

    /**
     * @brief Constructor de ArticuloServiceImpl.
     * @param revisor Una instancia de Revisor para calificar artículos.
     */
    public ArticuloServiceImpl(Revisor revisor) {
        this.revisor = revisor;
    }

    /**
     * @brief Envía un artículo del autor al proceso de revisión.
     * @param autor El autor que envía el artículo.
     * @param articuloDTO Objeto de transferencia de datos del artículo.
     * @return El artículo enviado como un ArticuloDTO.
     */
    public ArticuloDTO enviarArticulo(Autor autor, ArticuloDTO articuloDTO) {
        Articulo articulo = ArticuloMapper.INSTANCE.toEntity(articuloDTO);
        articulos.add(articulo);
        autor.getListaArticulos().add(articulo); // Asocia el artículo con el autor
        return ArticuloMapper.INSTANCE.toDto(articulo);
    }

    /**
     * @brief Califica los atributos de un artículo.
     * @param id Identificador del artículo a calificar.
     * @param calTitulo Calificación para el título del artículo.
     * @param calDescripcion Calificación para la descripción del artículo.
     * @param calResumen Calificación para el resumen del artículo.
     * @param calKeyword Calificación para las palabras clave.
     */
    public void calificarArticulo(int indice, int calTitulo, int calDescripcion, int calResumen, int calKeyword) {
        if (indice >= 0 && indice < articulos.size()) {
            Articulo articulo = articulos.get(indice);
            revisor.calificarArticulo(articulo, calTitulo, calDescripcion, calResumen, calKeyword);
        } else {
            throw new IllegalArgumentException("Índice de artículo inválido.");
        }
    }

    /**
     * @brief Lista todos los artículos con sus detalles.
     * @return Una lista de ArticuloDTO representando los detalles de cada artículo.
     */
    public List<ArticuloDTO> listarArticulos() {
        List<ArticuloDTO> listaDto = new ArrayList<>();
        for (Articulo articulo : articulos) {
            listaDto.add(ArticuloMapper.INSTANCE.toDto(articulo));
        }
        return listaDto;
    }
}