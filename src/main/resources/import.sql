
INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (7, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Luis1', 'Matehuala1', 'lg.mj@gmail.com1', '2020-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Luis3', 'Matehuala3', 'lg.mj@gmail.com3', '2020-02-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Luis2', 'Matehuala2', 'lg.mj@gmail.com2', '2020-02-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Luis4', 'Matehuala4', 'lg.mj@gmail.com4', '2020-02-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Luis5', 'Matehuala5', 'lg.mj@gmail.com5', '2020-02-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Luis6', 'Matehuala6', 'lg.mj@gmail.com6', '2020-02-06');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Luis7', 'Matehuala7', 'lg.mj@gmail.com7', '2020-02-07');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Luis8', 'Matehuala8', 'lg.mj@gmail.com8', '2020-02-08');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Luis9', 'Matehuala9', 'lg.mj@gmail.com9', '2020-02-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Luis0', 'Matehuala0', 'lg.mj@gmail.com0', '2020-02-10');

/* Creacion de usuarios con sus roles */

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('luis', '$2a$10$fIwZ3T7BGScC66F4CW6J9.ujo7lFHeDXppaZs9T5ejSHKgZaIrVTK', 1, 'Luis1', 'Matehuala1', 'lg.mj@gmail.com1');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$aApFrvETQ1XTwhu.5JQWrugZUBoT.LYzoBkGVHalAnkIC8jWJ4WVy', 1, 'Luis2', 'Matehuala2', 'lg.mj@gmail.com2');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
