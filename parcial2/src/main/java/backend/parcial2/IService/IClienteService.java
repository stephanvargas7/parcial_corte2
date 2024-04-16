package backend.parcial2.IService;

import backend.parcial2.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService{
    List<Cliente> findAll();
    Optional<Cliente> findbyId(Long id);
    Cliente save(Cliente cliente);
    void update(Cliente cliente, Long id);
    void delete(Long id);
}
