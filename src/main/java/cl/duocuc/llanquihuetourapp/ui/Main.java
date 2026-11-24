package cl.duocuc.llanquihuetourapp.ui;

import cl.duocuc.llanquihuetourapp.data.GestorClienteEmpleado;
import cl.duocuc.llanquihuetourapp.model.Persona;

public class Main {
    public static void main(String[] args) {

        GestorClienteEmpleado gestor = new GestorClienteEmpleado();

        // Cargar datos desde el archivo Excel usando los constructores con parámetros
        gestor.cargarDesdeExcel("personas.xlsx");

        System.out.println("--- Todos los registros ---");
        gestor.listarTodos();

        System.out.println("\n--- Clientes ---");
        gestor.mostrarClientes();

        System.out.println("\n--- Empleados ---");
        gestor.mostrarEmpleados();

        System.out.println("\n--- Personas de género Femenino ---");
        for (Persona per : gestor.buscarPorGenero("Femenino")) {
            System.out.println(per);
        }
    }
}
