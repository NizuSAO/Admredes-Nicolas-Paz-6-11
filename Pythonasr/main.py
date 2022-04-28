import requests

response = requests.get('https://api.nasa.gov/planetary/apod?api_key=VhgcFFb59rmz2z3cUuPo1cYota6gLBtTsBcstKMt')

body = response.json()
print(body)
print(response.headers)

cuerpo = open("cuerpo.txt", "w")
cuerpo.write(str(body))
cuerpo.close()

encabezado = open("encabezado.txt", "w")
encabezado.write(str(response.headers))
encabezado.close()
