package co.edu.barriosoft.barriosoft.service;

import co.edu.barriosoft.barriosoft.dto.PrecioDTO;
import co.edu.barriosoft.barriosoft.dto.request.CreatePrecioRequest;

public interface PrecioService {
    public PrecioDTO CrearPrecio(CreatePrecioRequest createPrecioRequest) throws Exception;
}
