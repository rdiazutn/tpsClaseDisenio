INSERT INTO dds_tp.biblioteca
(domicilio,
nombre,
provincia)
VALUES
(
'Av. Medrano 951',
'Biblioteca UTN Medrano',
'CABA');

INSERT INTO dds_tp.biblioteca
(domicilio,
nombre,
provincia)
VALUES
('Mozart 2300',
'Biblioteca UTN Lugano',
'CABA');

INSERT INTO dds_tp.categoria
(nombre)
VALUES
('Suspenso');


INSERT INTO dds_tp.editorial
(nombre)
VALUES
('Alfaguara');

INSERT INTO dds_tp.pais
(nombre)
VALUES
(nombre: 'Argentina');

INSERT INTO dds_tp.autor
(fecha_nacimiento,
nombre_apellido,
nacionalidad_id)
VALUES
('19470921',
'Stephen King',
1);


INSERT INTO dds_tp.lector
(domicilio,
nombre_apellido,
telefono)
VALUES
('Corrientes 3000',
'Pepe Sanchez',
'43225223');

INSERT INTO dds_tp.lector
(domicilio,
nombre_apellido,
telefono)
VALUES
('Pasco 532',
'Marcos Peretti',
'48526633');

INSERT INTO dds_tp.multa
(fecha_finalizacion,
fecha_alta,
observacion,
lector_id)
VALUES
('20200413',
'20200302',
'Paga deuda pendiente',
1);

INSERT INTO dds_tp.multa
(fecha_finalizacion,
fecha_alta,
observacion,
lector_id)
VALUES
(null,
'2020604',
'Todavia no devolvió el libro',
1);

INSERT INTO dds_tp.libro
(anio,
titulo,
autor_id,
categoria_id,
editorial_id)
VALUES
(1986,
'It',
1,
1,
1);

INSERT INTO dds_tp.libro
(anio,
titulo,
autor_id,
categoria_id,
editorial_id)
VALUES
(1977,
'El Resplandor',
1,
1,
1);

INSERT INTO `dds_tp`.`copia_libro`
(`numero_copia`,
`biblioteca_id`,
`estado_id`,
`libro_id`)
VALUES
(1,
1,
1,
1);

INSERT INTO `dds_tp`.`copia_libro`
(`numero_copia`,
`biblioteca_id`,
`estado_id`,
`libro_id`)
VALUES
(2,
1,
1,
1);

INSERT INTO `dds_tp`.`copia_libro`
(`numero_copia`,
`biblioteca_id`,
`estado_id`,
`libro_id`)
VALUES
(3,
1,
1,
1);

