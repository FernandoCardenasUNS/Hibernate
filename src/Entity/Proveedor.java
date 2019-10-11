package Entity;
// Generated 10/10/2019 08:13:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int idProveedor;
     private String descripcion;
     private Set<Producto> productos = new HashSet<Producto>(0);

    public Proveedor() {
    }

	
    public Proveedor(int idProveedor, String descripcion) {
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
    }
    public Proveedor(int idProveedor, String descripcion, Set<Producto> productos) {
       this.idProveedor = idProveedor;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Producto> getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }




}


