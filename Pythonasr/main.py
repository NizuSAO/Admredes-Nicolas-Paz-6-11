import requests

if __name__ == '__main__':
    cabeceras = {'cache-control': 'no-cache', 'accept': 'text/html'}
    x = requests.get('https://api.nasa.gov/planetary/apod?api_key=wg7aYLGtx2cMt16hRSjoUfze2UvOuc7s0ueXIZ65', headers = cabeceras)
    x.headers

    if x.status_code == 200:
        content = x.content
        file = open('nasaheader.txt', 'wb')
        file.write(content)
        file.close()