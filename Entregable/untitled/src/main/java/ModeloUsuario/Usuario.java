package ModeloUsuario;

public abstract class Usuario implements AccionesUsuario {
    private String nombreCompleto;
    private int edad;
    private String email;
    private String password;

    //Constructores:
    public Usuario(String nombreCompleto, int edad, String email, String password) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.email = email;
        this.password = password;
    }

    //Metodos Getter y Setter:
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Metodos:
    @Override
    public void verificarUsuario() {
        if (password.equals(this.password)) {
            System.out.println("Usuario verificado correctamente. ");
        } else {
            System.out.println("Usuario no verificado. ");
        }
    }
    public void crearElemento() {

        System.out.println("Elemento: " + nombreCompleto + "Creado correctamente. ");
    }
    public void editarElemento() {

        System.out.println("Elemento: " + nombreCompleto + " editado correctamente. ");
    }
    public void compartirElemento() {

        System.out.println("Elemento: " + nombreCompleto + " compartido a:" + this.nombreCompleto + " correctamente. ");
    }
    public float pagarSuscripcion() {

        System.out.println("Suscripcion: " + pagarSuscripcion() + " pagada   correctamente. ");
        return 0;
    }

}