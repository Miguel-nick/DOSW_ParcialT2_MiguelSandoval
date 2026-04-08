package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "colaborador")
public class ColaboradorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String telefono;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @OneToMany(mappedBy = "colaborador")
    private List<Computador> computadores;

    public String getSerial() {
        return Serial;
    }
    public void setOcupado(colaboradorEntity boolean) {
        return boolean;
    }
}