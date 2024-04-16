package backend.parcial2.Service;

import backend.parcial2.Entity.Producto;
import backend.parcial2.IRepository.IProductoRepository;
import backend.parcial2.IService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository repository;
    public List<Producto> findAll(){
        return repository.findAll();
    }
    public Optional<Producto> findbyId(Long id){
        return repository.findById(id);
    }
    public Producto save(Producto producto){
        return repository.save(producto);
    }
    public void update(Producto producto, Long id){
        Optional<Producto> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Producto productoUpdate = new Producto();
            productoUpdate.setValorUnitario(producto.getValorUnitario());
            repository.save(productoUpdate);
        }else{
            System.out.println("No se encontró el producto");
        }
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
