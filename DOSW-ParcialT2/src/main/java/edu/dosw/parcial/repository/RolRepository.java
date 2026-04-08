package edu.dosw.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuapp.entity.Rol;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombre(String nombre);
}