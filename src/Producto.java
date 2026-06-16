
public class Producto {
    // Atributos privados
    private int idProducto;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private int cantidadMax;
    private int cantidadMin;
    private Categoria categoria;

    // Constructor
    public Producto(int id, String nombre, double pC, double pV, Categoria cat) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precioCompra = pC;
        this.precioVenta = pV;
        this.categoria = cat;
        // Los atributos de cantidad no están en el constructor del diagrama, 
        // pero se inicializarán por defecto en 0 o puedes agregar sus setters después.
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int id) {
        this.idProducto = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precio) {
        this.precioCompra = precio;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precio) {
        this.precioVenta = precio;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cant) {
        this.cantidadMax = cant;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(int cant) {
        this.cantidadMin = cant;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria cat) {
        this.categoria = cat;
    }

    // Método toString
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", cantidadMax=" + cantidadMax +
                ", cantidadMin=" + cantidadMin +
                ", categoria=" + categoria +
                '}';
    }
}