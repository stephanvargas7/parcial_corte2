package backend.parcial2.IService;

import backend.parcial2.Entity.DetalleTransaccion;

import java.util.List;
import java.util.Optional;

public interface IDetalleTransaccionService {
    List<DetalleTransaccion> findAll();
    Optional<DetalleTransaccion> findbyId(Long id);
    DetalleTransaccion save(DetalleTransaccion detalleTransaccion);
    void update(DetalleTransaccion detalleTransaccion, Long id);
    void delete(Long id);
}
