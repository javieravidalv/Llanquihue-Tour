package cl.duocuc.llanquihuetourapp.model;

// Representa un cliente con sus atributos. Hereda de Persona.
public class Cliente extends Persona {

    private String fechaReserva;
    private String actividad;
    private double saldo;
    private boolean reservaActiva;

    // Constructor vacío
    public Cliente() {
        super();
        this.fechaReserva = "sin fecha de reserva";
        this.actividad = "sin actividad";
        this.saldo = 0.0;
        this.reservaActiva = false;
    }

    // Constructor con parámetros
    public Cliente(String nombre, String apellido, String genero, String direccion,
                   String email, String tipodocumento, String id, String anionacimiento,
                   String telefono, String numdocumento,
                   String fechaReserva, String actividad, double saldo, boolean reservaActiva) {
        super(nombre, apellido, genero, direccion, email, tipodocumento, id, anionacimiento, telefono, numdocumento);
        this.fechaReserva = fechaReserva;
        this.actividad = actividad;
        this.saldo = saldo;
        this.reservaActiva = reservaActiva;
    }

    // Getters y Setters
    public String getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(String fechaReserva) { this.fechaReserva = fechaReserva; }
    public String getActividad() { return actividad; }
    public void setActividad(String actividad) { this.actividad = actividad; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public boolean getReservaActiva() { return reservaActiva; }
    public void setReservaActiva(boolean reservaActiva) { this.reservaActiva = reservaActiva; }

    @Override
    public String toString() {
        return super.toString() + " | " + fechaReserva + " | " + actividad + " | $" + saldo + " | " + reservaActiva;
    }
}
