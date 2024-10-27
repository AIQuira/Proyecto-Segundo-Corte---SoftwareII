package co.edu.unicauca.isii.revision.fachadaservicios.mapper;

import co.edu.unicauca.isii.revision.modelo.Articulo;
import co.edu.unicauca.isii.revision.fachadaservicios.DTO.ArticuloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @class ArticuloMapper
 * @brief Interfaz de mapeo para convertir entre Articulo y ArticuloDTO.
 */
@Mapper
public interface ArticuloMapper {
    ArticuloMapper INSTANCE = Mappers.getMapper(ArticuloMapper.class);

    ArticuloDTO toDto(Articulo articulo);
    Articulo toEntity(ArticuloDTO articuloDTO);
}