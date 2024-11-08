package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cargues_productos")
public class CargueProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer cantidad;

    @Column(name="cargue_inventario")
    private boolean cargueInventario;

    @Column(name="fecha_cargue_inventario")
    private Date fechaCargueInventario;

    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_cargue",referencedColumnName = "id")
    private Cargue cargue;



}
