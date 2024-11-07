package co.edu.barriosoft.barriosoft.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    @Column(name="id_cargue")
    private Integer idCargue;

    @Column(name="id_producto")
    private Integer idProducto;

    private Integer cantidad;

    @Column(name="cargue_inventario")
    private boolean cargueInventario;

    @Column(name="fecha_cargue_inventario")
    private Date fechaCargueInventario;


}
