package backend.parcial2.IRepository;

import backend.parcial2.Entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransaccionRepository extends JpaRepository<Transaccion, Long> {
}
