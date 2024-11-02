package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "inventarios")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    @Id
    @Column(name = "inventario_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventario;

    @ManyToOne
    @JoinColumn(name = "inventario_producto_id", referencedColumnName = "producto_id")
    private Producto productoInventario;

    @Column(name = "inventario_cantidad_disponible")
    private Integer cantidadDisponibleInventario;

    @ManyToOne
    @JoinColumn(name = "inventario_unidad_id", referencedColumnName = "unidad_id")
    private Unidad unidadInventario;

    @ManyToOne
    @JoinColumn(name = "inventario_tienda_id", referencedColumnName = "tienda_id")
    private Tienda tiendaInventario;
}
