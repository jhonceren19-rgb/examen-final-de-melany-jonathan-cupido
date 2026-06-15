

public class DetalleVenta {
    // Atributos privados
    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    // Constructor
    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        // El subtotal usualmente se calcula automáticamente, 
        // pero podemos inicializarlo invocando el método correspondiente.
        calcularSubtotal();
    }

    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int id) {
        this.idDetalle = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        this.cantidad = cant;
        // Si cambia la cantidad, recalculamos el subtotal
        calcularSubtotal();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto prod) {
        this.producto = prod;
        // Si cambia el producto, recalculamos el subtotal
        calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Métodos de lógica del negocio del diagrama
    public double calcularSubtotal() {
        if (this.producto != null) {
            // Asumiendo que la clase Producto tiene el método getPrecioVenta()
            this.subtotal = this.cantidad * this.producto.getPrecioVenta();
        } else {
            this.subtotal = 0.0;
        }
        return this.subtotal;
    }

    // Método toString
    @Override
    public String toString() {
        return "DetalleVenta{" +
                "idDetalle=" + idDetalle +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", producto=" + (producto != null ? producto.getNombre() : "null") +
                '}';
    }
}
