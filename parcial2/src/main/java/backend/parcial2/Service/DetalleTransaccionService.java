package backend.parcial2.Service;

import backend.parcial2.Entity.DetalleTransaccion;
import backend.parcial2.IRepository.IDetalleTransaccionRepository;
import backend.parcial2.IService.IDetalleTransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleTransaccionService implements IDetalleTransaccionService {
    @Autowired
    private IDetalleTransaccionRepository repository;
    public List<DetalleTransaccion> findAll(){
        return repository.findAll();
    }
    public Optional<DetalleTransaccion> findbyId(Long id){
        return repository.findById(id);
    }
    public DetalleTransaccion save(DetalleTransaccion detalleTransaccion){
        return repository.save(detalleTransaccion);
    }
    public void update(DetalleTransaccion detalleTransaccion, Long id){
        Optional<DetalleTransaccion> ps = repository.findById(id);
        if(!ps.isEmpty()){
            DetalleTransaccion detalleTransaccionUpdate = new DetalleTransaccion();
            detalleTransaccionUpdate.setTransaccion(detalleTransaccion.getTransaccion());
            detalleTransaccionUpdate.setCantidad(detalleTransaccion.getCantidad());
            detalleTransaccionUpdate.setProducto(detalleTransaccion.getProducto());
            repository.save(detalleTransaccionUpdate);
        }else{
            System.out.println("No se encontró el detalleTransaccion");
        }
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
