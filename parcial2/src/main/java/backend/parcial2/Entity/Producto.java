package backend.parcial2.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="valor_unitario",precision = 10, scale = 1,nullable=false)
    private BigDecimal valorUnitario;

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
