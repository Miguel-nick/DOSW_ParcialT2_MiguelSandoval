package edu.dosw.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuapp.entity.Computador;

import java.util.List;

public interface ComputadorRepository extends JpaRepository<Computador, Long> {

    List<Computador> findByOcupado(Boolean ocupado);
}