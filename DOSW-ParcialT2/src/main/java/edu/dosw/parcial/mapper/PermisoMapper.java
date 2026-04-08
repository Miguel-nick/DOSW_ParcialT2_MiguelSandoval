package edu.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import com.tuapp.entity.Permiso;
import com.tuapp.model.PermisoModel;

@Mapper(componentModel = "spring")
public interface PermisoMapper {

    PermisoModel toModel(Permiso entity);

    Permiso toEntity(PermisoModel model);
}