package co.edu.barriosoft.barriosoft.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePrecioRequest {
    private float precio;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer creadoPor;
    private Integer productoId;
}
