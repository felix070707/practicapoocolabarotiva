# Taller de Programación Orientada a Objetos (POO)

## Información general

- **Modalidad:** Grupal
- **Integrantes por grupo:** 3
- **Dificultad:** Media
- **Lenguaje:** Java
- **Metodología:** Desarrollo incremental aplicando Programación Orientada a Objetos.

---

# Objetivo

Diseñar e implementar una aplicación de consola utilizando los principios de Programación Orientada a Objetos (POO). El proyecto debe permitir la administración de un contexto específico mediante un sistema organizado por módulos, aplicando clases, objetos, encapsulamiento, herencia, polimorfismo, composición y colecciones.

---

# Requisitos generales

Todos los proyectos deberán cumplir como mínimo con los siguientes requisitos:

- Aplicar Programación Orientada a Objetos.
- Implementar un menú principal y submenús.
- Implementar operaciones CRUD (Crear, Consultar, Actualizar y Eliminar).
- Utilizar colecciones para almacenar la información.
- Validar los datos ingresados por el usuario.
- Separar la lógica del programa en clases.
- Utilizar herencia en al menos una jerarquía de clases.
- Implementar polimorfismo en una funcionalidad del sistema.
- Generar reportes básicos.

---

# Proyecto 1. Sistema de Gestión de Hotel

## Objetivo

Desarrollar un sistema para administrar habitaciones, huéspedes y reservas de un hotel.

## Clases sugeridas

- Hotel
- Habitación
- Huésped
- Reserva
- Factura

## Funcionalidades

### Gestión de habitaciones

- Registrar habitación
- Consultar habitaciones
- Actualizar información
- Eliminar habitación
- Consultar habitaciones disponibles
- Consultar habitaciones ocupadas

### Gestión de huéspedes

- Registrar huésped
- Consultar huésped
- Actualizar datos
- Eliminar huésped

### Gestión de reservas

- Crear reserva
- Cancelar reserva
- Consultar reservas

### Facturación

- Realizar Check-in
- Realizar Check-out
- Generar factura

## Menú principal

```text
============= HOTEL =============

1. Gestión de Habitaciones
2. Gestión de Huéspedes
3. Gestión de Reservas
4. Check-in
5. Check-out
6. Facturación
7. Reportes
0. Salir
```

---

# Proyecto 2. Sistema de Clínica Médica

## Clases sugeridas

- Clínica
- Médico
- Paciente
- Cita
- Historia Clínica

## Funcionalidades

### Gestión de pacientes

- Registrar paciente
- Actualizar paciente
- Eliminar paciente
- Consultar pacientes

### Gestión de médicos

- Registrar médico
- Consultar médicos
- Actualizar médico
- Eliminar médico

### Gestión de citas

- Agendar cita
- Cancelar cita
- Consultar citas

### Historia clínica

- Registrar diagnóstico
- Registrar tratamiento
- Consultar historial

## Menú principal

```text
=========== CLÍNICA ===========

1. Gestión de Pacientes
2. Gestión de Médicos
3. Gestión de Citas
4. Historia Clínica
5. Reportes
0. Salir
```

---

# Proyecto 3. Sistema de Tienda Virtual

## Clases sugeridas

- Producto
- Cliente
- Carrito
- Pedido
- Factura

## Funcionalidades

### Gestión de productos

- Registrar producto
- Actualizar producto
- Eliminar producto
- Consultar inventario

### Gestión de clientes

- Registrar cliente
- Actualizar cliente
- Eliminar cliente

### Gestión de compras

- Agregar productos al carrito
- Eliminar productos del carrito
- Confirmar compra
- Generar factura

## Menú principal

```text
========= TIENDA VIRTUAL =========

1. Gestión de Productos
2. Gestión de Clientes
3. Carrito de Compras
4. Pedidos
5. Facturación
6. Reportes
0. Salir
```

---

# Proyecto 4. Sistema de Restaurante

## Clases sugeridas

- Restaurante
- Mesa
- Plato
- Pedido
- Factura

## Funcionalidades

### Gestión del menú

- Registrar plato
- Actualizar plato
- Eliminar plato
- Consultar menú

### Gestión de mesas

- Registrar mesa
- Consultar disponibilidad
- Actualizar estado

### Gestión de pedidos

- Crear pedido
- Agregar platos
- Finalizar pedido
- Generar factura

## Menú principal

```text
========== RESTAURANTE ==========

1. Gestión de Mesas
2. Gestión del Menú
3. Gestión de Pedidos
4. Facturación
5. Reportes
0. Salir
```

---

# Proyecto 5. Sistema de Gimnasio

## Clases sugeridas

- Gimnasio
- Socio
- Entrenador
- Rutina
- Pago

## Funcionalidades

### Gestión de socios

- Registrar socio
- Actualizar datos
- Eliminar socio
- Consultar socios

### Gestión de entrenadores

- Registrar entrenador
- Asignar entrenador
- Consultar entrenadores

### Gestión de rutinas

- Crear rutina
- Modificar rutina
- Asignar rutina

### Gestión de pagos

- Registrar pago
- Consultar pagos
- Reporte de morosos

## Menú principal

```text
=========== GIMNASIO ===========

1. Gestión de Socios
2. Gestión de Entrenadores
3. Gestión de Rutinas
4. Gestión de Pagos
5. Reportes
0. Salir
```

---

# Proyecto 6. Sistema de Alquiler de Vehículos

## Clases sugeridas

- Vehículo
- Cliente
- Alquiler
- Pago

## Funcionalidades

- Registrar vehículos
- Registrar clientes
- Alquilar vehículo
- Registrar devolución
- Generar factura
- Consultar vehículos disponibles

## Menú principal

```text
====== ALQUILER DE VEHÍCULOS ======

1. Gestión de Vehículos
2. Gestión de Clientes
3. Gestión de Alquileres
4. Devoluciones
5. Facturación
6. Reportes
0. Salir
```

---

# Proyecto 7. Sistema de Gestión Escolar

## Clases sugeridas

- Estudiante
- Docente
- Curso
- Matrícula
- Calificación

## Funcionalidades

- Registrar estudiantes
- Registrar docentes
- Crear cursos
- Matricular estudiantes
- Registrar notas
- Consultar boletines

## Menú principal

```text
======== GESTIÓN ESCOLAR ========

1. Gestión de Estudiantes
2. Gestión de Docentes
3. Gestión de Cursos
4. Matrículas
5. Calificaciones
6. Reportes
0. Salir
```

---

# Proyecto 8. Sistema de Cine

## Clases sugeridas

- Película
- Sala
- Función
- Entrada
- Cliente

## Funcionalidades

- Registrar películas
- Programar funciones
- Administrar salas
- Venta de entradas
- Consultar disponibilidad de asientos

## Menú principal

```text
============= CINE =============

1. Gestión de Películas
2. Gestión de Salas
3. Programación
4. Venta de Entradas
5. Reportes
0. Salir
```

---

# Proyecto 9. Sistema de Agencia de Viajes

## Clases sugeridas

- Cliente
- Destino
- Paquete
- Reserva
- Pago

## Funcionalidades

- Registrar destinos
- Crear paquetes turísticos
- Registrar clientes
- Reservar viajes
- Registrar pagos
- Consultar reservas

## Menú principal

```text
======== AGENCIA DE VIAJES ========

1. Gestión de Destinos
2. Gestión de Paquetes
3. Gestión de Clientes
4. Reservas
5. Pagos
6. Reportes
0. Salir
```

---

# Proyecto 10. Sistema de Veterinaria

## Clases sugeridas

- Mascota
- Propietario
- Veterinario
- Cita
- Historia Clínica

## Funcionalidades

### Gestión de mascotas

- Registrar mascota
- Actualizar información
- Eliminar mascota
- Consultar mascotas

### Gestión de propietarios

- Registrar propietario
- Actualizar datos
- Consultar propietarios

### Gestión médica

- Programar citas
- Registrar vacunas
- Registrar tratamientos
- Consultar historial clínico

## Menú principal

```text
========== VETERINARIA ==========

1. Gestión de Mascotas
2. Gestión de Propietarios
3. Gestión de Veterinarios
4. Gestión de Citas
5. Historia Clínica
6. Reportes
0. Salir
```

---

# Entregables

Cada grupo deberá entregar:

1. Código fuente organizado.
2. Diagrama de clases (UML).
3. Manual de usuario.
4. Video de demostración (5 a 10 minutos).
5. Presentación del proyecto.

---

# Criterios de evaluación

| Criterio | Porcentaje |
|----------|-----------:|
| Aplicación de Programación Orientada a Objetos | 30% |
| Funcionamiento del sistema | 30% |
| Implementación del menú y operaciones CRUD | 20% |
| Organización y documentación del código | 10% |
| Sustentación del proyecto | 10% |