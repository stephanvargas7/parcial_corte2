package backend.parcial2.IService;

import backend.parcial2.Entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Producto> findAll();
    Optional<Producto> findbyId(Long id);
    Producto save(Producto producto);
    void update(Producto producto, Long id);
    void delete(Long id);
}
