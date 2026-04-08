package edu.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tuapp.entity.Computador;
import com.tuapp.model.ComputadorModel;

@Mapper(componentModel = "spring")
public interface ComputadorMapper {

    @Mapping(source = "colaborador.id", target = "colaboradorId")
    ComputadorModel toModel(Computador entity);

    @Mapping(source = "colaboradorId", target = "colaborador.id")
    Computador toEntity(ComputadorModel model);
}