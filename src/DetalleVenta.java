
public class DetalleVenta {
    // Atributos privados (-)
    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    // Constructor público (+)
    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        // Se calcula el subtotal automáticamente basándose en el producto y la cantidad
        this.subtotal = calcularSubtotal();
    }

    // Métodos públicos (+)
    public int getIdDetalle() {
        return idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        this.cantidad = cant;
        this.subtotal = calcularSubtotal(); // Actualiza el subtotal si cambia la cantidad
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto prod) {
        this.producto = prod;
        this.subtotal = calcularSubtotal(); // Actualiza el subtotal si cambia el producto
    }

    public double calcularSubtotal() {
        if (producto != null) {
            return this.cantidad * producto.getPrecioVenta();
        }
        return 0.0;
    }

    public double getSubtotal() {
        return subtotal;
    }

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