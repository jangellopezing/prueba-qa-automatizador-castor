# language: es
Característica: Búsqueda de contenido en Spotify

  @search
  Escenario: Búsqueda de canciones/artistas
    Dado que Jose está en la página principal de Spotify Web
    Cuando busca el término "Coldplay"
    Entonces debería visualizar resultados relacionados con "Coldplay"