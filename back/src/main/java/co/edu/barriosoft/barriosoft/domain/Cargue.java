package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cargues")
public class Cargue {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "creado_por", nullable = true)
    private Integer creado_por;

    @Column(name = "fecha_creacion", nullable = true)
    private Instant fecha_creacion;

    @Column(name = "estado", nullable = true)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name= "id_proveedor", referencedColumnName = "id")
    private Proveedor proveedor;
}
