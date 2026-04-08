package edu.dosw.parcial.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "computador")
public class ComputadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serial;
    private String marca;

    @Column(name = "numero_laboratorio")
    private Integer numeroLaboratorio;

    private Boolean ocupado;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Colaborador colaborador;

    public Long getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(computadorEntity correo) {
        this.correo = correo;
    }
}