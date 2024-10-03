# Conversor de Monedas

## Descripción
Este proyecto es un conversor de monedas desarrollado en Java. Permite convertir entre varias monedas utilizando la API de **ExchangeRate-API** para obtener las tasas de cambio en tiempo real. El proyecto incluye un menú interactivo donde el usuario puede seleccionar el tipo de conversión y la cantidad de dinero a convertir.

## Funcionalidades
- Conversión entre las siguientes monedas:
  - Dólar estadounidense (USD) a Peso mexicano (MXN)
  - Peso mexicano (MXN) a Dólar estadounidense (USD)
  - Dólar estadounidense (USD) a Real brasileño (BRL)
  - Real brasileño (BRL) a Dólar estadounidense (USD)
  - Dólar estadounidense (USD) a Peso colombiano (COP)
  - Peso colombiano (COP) a Dólar estadounidense (USD)
- Uso de la **ExchangeRate-API** para obtener tasas de cambio actualizadas.
- Manejo de errores de conexión y respuestas inválidas.
- Menú interactivo que permite al usuario elegir la conversión deseada y escribir la cantidad a convertir.

## Requisitos
- **Java 8** o superior
- **Gson 2.11.0**
- **HttpURLConnection** (librería estándar de Java)

## Configuración del Proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/conversor-monedas.git
