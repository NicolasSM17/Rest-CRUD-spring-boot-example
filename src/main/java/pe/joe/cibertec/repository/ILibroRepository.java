package pe.joe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joe.cibertec.entity.Libro;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Integer> {
}
