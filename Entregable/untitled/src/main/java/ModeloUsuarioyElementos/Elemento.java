package ModeloUsuarioyElementos;

import java.time.format.DateTimeFormatter;

public abstract class Elemento {
    private int id;
    private String titulo;
    private String descripcion;
    public enum Prioridad {};
    private DateTimeFormatter fechaCreacion = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter fechaLimite = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int cantidadColaboradores;

//Constructores
    Elemento(int id, String titulo, String descripcion, int cantidadColaboradores, Prioridad prioridad, DateTimeFormatter fechaCreacion, DateTimeFormatter fechaLimite) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.cantidadColaboradores = cantidadColaboradores;
        this.fechaCreacion = fechaCreacion;
        this.fechaLimite = fechaLimite;

    }


//Getter y Setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public DateTimeFormatter getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(DateTimeFormatter fechaCreacion) {this.fechaCreacion = fechaCreacion;}

    public DateTimeFormatter getFechaLimite() {return fechaLimite;}
    public void setFechaLimite(DateTimeFormatter fechaLimite) {this.fechaLimite = fechaLimite;}

    public int getCantidadColaboradores() {return cantidadColaboradores;}
    public void setCantidadColaboradores(int cantidadColaboradores) {this.cantidadColaboradores = cantidadColaboradores;}



}