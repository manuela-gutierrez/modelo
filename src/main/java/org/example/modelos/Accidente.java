package org.example.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Accidente {
  private LocalDateTime fecha;
    private  long id;
    private   String lugar;
    private    String descripcion;
    private    String hora;
    private    String gravedad;
    private    String testigos;
    private   String informePolicial;
    private   String  tipoAccidente;
    private   String responsable;
    private   String estadoInforme;
    private  String observaciones;
    private  Double costoEstimado;
    private   Integer vehiculosInvolucrados;
    private   Integer lesionados;

    public Accidente() {
    }

    public Accidente(LocalDateTime fecha, long id, String lugar, String descripcion, String hora, String gravedad, String testigos, String informePolicial, String tipoAccidente, String responsable, String estadoInforme, String observaciones, Double costoEstimado, Integer vehiculosInvolucrados, Integer lesionados) {
        this.fecha = fecha;
        this.id = id;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.hora = hora;
        this.gravedad = gravedad;
        this.testigos = testigos;
        this.informePolicial = informePolicial;
        this.tipoAccidente = tipoAccidente;
        this.responsable = responsable;
        this.estadoInforme = estadoInforme;
        this.observaciones = observaciones;
        this.costoEstimado = costoEstimado;
        this.vehiculosInvolucrados = vehiculosInvolucrados;
        this.lesionados = lesionados;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getTestigos() {
        return testigos;
    }

    public void setTestigos(String testigos) {
        this.testigos = testigos;
    }

    public String getInformePolicial() {
        return informePolicial;
    }

    public void setInformePolicial(String informePolicial) {
        this.informePolicial = informePolicial;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstadoInforme() {
        return estadoInforme;
    }

    public void setEstadoInforme(String estadoInforme) {
        this.estadoInforme = estadoInforme;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(Double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public Integer getVehiculosInvolucrados() {
        return vehiculosInvolucrados;
    }

    public void setVehiculosInvolucrados(Integer vehiculosInvolucrados) {
        this.vehiculosInvolucrados = vehiculosInvolucrados;
    }

    public Integer getLesionados() {
        return lesionados;
    }

    public void setLesionados(Integer lesionados) {
        this.lesionados = lesionados;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "fecha=" + fecha +
                ", id=" + id +
                ", lugar='" + lugar + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", hora='" + hora + '\'' +
                ", gravedad='" + gravedad + '\'' +
                ", testigos='" + testigos + '\'' +
                ", informePolicial='" + informePolicial + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", responsable='" + responsable + '\'' +
                ", estadoInforme='" + estadoInforme + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", costoEstimado=" + costoEstimado +
                ", vehiculosInvolucrados=" + vehiculosInvolucrados +
                ", lesionados=" + lesionados +
                '}';
    }
}
