package co.edu.barriosoft.barriosoft.domain;

import jakarta.annotation.Nullable;
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
@Table(name = "precios")

public class Precio {
    @Id
    @Column(nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private float precio;

    @Column(name="fecha_desde")
    private Date fechaDesde;

    @Column(name="fecha_hasta")
    private Date fechaHasta;

    @Column(name="creado_por")
    private Integer creadoPor;

    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    @Column
    private boolean estado;

    @Column
    @OneToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id")
    private Producto producto;


}

