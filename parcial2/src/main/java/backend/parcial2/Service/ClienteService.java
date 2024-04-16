package backend.parcial2.Service;

import backend.parcial2.Entity.Cliente;
import backend.parcial2.IRepository.IClienteRepository;
import backend.parcial2.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository repository;
    public List<Cliente> findAll(){
        return repository.findAll();
    }
    public Optional<Cliente> findbyId(Long id){
        return repository.findById(id);
    }
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }
    public void update(Cliente cliente, Long id){
        Optional<Cliente> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Cliente clienteUpdate = new Cliente();
            clienteUpdate.setNombre(cliente.getNombre());
            clienteUpdate.setDireccion(cliente.getDireccion());
            repository.save(clienteUpdate);
        }else{
            System.out.println("No se encontró el cliente");
        }
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
