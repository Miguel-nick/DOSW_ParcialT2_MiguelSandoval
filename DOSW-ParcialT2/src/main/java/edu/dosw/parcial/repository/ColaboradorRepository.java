package edu.dosw.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuapp.entity.Colaborador;

import java.util.Optional;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    Optional<Colaborador> findByCorreo(String correo);
}