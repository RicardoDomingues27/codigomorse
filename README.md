# codigomorse

API that allows you to convert Morse code into a text message

Request Examples:

```
curl -X GET "http://localhost:5000/v1/morse2text" 
     -H  "accept: application/json
     -H  "Content-Type: application/json" 
     -d "{\"morse\":\".--..-.-----..-..---.--..---.-./.---.-...-.-\"}"
```

```
json
{
    "morseCompleto": ".--..-.-----..-..---.--..---.-./.---.-...-.-",
    "mensagemCompleta": "programador java"
}
```
