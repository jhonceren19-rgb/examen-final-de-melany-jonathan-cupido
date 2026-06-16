public class empeado {
    // Atributos privados
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private String direccion;
    private String fechaIngreso;
    private String horarioEntrada;
    private String horarioSalida;

    // Constructor (según el diagrama recibe: id, nombre y cargo)
    public empeado(int id, String nombre, String cargo) {
        this.idEmpleado = id;
        this.nombre = nombre;
        this.cargo = cargo;
        // Los demás atributos se inicializan vacíos por defecto
        this.direccion = "";
        this.fechaIngreso = "";
        this.horarioEntrada = "";
        this.horarioSalida = "";
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int id) {
        this.idEmpleado = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String dir) {
        this.direccion = dir;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    // Nota: El diagrama no especifica un setFechaIngreso, pero se suele omitir si es fija.
    // Solo dejamos los métodos que explícitamente aparecen listados en tu diagrama.

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", horarioEntrada='" + horarioEntrada + '\'' +
                ", horarioSalida='" + horarioSalida + '\'' +
                '}';
    }
}