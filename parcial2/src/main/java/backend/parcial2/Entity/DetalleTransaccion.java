package backend.parcial2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class DetalleTransaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name="producto_id",nullable=false)
    private Producto producto;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name="transaccion_id",nullable=false)
    private Transaccion transaccion;
    @Column(name="cantidad",precision = 10, scale = 1,nullable=false)
    private Integer cantidad;
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Transaccion getTransaccion() {
        return transaccion;
    }
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
