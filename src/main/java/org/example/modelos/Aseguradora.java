package org.example.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aseguradora {
   private String nombre;
    private long id;
    private  String direccion;
    private  String telefono;
    private  String email;
    private  String sitioweb;
    private String tipoAseguradora;
    private   String servicioCliente;
    private  String tiposCobertura;
    private   String Observaciones;
    private LocalDateTime anioFundacion;
    private   Integer numeroPolizas;
    private   Integer numeroSucursales;
    private   double calificacion;
    private   double montoMaximoCobertura;

    public Aseguradora() {
    }

    public Aseguradora(String nombre, long id, String direccion, String telefono, String email, String sitioweb, String tipoAseguradora, String servicioCliente, String tiposCobertura, String observaciones, LocalDateTime anioFundacion, Integer numeroPolizas, Integer numeroSucursales, double calificacion, double montoMaximoCobertura) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.sitioweb = sitioweb;
        this.tipoAseguradora = tipoAseguradora;
        this.servicioCliente = servicioCliente;
        this.tiposCobertura = tiposCobertura;
        Observaciones = observaciones;
        this.anioFundacion = anioFundacion;
        this.numeroPolizas = numeroPolizas;
        this.numeroSucursales = numeroSucursales;
        this.calificacion = calificacion;
        this.montoMaximoCobertura = montoMaximoCobertura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    public String getTipoAseguradora() {
        return tipoAseguradora;
    }

    public void setTipoAseguradora(String tipoAseguradora) {
        this.tipoAseguradora = tipoAseguradora;
    }

    public String getServicioCliente() {
        return servicioCliente;
    }

    public void setServicioCliente(String servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public String getTiposCobertura() {
        return tiposCobertura;
    }

    public void setTiposCobertura(String tiposCobertura) {
        this.tiposCobertura = tiposCobertura;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public LocalDateTime getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(LocalDateTime anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public Integer getNumeroPolizas() {
        return numeroPolizas;
    }

    public void setNumeroPolizas(Integer numeroPolizas) {
        this.numeroPolizas = numeroPolizas;
    }

    public Integer getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(Integer numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getMontoMaximoCobertura() {
        return montoMaximoCobertura;
    }

    public void setMontoMaximoCobertura(double montoMaximoCobertura) {
        this.montoMaximoCobertura = montoMaximoCobertura;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", sitioweb='" + sitioweb + '\'' +
                ", tipoAseguradora='" + tipoAseguradora + '\'' +
                ", servicioCliente='" + servicioCliente + '\'' +
                ", tiposCobertura='" + tiposCobertura + '\'' +
                ", Observaciones='" + Observaciones + '\'' +
                ", anioFundacion=" + anioFundacion +
                ", numeroPolizas=" + numeroPolizas +
                ", numeroSucursales=" + numeroSucursales +
                ", calificacion=" + calificacion +
                ", montoMaximoCobertura=" + montoMaximoCobertura +
                '}';
    }
}
