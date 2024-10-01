package org.example.modelos;

public class Beneficiario {
   private long id;
    private String nombre;
    private String apellido;
    private String relacion;
    private String numeroDocumento;
    private String telefono;
    private  String email;
    private  String direccion;
    private String estadoCivil;
    private  String nacionalidad;
    private String profecion;
    private String observaciones;
    private double cobertura;
    private double ingresosMensuales;
    private Integer dependientes;

    public Beneficiario() {
    }

    public Beneficiario(long id, String nombre, String apellido, String relacion, String numeroDocumento, String telefono, String email, String direccion, String estadoCivil, String nacionalidad, String profecion, String observaciones, double cobertura, double ingresosMensuales, Integer dependientes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.relacion = relacion;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
        this.profecion = profecion;
        this.observaciones = observaciones;
        this.cobertura = cobertura;
        this.ingresosMensuales = ingresosMensuales;
        this.dependientes = dependientes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getCobertura() {
        return cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public Integer getDependientes() {
        return dependientes;
    }

    public void setDependientes(Integer dependientes) {
        this.dependientes = dependientes;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", relacion='" + relacion + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", profecion='" + profecion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", cobertura=" + cobertura +
                ", ingresosMensuales=" + ingresosMensuales +
                ", dependientes=" + dependientes +
                '}';
    }
}
