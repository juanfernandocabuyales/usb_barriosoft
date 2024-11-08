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
@Table(name = "ventas_producto")

public class VentaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private Integer cantidad;

    private Double total;

    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    private boolean estado;


    @ManyToOne
    @JoinColumn(name = "id_venta",referencedColumnName = "id")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_precio",referencedColumnName = "id")
    private Precio precio;
}
