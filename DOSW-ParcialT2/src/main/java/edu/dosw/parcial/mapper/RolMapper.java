package edu.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import com.tuapp.entity.Rol;
import com.tuapp.model.RolModel;

@Mapper(componentModel = "spring")
public interface RolMapper {

    RolModel toModel(Rol entity);

    Rol toEntity(RolModel model);
}