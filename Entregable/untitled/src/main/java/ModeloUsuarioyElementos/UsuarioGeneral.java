package ModeloUsuarioyElementos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsuarioGeneral extends Usuario{
    //Atributos
    private float pagarSuscripcion;
    private boolean activarSuscripcion = false;
    private boolean accesoCompleto = false;
    private boolean compartirElemento = true;


    private int limiteElementosTareas = 8;
    private int limiteElementosRecordatorios = 14;
    private int limiteElementosCompartidos = 10;
    private LocalDate fechaActual = LocalDate.now();
    private DateTimeFormatter fechaSuscripcion = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter fechaLimiteSuscripcion = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    //Constructor Parametrizado
    public UsuarioGeneral(String nombreCompleto, int edad, String email, String password, float pagarSuscripcion, boolean activarSuscripcion, boolean accesoCompleto, boolean compartirElemento, LocalDate fechaActual, DateTimeFormatter fechaSuscripcion, DateTimeFormatter fechaLimiteSuscripcion) {
        super(nombreCompleto,edad,email,password);
        this.pagarSuscripcion = pagarSuscripcion;
        this.activarSuscripcion = activarSuscripcion;
        this.accesoCompleto = accesoCompleto;
        this.compartirElemento = compartirElemento;
        this.fechaActual = fechaActual;
        this.fechaSuscripcion = fechaSuscripcion;
        this.fechaLimiteSuscripcion = fechaLimiteSuscripcion;

    }


    @Override
    public void verificarUsuario() {
        if (getPassword() == getPassword()) {
            System.out.println("Usuario verificado correctamente. ");
        } else {
            System.out.println("Usuario no verificado. ");
        }
    }
    public void crearElemento() {

        System.out.println("Elemento: " + getNombreCompleto() + "Creado correctamente. ");
    }
    public void eliminarElemento() {

    }
    public void editarElemento() {

        System.out.println("Elemento: " + getNombreCompleto() + " editado correctamente. ");
    }
    public void compartirElemento() {

        System.out.println("Elemento: " + getNombreCompleto() + " compartido a:" + getNombreCompleto() + " correctamente. ");
    }
    public float pagarSuscripcion() {

        System.out.println("Suscripcion: " + pagarSuscripcion() + " pagada   correctamente. ");
        return 0;
    }


}
