package cl.duocuc.llanquihuetourapp.model;

// Representa un empleado con sus atributos. Hereda de Persona.
public class Empleado extends Persona {

    private String cargo;
    private String departamento;
    private String fechacontratacion;
    private double salario;

    // Constructor vacío
    public Empleado() {
        super();
        this.cargo = "sin cargo";
        this.departamento = "sin departamento";
        this.fechacontratacion = "sin fecha de contratacion";
        this.salario = 0.0;
    }

    // Constructor con parámetros
    public Empleado(String nombre, String apellido, String genero, String direccion,
                    String email, String tipodocumento, String id, String anionacimiento,
                    String telefono, String numdocumento,
                    String cargo, String departamento, String fechacontratacion, double salario) {
        super(nombre, apellido, genero, direccion, email, tipodocumento, id, anionacimiento, telefono, numdocumento);
        this.cargo = cargo;
        this.departamento = departamento;
        this.fechacontratacion = fechacontratacion;
        this.salario = salario;
    }

    // Getters y Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getFechacontratacion() { return fechacontratacion; }
    public void setFechacontratacion(String fechacontratacion) { this.fechacontratacion = fechacontratacion; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return super.toString() + " | " + cargo + " | " + departamento + " | " + fechacontratacion + " | $" + salario;
    }
}
