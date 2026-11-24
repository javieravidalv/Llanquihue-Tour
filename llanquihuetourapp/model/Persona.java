package cl.duocuc.llanquihuetourapp.model;

// Representa una persona con sus atributos.
public class Persona {

    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private String email;
    private String tipodocumento;
    private String id;
    private String anionacimiento;
    private String telefono;
    private String numdocumento;

    // Constructor vacío
    public Persona() {
        this.nombre = "sin nombre";
        this.apellido = "sin apellido";
        this.genero = "sin genero";
        this.direccion = "sin direccion";
        this.email = "sin email";
        this.tipodocumento = "sin documento";
        this.id = "0";
        this.anionacimiento = "0";
        this.telefono = "0";
        this.numdocumento = "sin documento";
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, String genero, String direccion,
                   String email, String tipodocumento, String id, String anionacimiento,
                   String telefono, String numdocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.tipodocumento = tipodocumento;
        this.id = id;
        this.anionacimiento = anionacimiento;
        this.telefono = telefono;
        this.numdocumento = numdocumento;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getGenero() { return genero; }
    public String getDireccion() { return direccion; }
    public String getEmail() { return email; }
    public String getTipodocumento() { return tipodocumento; }
    public String getId() { return id; }
    public String getAnionacimiento() { return anionacimiento; }
    public String getTelefono() { return telefono; }
    public String getNumdocumento() { return numdocumento; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setEmail(String email) { this.email = email; }
    public void setTipodocumento(String tipodocumento) { this.tipodocumento = tipodocumento; }
    public void setId(String id) { this.id = id; }
    public void setAnionacimiento(String anionacimiento) { this.anionacimiento = anionacimiento; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setNumdocumento(String numdocumento) { this.numdocumento = numdocumento; }

    @Override
    public String toString() {
        return nombre + " | " + apellido + " | " + genero + " | " + direccion +
               " | " + email + " | " + tipodocumento + " | " + id + " | " + anionacimiento +
               " | " + telefono + " | " + numdocumento;
    }
}
