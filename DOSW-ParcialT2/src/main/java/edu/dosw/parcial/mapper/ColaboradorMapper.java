package edu.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tuapp.entity.Colaborador;
import com.tuapp.model.ColaboradorModel;

@Mapper(componentModel = "spring")
public interface ColaboradorMapper {

    @Mapping(source = "rol.nombre", target = "rol")
    ColaboradorModel toModel(Colaborador entity);

    @Mapping(source = "rol", target = "rol.nombre")
    Colaborador toEntity(ColaboradorModel model);
}