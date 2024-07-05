package pe.joe.cibertec.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tema")
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtema")
    private Integer id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tema")
    @JsonIgnore
    private List<Libro> libros;
}
