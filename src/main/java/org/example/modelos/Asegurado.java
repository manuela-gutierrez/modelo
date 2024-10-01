package org.example.modelos;

public class Asegurado {
  private   long id;
    private Integer numeroPolizasVigentes;
    private  Integer añosExperiencia;
    private  Integer valorBienesAsegurados;
    private  String nombre;
    private   String genero;
    private  String estadoCivil;
    private  String ocupacion;
    private   String HistorialSalud;
    private  String Habitos;
    private  String HistorialReclamaciones;
    private String TipoCoberturaDeseada;
    private  String ubicacionGeografica;
    private  String metodoPago;
    private String refencias;

    public Asegurado() {
    }

    public Asegurado(long id, Integer numeroPolizasVigentes, Integer añosExperiencia, Integer valorBienesAsegurados, String nombre, String genero, String estadoCivil, String ocupacion, String historialSalud, String habitos, String historialReclamaciones, String tipoCoberturaDeseada, String ubicacionGeografica, String metodoPago, String refencias) {
        this.id = id;
        this.numeroPolizasVigentes = numeroPolizasVigentes;
        this.añosExperiencia = añosExperiencia;
        this.valorBienesAsegurados = valorBienesAsegurados;
        this.nombre = nombre;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        HistorialSalud = historialSalud;
        Habitos = habitos;
        HistorialReclamaciones = historialReclamaciones;
        TipoCoberturaDeseada = tipoCoberturaDeseada;
        this.ubicacionGeografica = ubicacionGeografica;
        this.metodoPago = metodoPago;
        this.refencias = refencias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getNumeroPolizasVigentes() {
        return numeroPolizasVigentes;
    }

    public void setNumeroPolizasVigentes(Integer numeroPolizasVigentes) {
        this.numeroPolizasVigentes = numeroPolizasVigentes;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Integer getValorBienesAsegurados() {
        return valorBienesAsegurados;
    }

    public void setValorBienesAsegurados(Integer valorBienesAsegurados) {
        this.valorBienesAsegurados = valorBienesAsegurados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHistorialSalud() {
        return HistorialSalud;
    }

    public void setHistorialSalud(String historialSalud) {
        HistorialSalud = historialSalud;
    }

    public String getHabitos() {
        return Habitos;
    }

    public void setHabitos(String habitos) {
        Habitos = habitos;
    }

    public String getHistorialReclamaciones() {
        return HistorialReclamaciones;
    }

    public void setHistorialReclamaciones(String historialReclamaciones) {
        HistorialReclamaciones = historialReclamaciones;
    }

    public String getTipoCoberturaDeseada() {
        return TipoCoberturaDeseada;
    }

    public void setTipoCoberturaDeseada(String tipoCoberturaDeseada) {
        TipoCoberturaDeseada = tipoCoberturaDeseada;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getRefencias() {
        return refencias;
    }

    public void setRefencias(String refencias) {
        this.refencias = refencias;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", numeroPolizasVigentes=" + numeroPolizasVigentes +
                ", añosExperiencia=" + añosExperiencia +
                ", valorBienesAsegurados=" + valorBienesAsegurados +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", HistorialSalud='" + HistorialSalud + '\'' +
                ", Habitos='" + Habitos + '\'' +
                ", HistorialReclamaciones='" + HistorialReclamaciones + '\'' +
                ", TipoCoberturaDeseada='" + TipoCoberturaDeseada + '\'' +
                ", ubicacionGeografica='" + ubicacionGeografica + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", refencias='" + refencias + '\'' +
                '}';
    }
}
