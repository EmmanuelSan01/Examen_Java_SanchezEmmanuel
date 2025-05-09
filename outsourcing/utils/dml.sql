USE outsourcing;

INSERT INTO cliente (nombre, representante, sector) VALUES
	("TecnoGlobal", "Laura Martínez", "Tecnología"),
	("Clínica Vida", "Carlos Ruiz", "Salud")
;

INSERT INTO servicio (nombre, categoria, precioxhora) VALUES
	("Desarrollo de Software", "TI", 120000),
	("Limpieza Industrial", "Limpieza", 30000)
;

INSERT INTO proyecto (id_cliente, nombre, fechainicio, fechafin, estado) VALUES
	(1, "Proyecto Uno", "2025-05-08", "2025-06-12", "En_curso"),
	(2, "Proyecto Dos", "2025-05-12", "2025-06-16", "En_curso")
;

INSERT INTO empleado (id_proyecto, nombre, cargo, salario, especialidad) VALUES
	(1, "Juan Pérez", "Analista de Sistemas", 2500000, "TI"),
	(2, "Marta Gómez", "Supervisora", 1500000, "Limpieza")
;
