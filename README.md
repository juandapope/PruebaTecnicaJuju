# Prueba Técnica: Automatización de Pruebas Juju Soluciones Amigables

Este repositorio contiene pruebas automatizadas desarrolladas con Selenium WebDriver y Gherkin, evaluando las funciones clave de Juju Soluciones Amigables. 
El objetivo principal es verificar el correcto funcionamiento del sistema mediante la implementación de escenarios automatizados.

## Tecnologías Utilizadas:

- **Selenium WebDriver**: Interacción automatizada con el navegador.
- **Gherkin**: Lenguaje de especificación para escenarios de prueba.
- **Patrón de Diseño POM (Page Object Model)**: Organización para facilitar la mantenibilidad del código.
- **Lenguaje de Programación Java 11**: Implementación de pruebas.
- **Gestor de Dependencias Gradle 8.3**: Construcción y administración del proyecto.

## Ejecución del Proyecto:

### Configuración del Entorno:

1. Clona el repositorio

Asegúrate de tener Java 11 y Gradle 8.3 instalados.
Descarga las dependencias del proyecto con el siguiente comando:
gradle clean build

## Ejecutar las pruebas
gradle test

## Plataforma de Pruebas:
Enlace: https://automationcompany-qa.jujutests.com/
Credenciales:
-Usuario: usertecvac1
-Contraseña: UserTest1*

### Configuración del Entorno de Desarrollo (IntelliJ IDEA):
Abre IntelliJ IDEA y selecciona "Open" para abrir el proyecto.
Configura el JDK del proyecto a Java 11.
Ejecuta las pruebas desde la ventana de "Gradle" en IntelliJ o mediante el comando gradle test en la terminal.

### Ejecución por Tags:
Utiliza el siguiente comando para ejecutar pruebas específicas por tags:
gradle clean test --tests *test.runner.InicioSesionRunner aggregate & cd target/site/serenity & index.html
gradle clean test --tests *test.runner.CatalogoRunner aggregate & cd target/site/serenity & index.html

### Comentario de Actualización de Tags para Ejecución de Escenarios:
Es crucial destacar que antes de ejecutar un runner (ejecutor) para las pruebas, se debe realizar una actualización del etiquetado (tags) de los escenarios que se desean ejecutar. 
Los tags en los escenarios de Gherkin actúan como identificadores clave y son esenciales para la selección precisa de los escenarios a ejecutar.

### Pasos para la Actualización de Tags:
-Revisar los Escenarios Actuales:
Verifica los tags asignados a los escenarios en los archivos Gherkin. 
-Actualizar Tags Según la Ejecución Deseada:
Ajusta los tags de los escenarios que se desean ejecutar en el runner. ("@Exitoso","@Fallido","@VistaCatalogo","@VistaCarrusel")
-Ejecutar el Runner con Tags Actualizados:
-Al correr el runner, asegúrate de que los tags seleccionados coincidan con los escenarios actualizados.
