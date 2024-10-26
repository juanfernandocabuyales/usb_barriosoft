CREATE TABLE public.unidades (
	unidad_id numeric NOT NULL,
	nombre_unidad varchar(100) NOT NULL,
	abreviatura_unidad varchar(20) NOT NULL,
	descripcion_unidad varchar(200) NOT NULL,
	estado_unidad numeric NOT NULL,
	CONSTRAINT unidades_pk PRIMARY KEY (unidad_id)
);

CREATE TABLE public.proveedor (
	proveedor_id numeric NOT NULL,
	proveedor_nombre varchar(100) NOT NULL,
	proveedor_contacto varchar(100) NOT NULL,
	proveedor_direccion varchar(100) NOT NULL,
	proveedor_estado numeric NOT NULL,
	CONSTRAINT proveedor_pk PRIMARY KEY (proveedor_id)
);

CREATE TABLE public.tiendas (
	tienda_id numeric NOT NULL,
	tienda_nombre varchar(100) NOT NULL,
	tienda_direccion varchar(100) NOT NULL,
	tienda_telefono varchar(20) NOT NULL,
	tienda_estado numeric NOT NULL,
	CONSTRAINT tiendas_pk PRIMARY KEY (tienda_id)
);

CREATE TABLE public.productos (
	producto_id numeric NOT NULL,
	producto_nombre varchar(100) NOT NULL,
	producto_descripcion varchar(200) NOT NULL,
	producto_precio_unitario numeric NOT NULL,
	producto_proveedor_id numeric NOT NULL,
	producto_unidad_id numeric NOT NULL,
	producto_estado numeric NOT NULL,
	CONSTRAINT productos_pk PRIMARY KEY (producto_id),
	CONSTRAINT productos_fk FOREIGN KEY (producto_proveedor_id) REFERENCES public.proveedor(proveedor_id),
	CONSTRAINT productos_fk_1 FOREIGN KEY (producto_unidad_id) REFERENCES public.unidades(unidad_id)
);

CREATE TABLE public.inventarios (
	inventario_id numeric NOT NULL,
	inventario_producto_id numeric NOT NULL,
	inventario_cantidad_disponible numeric NOT NULL,
	inventario_unidad_id numeric NOT NULL,
	inventario_tienda_id numeric NOT NULL,
	CONSTRAINT inventarios_pk PRIMARY KEY (inventario_id),
	CONSTRAINT inventarios_fk FOREIGN KEY (inventario_unidad_id) REFERENCES public.unidades(unidad_id),
	CONSTRAINT inventarios_fk_1 FOREIGN KEY (inventario_tienda_id) REFERENCES public.tiendas(tienda_id),
	CONSTRAINT inventarios_producto FOREIGN KEY (inventario_producto_id) REFERENCES public.productos(producto_id);
);

CREATE TABLE public.ventas (
	venta_id numeric NOT NULL,
	venta_producto_id numeric NOT NULL,
	venta_cantidad numeric NOT NULL,
	venta_fecha timestamp NOT NULL,
	venta_tienda_id numeric NOT NULL,
	venta_estado numeric NOT NULL,
	CONSTRAINT ventas_pk PRIMARY KEY (venta_id),
	CONSTRAINT ventas_fk FOREIGN KEY (venta_producto_id) REFERENCES public.productos(producto_id),
	CONSTRAINT ventas_fk_1 FOREIGN KEY (venta_tienda_id) REFERENCES public.tiendas(tienda_id)
);



