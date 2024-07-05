package pe.joe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joe.cibertec.entity.Tema;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Integer> {
}
