[README_plantilla_EFT.md](https://github.com/user-attachments/files/35307658/README_plantilla_EFT.md)
![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 2 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Javiera Vidal
- **Sección:** 1
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
LlanquihueTourApp es una aplicación en Java (con Maven y Apache POI) que gestiona clientes y empleados de una empresa de turismo, cargando sus datos desde una planilla Excel (personas.xlsx).

Usa herencia: las clases Cliente y Empleado extienden de Persona, y la clase GestorClienteEmpleado clasifica a cada registro según su "Tipo de Usuario" y lo guarda en la lista correspondiente.

Desde consola permite listar todos los registros, mostrar clientes y empleados por separado, y buscar personas por género.

---

## 🧱 Estructura general del proyecto

```LlanquihueTourApp_v2/
│
├── personas.xlsx                          ← Datos de entrada (3 clientes, 3 empleados)
├── pom.xml                                ← Configuración Maven (Java 21, Apache POI 5.4.1)
│
└── src/main/java/cl/duocuc/llanquihuetourapp/
    │
    ├── Main.java                          ← Punto de entrada principal
    │
    ├── ui/
    │   └── Main.java                      ← Punto de entrada alternativo (mismo contenido)
    │
    ├── model/                             ← Clases del dominio
    │   ├── Persona.java                   ← Superclase base
    │   ├── Cliente.java                   ← extends Persona
    │   └── Empleado.java                  ← extends Persona
    │
    └── data/
        └── GestorClienteEmpleado.java     ← Lee el .xlsx y administra las listas

````

---

**Repositorio GitHub:** \[https://github.com/javieravidalv/Llanquihue-Tour]
**Fecha de entrega:** \[23/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa 2




