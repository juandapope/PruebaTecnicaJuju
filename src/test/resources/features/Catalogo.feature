#language: es
Característica: Visualización catalogo en Juju


  @VistaCatalogo
  Escenario: Vista de catalogo
    Dado el usuario ingresó a la plataforma
    Cuando el usuario ingresa credenciales
    Y el hace clic en el boton ingresar
    Y el usuario selecciona el módulo de catálogo
    Y el usuario hace clic en la opción ver más
    Y el usuario es redirigido a la página del catálogo
    Entonces El usuario visualiza el catálogo

  @VistaCarrusel
  Escenario: Vista de carrusel
    Dado ingresó a la plataforma
    Cuando selecciona el módulo de catálogo
    Y el usuario es redirigido a la página de incentivos
    Entonces el usuario visualiza la información de los productos destacados
