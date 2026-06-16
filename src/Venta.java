import java.util.ArrayList;

public class Venta<Cliente> {
    // Atributos privados (-)
    private int idVenta;
    private String fecha;
    private double total;
    private Cliente cliente;
    private  empleado;
    private ArrayList<DetalleVenta> detalles;

    // Constructor público (+)
    public Venta(int id, String fecha, Cliente cli, Empleado emp) {
        this.idVenta = id;
        this.fecha = fecha;
        this.cliente = cli;
        this.empleado = emp;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos públicos (+)
    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cli) {
        this.cliente = cli;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado emp) {
        this.empleado = emp;
    }

    public void agregarDetalle(DetalleVenta det) {
        if (det != null) {
            this.detalles.add(det);
            this.total = calcularTotal(); // Recalcula el total al añadir un producto
        }
    }

    public double calcularTotal() {
        double sumaTotal = 0.0;
        for (DetalleVenta det : detalles) {
            sumaTotal += det.getSubtotal();
        }
        return sumaTotal;
    }

    // Nota: Aunque el diagrama incluye 'double total' como atributo, 
    // comúnmente se expone mediante este getter que devuelve el valor calculado o almacenado.
    public double getTotal() {
        return total;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", fecha='" + fecha + '\'' +
                ", total=" + total +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", cantidadDetalles=" + detalles.size() +
                '}';
    }
}
