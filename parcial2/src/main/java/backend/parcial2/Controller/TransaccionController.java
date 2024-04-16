package backend.parcial2.Controller;

import backend.parcial2.Entity.Transaccion;
import backend.parcial2.IService.ITransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("transaccion")
public class TransaccionController {
    @Autowired
    private ITransaccionService service;
    @GetMapping()
    public List<Transaccion> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Transaccion> findbyId(@PathVariable Long id){
        return service.findbyId(id);
    }
    @PostMapping()
    public Transaccion save(@RequestBody Transaccion transaccion){
        return service.save(transaccion);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Transaccion transaccion, @PathVariable Long id){
        service.update(transaccion, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}