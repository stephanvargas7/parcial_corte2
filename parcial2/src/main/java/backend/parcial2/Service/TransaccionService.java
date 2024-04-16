package backend.parcial2.Service;

import backend.parcial2.Entity.Transaccion;
import backend.parcial2.IRepository.ITransaccionRepository;
import backend.parcial2.IService.ITransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService implements ITransaccionService {
    @Autowired
    private ITransaccionRepository repository;
    public List<Transaccion> findAll(){
        return repository.findAll();
    }
    public Optional<Transaccion> findbyId(Long id){
        return repository.findById(id);
    }
    public Transaccion save(Transaccion transaccion){
        return repository.save(transaccion);
    }
    public void update(Transaccion transaccion, Long id){
        Optional<Transaccion> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Transaccion transaccionUpdate = new Transaccion();
            transaccionUpdate.setCliente(transaccion.getCliente());
            repository.save(transaccionUpdate);
        }else{
            System.out.println("No se encontró el transaccion");
        }
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
