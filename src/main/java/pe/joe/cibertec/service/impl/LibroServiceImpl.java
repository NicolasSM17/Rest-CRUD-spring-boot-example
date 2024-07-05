package pe.joe.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joe.cibertec.entity.Libro;
import pe.joe.cibertec.entity.Tema;
import pe.joe.cibertec.repository.ILibroRepository;
import pe.joe.cibertec.repository.ITemaRepository;
import pe.joe.cibertec.service.ILibroService;

import java.util.List;

@Service
public class LibroServiceImpl implements ILibroService {
    @Autowired
    private ILibroRepository libroRepository;

    @Autowired
    private ITemaRepository temaRepository;

    @Override
    public List<Libro> listar() {
        return libroRepository.findAll();
    }

    @Override
    public List<Tema> listarTemas() {
        return temaRepository.findAll();
    }

    @Override
    public Libro buscarPorId(Integer id) {
        return libroRepository.findById(id).get();
    }

    @Override
    public Libro insertar(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void eliminar(Integer id) {
        Libro libroBD = libroRepository.findById(id).get();
        libroRepository.delete(libroBD);
    }

    @Override
    public Libro actualizar(Integer id, Libro libro) {
        Libro libroBD = libroRepository.findById(id).get();
        libroBD.setTitulo(libro.getTitulo());
        libroBD.setPrecio(libro.getPrecio());
        libroBD.setCantEjemplares(libro.getCantEjemplares());
        libroBD.setOrigen(libro.getOrigen());
        libroBD.setTema(libro.getTema());

        return libroRepository.save(libroBD);
    }
}
