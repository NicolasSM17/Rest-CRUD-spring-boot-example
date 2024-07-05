package pe.joe.cibertec.service;

import pe.joe.cibertec.entity.Libro;
import pe.joe.cibertec.entity.Tema;

import java.util.List;

public interface ILibroService {
    List<Libro> listar();
    List<Tema> listarTemas();
    Libro buscarPorId(Integer id);
    Libro insertar(Libro libro);
    void eliminar(Integer id);
    Libro actualizar(Integer id, Libro libro);
}
