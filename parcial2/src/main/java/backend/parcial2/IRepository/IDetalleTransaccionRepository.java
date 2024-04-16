package backend.parcial2.IRepository;

import backend.parcial2.Entity.DetalleTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleTransaccionRepository extends JpaRepository<DetalleTransaccion, Long> {
}
