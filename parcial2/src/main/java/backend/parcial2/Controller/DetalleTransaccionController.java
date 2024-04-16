package backend.parcial2.Controller;

import backend.parcial2.Entity.DetalleTransaccion;
import backend.parcial2.IService.IDetalleTransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("detalleTransaccion")
public class DetalleTransaccionController {
    @Autowired
    private IDetalleTransaccionService service;
    @GetMapping()
    public List<DetalleTransaccion> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<DetalleTransaccion> findbyId(@PathVariable Long id){
        return service.findbyId(id);
    }
    @PostMapping()
    public DetalleTransaccion save(@RequestBody DetalleTransaccion detalleTransaccion){
        return service.save(detalleTransaccion);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody DetalleTransaccion detalleTransaccion, @PathVariable Long id){
        service.update(detalleTransaccion, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}