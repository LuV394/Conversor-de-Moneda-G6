# Challenge Conversor de Monedas G6

Challenger back-end del programa G6 de Alura Latam en donde se desarrolló una aplicación Java que convierte divisas por medio de solicitudes a una API. Usando Java se crea una interfaz para el usuario para seleccionar las divisas que desea convertir de una lista preestablecida.

## Características Generales

Una de las principales características del conversor de monedas es la fluidez con la que se obtiene la información además de que la infraestructura básica que permite una comunicación fluida con la API que brinda la información.

## Funcionalidades

•  Muestra una lista de monedas disponibles para el cambio.

•  Menú ligero que se muestra en pantalla.

•  Convierte las monedas según el tipo de cambio actual.

•  Permite la comunicación interactiva con el API de divisas.


## Requisitos

•  Entorno de desarrollo IDE, en este caso IntelliJ.

•  Acceso a internet para actualización de datos obtenidos del API.

•  Java Development Kit (JDK) instalado con una versión estable 17 o superior.


## Estructura

•  `SRC`:

•  `Principal`: Esta clase manipula la interfaz de usuario, consultas y respuestas.

•  `Conversión`: Clase que se comunica con el API, compara la información y brinda el resultado que se utiliza para dar respuesta al usuario, esto lo utiliza `HttpRequest`, `HttpResponse`, `HttpClient` y `Gson` para la extracción de los datos.
