package cl.duocuc.llanquihuetourapp.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cl.duocuc.llanquihuetourapp.model.Cliente;
import cl.duocuc.llanquihuetourapp.model.Empleado;
import cl.duocuc.llanquihuetourapp.model.Persona;

// Gestiona las listas de clientes y empleados de la aplicación.
public class GestorClienteEmpleado {

    private List<Cliente> clientes;
    private List<Empleado> empleados;

    // Constructor
    public GestorClienteEmpleado() {
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // Convierte cualquier celda a String, manejando números enteros sin decimales.
    private String celdaAString(Cell celda) {
        if (celda == null) return "";
        switch (celda.getCellType()) {
            case STRING:  return celda.getStringCellValue().trim();
            case NUMERIC: {
                double val = celda.getNumericCellValue();
                // Si es entero (sin parte decimal), devolver sin ".0"
                if (val == Math.floor(val)) return String.valueOf((long) val);
                return String.valueOf(val);
            }
            case BOOLEAN: return String.valueOf(celda.getBooleanCellValue());
            default:      return "";
        }
    }

    // Cargar personas desde personas.xlsx y clasificarlas según "Tipo de Usuario".
    // Fila 1 es el título, fila 2 es el encabezado, los datos empiezan en fila 3.
    public void cargarDesdeExcel(String rutaArchivo) {
        try (FileInputStream fis = new FileInputStream(rutaArchivo);
             Workbook libro = new XSSFWorkbook(fis)) {

            Sheet hoja = libro.getSheetAt(0);

            // La fila 0 es el título "Tabla de personas", la fila 1 es el encabezado.
            // Los datos comienzan en la fila 2 (índice base 0).
            for (int i = 2; i <= hoja.getLastRowNum(); i++) {
                Row fila = hoja.getRow(i);
                if (fila == null) continue;

                String nombre        = celdaAString(fila.getCell(0));
                String apellido      = celdaAString(fila.getCell(1));
                String genero        = celdaAString(fila.getCell(2));
                String direccion     = celdaAString(fila.getCell(3));
                String email         = celdaAString(fila.getCell(4));
                String tipoDocumento = celdaAString(fila.getCell(5));
                String id            = celdaAString(fila.getCell(6));
                String anioNac       = celdaAString(fila.getCell(7));
                String telefono      = celdaAString(fila.getCell(8));
                String numDocumento  = celdaAString(fila.getCell(9));
                String tipoUsuario   = celdaAString(fila.getCell(10));

                // Saltar filas vacías
                if (nombre.isEmpty() && tipoUsuario.isEmpty()) continue;

                if (tipoUsuario.equalsIgnoreCase("Cliente")) {
                    // Usa el constructor con parámetros de Cliente (que llama a super() de Persona)
                    Cliente cliente = new Cliente(
                            nombre, apellido, genero, direccion, email,
                            tipoDocumento, id, anioNac, telefono, numDocumento,
                            "sin fecha de reserva", "sin actividad", 0.0, false
                    );
                    clientes.add(cliente);

                } else if (tipoUsuario.equalsIgnoreCase("Empleado")) {
                    // Usa el constructor con parámetros de Empleado (que llama a super() de Persona)
                    Empleado empleado = new Empleado(
                            nombre, apellido, genero, direccion, email,
                            tipoDocumento, id, anioNac, telefono, numDocumento,
                            "sin cargo", "sin departamento", "sin fecha de contratacion", 0.0
                    );
                    empleados.add(empleado);

                } else {
                    System.out.println("Tipo de usuario desconocido: " + nombre + " " + apellido);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo Excel: " + e.getMessage());
        }
    }

    // Listar todas las personas (clientes y empleados)
    public void listarTodos() {
        for (Cliente c : clientes)   System.out.println("[Cliente]  " + c);
        for (Empleado e : empleados) System.out.println("[Empleado] " + e);
    }

    // Buscar personas por género en ambas listas
    public List<Persona> buscarPorGenero(String genero) {
        List<Persona> resultado = new ArrayList<>();
        for (Cliente c : clientes)
            if (c.getGenero().equalsIgnoreCase(genero)) resultado.add(c);
        for (Empleado e : empleados)
            if (e.getGenero().equalsIgnoreCase(genero)) resultado.add(e);
        return resultado;
    }

    // Agregar cliente manualmente
    public void agregarCliente(Cliente cliente) { clientes.add(cliente); }

    // Agregar empleado manualmente
    public void agregarEmpleado(Empleado empleado) { empleados.add(empleado); }

    // Obtener lista de clientes
    public List<Cliente> getClientes() { return clientes; }

    // Obtener lista de empleados
    public List<Empleado> getEmpleados() { return empleados; }

    // Mostrar todos los clientes
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente c : clientes) System.out.println(c);
        }
    }

    // Mostrar todos los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) System.out.println(e);
        }
    }
}
