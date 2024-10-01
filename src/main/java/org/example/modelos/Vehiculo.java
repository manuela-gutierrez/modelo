package org.example.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehiculo {
    private long id;
    private Integer anioFabricacion;
    private  Integer numeroPuertas;
    private  Integer potencia;
    private Double kilometraje;
    private  Double capacidadMaletero;
    private  Double precio;
    private  String marca;
    private  String modelo;
    private  String numeroPlaca;
    private  String color;
    private  String tipo;
    private  String tipoCombustible;
    private  String trasmision;
    private LocalDateTime fechaCompra;

    public Vehiculo() {
    }

    public Vehiculo(long id, Integer anioFabricacion, Integer numeroPuertas, Integer potencia, Double kilometraje, Double capacidadMaletero, Double precio, String marca, String modelo, String numeroPlaca, String color, String tipo, String tipoCombustible, String trasmision, LocalDateTime fechaCompra) {
        this.id = id;
        this.anioFabricacion = anioFabricacion;
        this.numeroPuertas = numeroPuertas;
        this.potencia = potencia;
        this.kilometraje = kilometraje;
        this.capacidadMaletero = capacidadMaletero;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
        this.color = color;
        this.tipo = tipo;
        this.tipoCombustible = tipoCombustible;
        this.trasmision = trasmision;
        this.fechaCompra = fechaCompra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(Double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTrasmision() {
        return trasmision;
    }

    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", anioFabricacion=" + anioFabricacion +
                ", numeroPuertas=" + numeroPuertas +
                ", potencia=" + potencia +
                ", kilometraje=" + kilometraje +
                ", capacidadMaletero=" + capacidadMaletero +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroPlaca='" + numeroPlaca + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", trasmision='" + trasmision + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
