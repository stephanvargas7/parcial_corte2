package backend.parcial2.Controller;

import backend.parcial2.Entity.Producto;
import backend.parcial2.IService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    private IProductoService service;

    @GetMapping()
    public List<Producto> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Producto> findbyId(@PathVariable Long id){
        return service.findbyId(id);
    }
    @PostMapping()
    public Producto save(@RequestBody Producto producto){
        return service.save(producto);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Producto producto, @PathVariable Long id){
        service.update(producto, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}