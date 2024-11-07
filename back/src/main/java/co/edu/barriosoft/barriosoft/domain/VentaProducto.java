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
    @Column(name="id_venta")
    private Integer idVenta;

    @Column(name="id_producto")
    private Integer idProducto;

    @Column(name="id_precio")
    private Integer idPrecio;

    private Integer cantidad;

    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    private boolean estado;
}
