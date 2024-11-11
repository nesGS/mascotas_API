# **Néstor González**

# API de Gestión de Mascotas 🐾

Este proyecto es una API RESTful construida con Spring Boot que permite gestionar un registro de mascotas. La API proporciona múltiples endpoints para realizar operaciones CRUD y algunas funcionalidades adicionales, como búsqueda por nombre y paginación. Esta API devuelve datos en formato JSON y permite la integración con aplicaciones frontend.

## Características

- **Listado de Mascotas**: Obtiene una lista de todas las mascotas registradas.
- **Buscar por ID**: Recupera la información de una mascota en función de su ID.
- **Crear Mascota**: Permite registrar una nueva mascota en el sistema.
- **Listar por Juventud**: Obtiene una lista de las 20 mascotas más jóvenes.
- **Buscar por Nombre**: Encuentra mascotas por nombre.
- **Eliminar Mascota**: Elimina una mascota del sistema usando su ID.
- **Paginación**: Muestra las mascotas en páginas de 5 o el tamaño personalizado que se especifique.

## Endpoints de la API

| Método HTTP | Endpoint                    | Descripción                                                                                  |
|-------------|-----------------------------|----------------------------------------------------------------------------------------------|
| `GET`       | `/api/mascota`              | Listado de todas las mascotas.                                                              |
| `GET`       | `/api/mascota/{id}`         | Muestra la información de una mascota por su ID.                                            |
| `POST`      | `/api/mascota`              | Crea y guarda una nueva mascota.                                                            |
| `GET`       | `/api/mascota/byyouth`      | Lista las 20 mascotas más jóvenes.                                                          |
| `GET`       | `/api/mascota/nombre/{name}`| Muestra la lista de mascotas cuyo nombre coincide con el buscado.                           |
| `DELETE`    | `/api/mascota/{id}`         | Elimina una mascota a partir de su ID.                                                      |
| `GET`       | `/api/mascota/paginadas/{pag}` | Lista las mascotas en páginas, por defecto 5 por página (puede ajustarse con `qtty`).     |


## Documentación
-  La documentación de la API se hace a través de OpenApi en lugar de Swagger, ya que Swagger deja de ser compatible con la versión de Spring Boot 3.0 en adelante.




## Instalación y Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/nesGS/mascotas_API.git
   cd mascotas-api




