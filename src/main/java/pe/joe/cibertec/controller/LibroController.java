package pe.joe.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.joe.cibertec.entity.Libro;
import pe.joe.cibertec.entity.Tema;
import pe.joe.cibertec.service.ILibroService;

import java.util.List;

@RestController
@CrossOrigin
public class LibroController {
    @Autowired
    private ILibroService libroService;

    @GetMapping
    public ResponseEntity<List<Libro>> listar(){
        return new ResponseEntity<>(libroService.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> buscarPorId(@PathVariable Integer id){
        return new ResponseEntity<>(libroService.buscarPorId(id), HttpStatus.OK);
    }

    @GetMapping("/temas")
    public ResponseEntity<List<Tema>> listarTemas(){
        return new ResponseEntity<>(libroService.listarTemas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Libro> insertar(@RequestBody Libro libro){
        return new ResponseEntity<>(libroService.insertar(libro), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizar(@PathVariable Integer id, @RequestBody Libro libro){
        return new ResponseEntity<>(libroService.actualizar(id, libro), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        libroService.eliminar(id);
    }
}
