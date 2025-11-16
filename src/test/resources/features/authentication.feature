# language: es
Característica: Autenticación de usuarios en Spotify

  @authentication
  Escenario: Intento de login con credenciales inválidas
    Dado que Jose está en la página de login
    Cuando intenta iniciar sesión con credenciales inválidas
      | email                  | password |
      | yipasoc225@fermiro.com | 12345    |
    Entonces debería ver un mensaje de error de autenticación