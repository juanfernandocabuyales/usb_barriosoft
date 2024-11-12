CREATE TABLE cargues (
  id             SERIAL NOT NULL, 
  id_proveedor   int4, 
  creado_por     int4, 
  fecha_creacion date, 
  estado         bool, 
  PRIMARY KEY (id));
CREATE TABLE cargues_productos (
  id                      SERIAL NOT NULL, 
  id_cargue               int4 NOT NULL, 
  id_producto             int4 NOT NULL, 
  cantidad                int4, 
  cargue_inventario       bool, 
  fecha_cargue_inventario date, 
  PRIMARY KEY (id));
CREATE TABLE inventarios (
  id                  SERIAL NOT NULL, 
  id_producto         int4 NOT NULL, 
  lote                varchar(255), 
  cantidad            int4, 
  fecha_actualizacion date, 
  PRIMARY KEY (id));
CREATE TABLE precios (
  id             SERIAL NOT NULL, 
  id_producto    int4 NOT NULL, 
  precio         numeric(18, 2), 
  fecha_desde    date, 
  fecha_hasta    date, 
  creado_por     int4, 
  fecha_creacion date, 
  estado         bool, 
  PRIMARY KEY (id));
CREATE TABLE productos (
  id               SERIAL NOT NULL, 
  id_tienda        int4 NOT NULL, 
  id_proveedor     int4 NOT NULL, 
  id_precio        int4 NOT NULL, 
  codigo_externo   varchar(255), 
  codigo_interno   varchar(255), 
  descripcion      varchar(255), 
  precio_actual    numeric(18, 2), 
  estado           bool, 
  fecha_creacion   date, 
  usuario_creacion int4, 
  PRIMARY KEY (id));
CREATE TABLE proveedores (
  id             SERIAL NOT NULL, 
  nit            varchar(255), 
  razon_social   varchar(255), 
  telefono       varchar(255), 
  direccion      varchar(255), 
  fecha_creacion date, 
  estado         bool, 
  PRIMARY KEY (id));
CREATE TABLE tiendas (
  id             SERIAL NOT NULL, 
  nombre         varchar(255), 
  direccion      varchar(255), 
  telefono       varchar(255), 
  estado         bool, 
  fecha_creacion date, 
  PRIMARY KEY (id));
CREATE TABLE usuarios (
  id               SERIAL NOT NULL, 
  id_tienda        int4 NOT NULL, 
  nombre           varchar(255), 
  apellido         varchar(255), 
  usuario          varchar(255), 
  clave            varchar(255), 
  fecha_creacion   date, 
  usuario_creacion int4, 
  estado           bool, 
  PRIMARY KEY (id));
CREATE TABLE ventas (
  id                 SERIAL NOT NULL, 
  numero             varchar(255), 
  cantidad_productos int4, 
  total_sin_iva      numeric(18, 2), 
  total_con_iva      numeric(18, 2), 
  fecha_creacion     date, 
  usuario_creacion   int4, 
  estado             bool, 
  PRIMARY KEY (id));
CREATE TABLE ventas_producto (
  id             SERIAL NOT NULL, 
  id_venta       int4 NOT NULL, 
  id_producto    int4 NOT NULL, 
  id_precio      int4, 
  cantidad       int4, 
  total          numeric(18, 2), 
  fecha_creacion date, 
  estado         bool, 
  PRIMARY KEY (id));
ALTER TABLE cargues_productos ADD CONSTRAINT FKcargues_pr796814 FOREIGN KEY (id_cargue) REFERENCES cargues (id);
ALTER TABLE productos ADD CONSTRAINT FKproductos587399 FOREIGN KEY (id_proveedor) REFERENCES proveedores (id);
ALTER TABLE productos ADD CONSTRAINT FKproductos889176 FOREIGN KEY (id_tienda) REFERENCES tiendas (id);
ALTER TABLE usuarios ADD CONSTRAINT FKusuarios471663 FOREIGN KEY (id_tienda) REFERENCES tiendas (id);
ALTER TABLE ventas_producto ADD CONSTRAINT FKventas_pro45172 FOREIGN KEY (id_venta) REFERENCES ventas (id);
ALTER TABLE ventas_producto ADD CONSTRAINT FKventas_pro778617 FOREIGN KEY (id_producto) REFERENCES productos (id);
ALTER TABLE inventarios ADD CONSTRAINT FKinventario719986 FOREIGN KEY (id_producto) REFERENCES productos (id);
ALTER TABLE productos ADD CONSTRAINT FKproductos967224 FOREIGN KEY (id_precio) REFERENCES precios (id);
ALTER TABLE cargues_productos ADD CONSTRAINT FKcargues_pr845887 FOREIGN KEY (id_producto) REFERENCES productos (id);
