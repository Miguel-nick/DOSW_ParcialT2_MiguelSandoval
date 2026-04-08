package edu.dosw.parcial.model;

import java.time.LocalDate;

public class ColaboradorModel {

    private Long id;
    private String correo;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String rol;

    // Constructor
    public ColaboradorModel() {}

    // Constructor con parámetros
    public ColaboradorModel(Long id, String correo, String nombre, String apellido,
                            String telefono, LocalDate fechaNacimiento, String rol) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}