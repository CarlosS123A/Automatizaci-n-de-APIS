# Automatización de Pruebas del API de PetStore

Este proyecto tiene como objetivo la automatización de pruebas unitarias para el API de la tienda de mascotas (PetStore) utilizando Java, Cucumber y RestAssured. La funcionalidad principal es la creación y consulta de pedidos en el API, asegurando que los componentes funcionen correctamente y validando las respuestas del servidor.

## Estructura del Proyecto

- **src/**: Contiene el código fuente y los pasos de prueba.
- **libs/**: Contiene las librerías necesarias para el proyecto.
- **pom.xml**: Archivo de configuración de Maven que gestiona las dependencias del proyecto.
- **README.md**: Documentación del proyecto.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para implementar las pruebas.
- **Cucumber**: Framework utilizado para definir las pruebas en formato Gherkin.
- **RestAssured**: Biblioteca utilizada para realizar solicitudes HTTP y validar respuestas.
- **JUnit**: Framework de pruebas utilizado para ejecutar los tests.

## Funcionalidades

### 1. Creación de un Pedido

- Se realiza una solicitud `POST` al endpoint `/store/order` para crear un pedido.
- Se valida que la respuesta tenga un código de estado `200`.
- Se verifica que el cuerpo de la respuesta contenga un ID de pedido.

### 2. Consulta de un Pedido

- Se realiza una solicitud `GET` al endpoint `/store/order/{orderId}` para recuperar el pedido creado.
- Se valida que la respuesta contenga la información correcta del pedido.

## Cómo Ejecutar las Pruebas

1. **Configuración del Entorno**
   - Asegúrate de tener Java y Maven instalados en tu máquina.
   - Establece la variable de entorno `JAVA_HOME` para que apunte a tu instalación de Java.

2. **Ejecución de las Pruebas**
   - Abre una terminal o PowerShell.
   - Navega a la carpeta del proyecto donde se encuentra el archivo `pom.xml`.
   - Ejecuta el siguiente comando para correr las pruebas:
     ```bash
     mvn test
     ```

## Subida del Proyecto a GitHub

- El proyecto se subió a GitHub utilizando la interfaz web, creando un nuevo repositorio y subiendo los archivos del proyecto.
- URL del repositorio: [https://github.com/CarlosS123A/QALabNTTDATA092024](https://github.com/CarlosS123A/QALabNTTDATA092024)

## Conclusión

Este proyecto ha sido una oportunidad para aplicar técnicas de automatización de pruebas y validar el comportamiento de un API REST. Las pruebas aseguran que el sistema funcione como se espera y ayuda a mantener la calidad del software a lo largo del ciclo de vida del desarrollo.
