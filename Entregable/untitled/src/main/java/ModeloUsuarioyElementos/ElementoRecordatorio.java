package ModeloUsuarioyElementos;

import java.time.format.DateTimeFormatter;

public class ElementoRecordatorio extends Elemento {
    private DateTimeFormatter fechaRecordatorio;

//Constructor
    public ElementoRecordatorio(int id, String titulo, String descripcion, int cantidadColaboradores, Elemento.Prioridad prioridad, DateTimeFormatter fechaCreacion, DateTimeFormatter fechaLimite, DateTimeFormatter fechaRecordatorio) {
        super(id, titulo, descripcion, cantidadColaboradores, prioridad, fechaCreacion, fechaLimite);
        this.fechaRecordatorio = fechaRecordatorio;
    }



}
