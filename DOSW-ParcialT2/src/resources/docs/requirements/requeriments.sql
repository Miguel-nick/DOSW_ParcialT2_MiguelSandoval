
CREATE TABLE rol (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE
);


CREATE TABLE permiso (
    id SERIAL PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL
);


CREATE TABLE rol_permiso (
    rol_id INT,
    permiso_id INT,
    PRIMARY KEY (rol_id, permiso_id),
    FOREIGN KEY (rol_id) REFERENCES rol(id),
    FOREIGN KEY (permiso_id) REFERENCES permiso(id)
);


CREATE TABLE colaborador (
    id SERIAL PRIMARY KEY,
    correo VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(20),
    fecha_nacimiento DATE,
    rol_id INT,
    FOREIGN KEY (rol_id) REFERENCES rol(id)
);

CREATE TABLE computador (
    id SERIAL PRIMARY KEY,
    serial VARCHAR(100) NOT NULL,
    marca VARCHAR(50),
    numero_laboratorio INT,
    ocupado BOOLEAN DEFAULT FALSE,
    colaborador_id INT,
    FOREIGN KEY (colaborador_id) REFERENCES colaborador(id)
);

INSERT INTO rol (nombre) VALUES
('Administrador'),
('Lider'),
('Asistente');

-- Administrador (id=1)
INSERT INTO rol_permiso (rol_id, permiso_id) VALUES
(1,1),
(1,2);

-- Lider (id=2)
INSERT INTO rol_permiso (rol_id, permiso_id) VALUES
(2,3),
(2,2);

-- Asistente (id=3)
INSERT INTO rol_permiso (rol_id, permiso_id) VALUES
(3,4);

INSERT INTO permiso (descripcion) VALUES
('CRUD colaboradores'),
('CRUD computadores'),
('Consultar colaboradores'),
('Consultar computadores');