INSERT INTO dds_tp.biblioteca (domicilio, nombre, provincia) VALUES ( 'Av. Medrano 951','Biblioteca UTN Medrano','CABA');
INSERT INTO dds_tp.biblioteca (domicilio, nombre, provincia) VALUES ('Mozart 2300', 'Biblioteca UTN Lugano', 'CABA');
INSERT INTO dds_tp.categoria (nombre) VALUES ('Suspenso');
INSERT INTO dds_tp.editorial (nombre) VALUES ('Alfaguara');
INSERT INTO dds_tp.pais (nombre) VALUES ('Argentina');
INSERT INTO dds_tp.autor (fecha_nacimiento, nombre_apellido, nacionalidad_id) VALUES ('19470921', 'Stephen King', 1);
INSERT INTO dds_tp.lector (domicilio, nombre_apellido, telefono) VALUES ('Corrientes 3000', 'Pepe Sanchez', '43225223');
INSERT INTO dds_tp.lector (domicilio, nombre_apellido, telefono) VALUES ('Pasco 532', 'Marcos Peretti', '48526633');
INSERT INTO dds_tp.lector (domicilio, nombre_apellido, telefono) VALUES ('Pasco 532', 'a', '48526633');
INSERT INTO dds_tp.lector (domicilio, nombre_apellido, telefono) VALUES ('Pasco 1234', 'Pepe', '41231245');
INSERT INTO dds_tp.libro (anio, titulo, autor_id, categoria_id, editorial_id) VALUES (1986, 'It', 1, 1, 1);
INSERT INTO dds_tp.libro (anio, titulo, autor_id, categoria_id, editorial_id) VALUES (1977, 'El Resplandor', 1, 1, 1);
INSERT INTO `dds_tp`.`copia_libro` (`numero_copia`, `biblioteca_id`, `estado_enum`, `libro_id`) VALUES (1, 1, "RETRASADO", 1);
INSERT INTO `dds_tp`.`copia_libro` (`numero_copia`, `biblioteca_id`, `estado_enum`, `libro_id`) VALUES (2, 1, "DISPONIBLE", 1);
INSERT INTO `dds_tp`.`copia_libro` (`numero_copia`, `biblioteca_id`, `estado_enum`, `libro_id`) VALUES (3, 1, "DISPONIBLE", 1);
INSERT INTO `dds_tp`.`copia_libro` (`numero_copia`, `biblioteca_id`, `estado_enum`, `libro_id`) VALUES (1, 1, "DISPONIBLE", 2);
INSERT INTO `dds_tp`.`copia_libro` (`numero_copia`, `biblioteca_id`, `estado_enum`, `libro_id`) VALUES (2, 1, "DISPONIBLE", 2);
INSERT INTO `dds_tp`.`prestamo` (`fecha_devolucion`, `fecha_fin_prestamo`, `fecha_prestamo`, `observacion`, `copia_libro_id`, `lector_id`) VALUES (null, '20200501', '20200401',' Atrasado ', 1, 1);