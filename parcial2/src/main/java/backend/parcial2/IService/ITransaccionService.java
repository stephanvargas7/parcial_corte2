package backend.parcial2.IService;

import backend.parcial2.Entity.Transaccion;

import java.util.List;
import java.util.Optional;

public interface ITransaccionService {
    List<Transaccion> findAll();
    Optional<Transaccion> findbyId(Long id);
    Transaccion save(Transaccion transaccion);
    void update(Transaccion transaccion, Long id);
    void delete(Long id);
}
