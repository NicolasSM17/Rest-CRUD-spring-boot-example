package pe.joe.cibertec.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlibro")
    private Integer id;

    @Column(name = "titulo", length = 45, nullable = false)
    private String titulo;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "cantEjemplares", nullable = false)
    private Integer cantEjemplares;

    @Column(name = "origen", length = 45)
    private String origen;

    @ManyToOne
    @JoinColumn(name = "idtema", nullable = false)
    private Tema tema;
}
