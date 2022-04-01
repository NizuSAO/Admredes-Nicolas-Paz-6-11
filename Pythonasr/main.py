import requests

if __name__ == '__main__':
    x = requests.get('https://api.nasa.gov/planetary/apod?api_key=bOxO1Yeu9ffCWJ6iayhXvx8E64i3otvkdKG1rwxA')

    if x.status_code == 200:
        content = x.content
        file = open('nasa.html', 'wb')
        file.write(content)
        file.close()