import requests

url = "https://rickandmortyapi.com/api/character/5"
response = requests.get(url)
file1 = open("file1.py", "w") 
file1.write(response.text)
file1.close()

print(response.text)
input()
