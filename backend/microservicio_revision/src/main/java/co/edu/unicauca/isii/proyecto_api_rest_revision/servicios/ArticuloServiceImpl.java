package co.edu.unicauca.isii.proyecto_api_rest_revision.servicios;

import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Articulo;
import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Autor;
import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Revisor;
import co.edu.unicauca.isii.proyecto_api_rest_revision.fachadaservicios.DTO.ArticuloDTO;
import co.edu.unicauca.isii.proyecto_api_rest_revision.fachadaservicios.mapper.ArticuloMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloServiceImpl {
    private final List<Articulo> articulos = new ArrayList<>();
    private final Revisor revisor;

    public ArticuloServiceImpl(Revisor revisor) {
        this.revisor = revisor;
    }

    public ArticuloDTO enviarArticulo(Autor autor, ArticuloDTO articuloDTO) {
        Articulo articulo = ArticuloMapper.INSTANCE.toEntity(articuloDTO);
        articulos.add(articulo);
        autor.getListaArticulos().add(articulo); // Asocia el artículo con el autor
        return ArticuloMapper.INSTANCE.toDto(articulo);
    }

    public void calificarArticulo(int indice, int calTitulo, int calDescripcion, int calResumen, int calKeyword) {
        if (indice >= 0 && indice < articulos.size()) {
            Articulo articulo = articulos.get(indice);
            revisor.calificarArticulo(articulo, calTitulo, calDescripcion, calResumen, calKeyword);
        } else {
            throw new IllegalArgumentException("Índice de artículo inválido.");
        }
    }

    public List<ArticuloDTO> listarArticulos() {
        List<ArticuloDTO> listaDto = new ArrayList<>();
        for (Articulo articulo : articulos) {
            listaDto.add(ArticuloMapper.INSTANCE.toDto(articulo));
        }
        return listaDto;
    }
}
