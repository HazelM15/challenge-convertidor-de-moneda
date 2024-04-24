<em> Allura Challenge | Back-end | Formación Java Orientada a Objetos </em>
<h1 align="center"> Convertidor de moneda </h1>

Este es el código de un programa en Java que permite convertir el monto en diferentes monedas utilizando un API de tipo de cambio.

Las monedas utilizadas en este conversor son:

* USD = Dólares Estadounidenses
* COP = Pesos Colombianos
* ARS = Pesos Argentinos
* BRL = Reales Brasileños
* CRC = Colones Costarricenses

<em> API utilizada </em>
* Este proyecto utiliza la API de tipo de cambio ExhangeRate-API para obtener los tipos de cambio actualizados.
  Para más información sobre cómo usar esta API : https://www.exchangerate-api.com/docs/overview

<em> Funcionalidades </em>
* Conversión entre diferentes monedas.
* Utiliza una API externa para obtener los tipos de cambio actualizados.
* Interfaz de línea de comandos (CLI) simple y fácil de usar.

A continuación, un breve resumen de la codificacion realizada.

1. Se realizó una clase 'ConsultaMoneda' en donde se declararon tres variables:
   - divisaEmisor, como tipo String : recibe la moneda que se tiene.
   - divisaReceptor, como tipo String : es la moneda por la cual se quiere realizar la conversion.
   - cantidadDinero, como tipo double : recibe la cantidad de dinero que se quiere convertir.

[Imagen de la clase 'ConsultaMoneda' y las variables creadas]![image](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/e85f1245-31e1-42da-be6a-d8dd3c4c9e38)

Además, se crea el HTTPClient, el HTTPRequest y el HTTPResponse, y se crea la llamada a la API anteriormente mencionada.

[Imagen de la creacion de HTTPs y la llamada a la API]![Screenshot 2024-04-23 221624](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/0b94d6dc-e04a-477b-9af5-1fff58dd23ea)

2. Se crea un record llamado 'Moneda' que recibe los datos que genera la API. En este caso, solo se utilizaron 5 datos:
- result, como tipo String : genera una "mensaje" de que la conversion fue exitosa, o en caso contrario, de que falló.
- base_code, como tipo String : es la que posee la moneda principal.
- target_code, como tipo String : es la que posee la moneda por la que se quiere realizar la conversion.
- conversion_rate, como tipo double : posee el tipo de cambio de la moneda principal.
- conversion_result, como tipo double : es el resultado de la conversion entre la 'base_code' y la 'target_code'.

[Imagen de la creacion del record y la declaracion de variables]![Screenshot 2024-04-23 222727](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/f2bd877a-b18c-4b84-8e0d-551410fbf6b5)

También, se sobreescribe el toString, para una mejor visualizacion de los datos.

[Imagen de la sobreescritura del toString]![Screenshot 2024-04-23 223051](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/e8dae589-5a00-4e79-be1c-eaa2317412f1)

3. Se crea la clase principal llamada 'Main', en la que se crea el menú para la interaccion con el usuario. El menú está dentro de un ciclo, y este se rompe, hasta que el usuario decida salir. A su vez,
   el ciclo está dentro de un try, que genera una alerta en caso de que se ingrese un tipo de dato erroneo.

[Imagen del menu, el 'try' y el ciclo 'while']![Screenshot 2024-04-23 223909](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/ecf406f6-4e0e-4140-b014-f1da75d72c81)

Un ejemplo del resultado del codigo realizado:

[Ejemplo de la interfaz en línea de comandos]![Screenshot 2024-04-23 224404](https://github.com/HazelM15/challenge-convertidor-de-moneda/assets/157935672/79f973e4-218c-48ad-84e9-96459c51d21f)

