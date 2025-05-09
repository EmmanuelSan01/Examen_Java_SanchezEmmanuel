DROP DATABASE IF EXISTS outsourcing;
CREATE DATABASE outsourcing;
USE outsourcing;

CREATE TABLE cliente (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	representante VARCHAR(100) NOT NULL,
	correo VARCHAR(100),
	telefono VARCHAR(100),
	direccion VARCHAR(100),
	sector ENUM("Tecnología", "Salud", "Educación", "Comercio", "Manufactura") DEFAULT "Tecnología"
);


CREATE TABLE servicio (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	descripcion VARCHAR(250),
	precioxhora DECIMAL(10,2) NOT NULL,
	categoria ENUM ("TI", "Limpieza", "Seguridad", "Administración") DEFAULT "TI"
);

CREATE TABLE contrato (
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INT NOT NULL,
	id_servicio INT NOT NULL,
	fechainicio DATE NOT NULL,
	fechafin DATE NOT NULL,
	costototal DECIMAL(10,2) NOT NULL,
	estado ENUM ("Activo", "En_espera", "Finalizado") DEFAULT "Activo",
	FOREIGN KEY (id_cliente) REFERENCES cliente(id) ON DELETE CASCADE,
	FOREIGN KEY (id_servicio) REFERENCES servicio(id) ON DELETE CASCADE
);

CREATE TABLE proyecto (
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	fechainicio DATE NOT NULL,
	fechafin DATE NOT NULL,
	estado ENUM ("En_curso", "Completado", "Cancelado") DEFAULT "En_curso",	
	FOREIGN KEY (id_cliente) REFERENCES cliente(id) ON DELETE CASCADE
);

CREATE TABLE empleado (
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_proyecto INT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	cargo  VARCHAR(100) NOT NULL,
	salario DECIMAL(10,2) NOT NULL,
	especialidad ENUM ("TI", "Administración", "Limpieza", "Seguridad") DEFAULT "TI",	
	FOREIGN KEY (id_proyecto) REFERENCES proyecto(id) ON DELETE CASCADE
);

CREATE TABLE asignacion (
	id_empleado INT NOT NULL,
	id_proyecto INT NOT NULL,
	horastrabajadas INT NOT NULL,
	fechaasignacion DATE NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES empleado(id) ON DELETE CASCADE,
	FOREIGN KEY (id_proyecto) REFERENCES proyecto(id) ON DELETE CASCADE,
	PRIMARY KEY (id_empleado, id_proyecto)
);
