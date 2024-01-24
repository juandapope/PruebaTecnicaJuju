#language: es
Característica: Inicio de sesion JUJU

  @Exitoso
  Escenario: Inicio de sesion exitoso
    Dado el usuario ingreso a la plataforma
    Cuando el usuario ingresa sus credenciales
    Y el usuario hace clic en el boton ingresar
    Y el usuario visualiza el mensaje de bienvenida
    Entonces el usuario cierra sesion

    @Fallido
    Escenario: Inicio de sesion fallido
      Dado el usuario ingreso a la plataforma juju
      Cuando el usuario ingresa sus credenciales de manera incorrecta
      Y hace clic en el boton ingresar
      Entonces el usuario visualiza el mensaje de credenciales incorrectas
