#language: es
@Author:santiago_giraldo

Característica: Registrar usuarios

  Yo como tester
  Quiero registrarme en la pagina web
  Para unirme a la comunidad freelance

  Esquema del escenario: registrar usuario
    Dado que "Santiago" se encuentra en la pagina web
    Cuando realiza el proceso de registro
      | nombre   | apellidos   | email   | mesNacimiento   | diaNacimiento   | anoNacimiento   | ciudad   | codigoPostal   | pais   | dispositivo   | modeloDispositivo   | osDispositivo   | contrasena   |
      | <nombre> | <apellidos> | <email> | <mesNacimiento> | <diaNacimiento> | <anoNacimiento> | <ciudad> | <codigoPostal> | <pais> | <dispositivo> | <modeloDispositivo> | <osDispositivo> | <contrasena> |
    Entonces visualiza el home page de utest

    Ejemplos:
      | nombre   | apellidos | email          | mesNacimiento | diaNacimiento | anoNacimiento | ciudad   | codigoPostal | pais     | dispositivo | modeloDispositivo | osDispositivo | contrasena       |
      | Santiago | giraldo   | pruebas@bc.com | January       | 26            | 1996          | Medellín | 05007        | Colombia | Apple       | iPhone 5C         | iOS 10.2      | pruebasBanco2020 |