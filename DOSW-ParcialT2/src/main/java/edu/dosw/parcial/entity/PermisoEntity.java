package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "permiso")
public class PermisoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToMany(mappedBy = "permisos")
    private List<Rol> roles;

    public Long getId() {
        return id;
    }
}