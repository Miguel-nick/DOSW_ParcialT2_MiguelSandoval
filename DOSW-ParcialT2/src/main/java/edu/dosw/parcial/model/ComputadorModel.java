package edu.dosw.parcial.model;

public class ComputadorModel {

    private Long id;
    private String serial;
    private String marca;
    private Integer numeroLaboratorio;
    private Boolean ocupado;
    private Long colaboradorId;

    public ComputadorModel() {}

    public ComputadorModel(Long id, String serial, String marca,
                           Integer numeroLaboratorio, Boolean ocupado,
                           Long colaboradorId) {
        this.id = id;
        this.serial = serial;
        this.marca = marca;
        this.numeroLaboratorio = numeroLaboratorio;
        this.ocupado = ocupado;
        this.colaboradorId = colaboradorId;
    }
    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Integer getNumeroLaboratorio() { return numeroLaboratorio; }
    public void setNumeroLaboratorio(Integer numeroLaboratorio) { this.numeroLaboratorio = numeroLaboratorio; }

    public Boolean getOcupado() { return ocupado; }
    public void setOcupado(Boolean ocupado) { this.ocupado = ocupado; }

    public Long getColaboradorId() { return colaboradorId; }
    public void setColaboradorId(Long colaboradorId) { this.colaboradorId = colaboradorId; }
}