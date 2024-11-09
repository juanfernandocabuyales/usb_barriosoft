package co.edu.barriosoft.barriosoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrecioDTO {
    private Integer id;
    private float precio;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer creadoPor;
    private Date fechaCreacion;
    private boolean estado;
    private Integer productoId;
}
