package co.edu.unicauca.isii.revision.fachadaServicios.mapper;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.ArticuloEntity;
import co.edu.unicauca.isii.revision.fachadaServicios.DTO.ArticuloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @class ArticuloMapper
 * @brief Interfaz de mapeo para convertir entre Articulo y ArticuloDTO.
 */
@Mapper
public interface ArticuloMapper {
    ArticuloMapper INSTANCE = Mappers.getMapper(ArticuloMapper.class);

    ArticuloDTO toDto(ArticuloEntity articulo);
    ArticuloEntity toEntity(ArticuloDTO articuloDTO);
}
