package ModeloUsuarioyElementos;

import java.time.format.DateTimeFormatter;

public class ElementoTarea extends Elemento {
    private enum Estado {};

//Constructor


    public ElementoTarea(int id, String titulo, String descripcion, int cantidadColaboradores, Prioridad prioridad, Estado estado, DateTimeFormatter fechaCreacion, DateTimeFormatter fechaLimite) {
        super(id, titulo, descripcion, cantidadColaboradores, prioridad, fechaCreacion, fechaLimite);
        this.es
    }
}
