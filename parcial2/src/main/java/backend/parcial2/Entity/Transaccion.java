package backend.parcial2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name="cliente_id",nullable=false)
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
