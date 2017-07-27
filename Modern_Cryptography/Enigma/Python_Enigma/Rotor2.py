#Rotor II
rotation = 0
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
rotor = "AJDKSIRUXBLHWTMCQGZNPYFVOE"

def translate(letter):
    spot = alphabet.find(letter)
    return rotor[spot]

def reverse(letter):
    spot = rotor.find(letter)
    return alphabet[spot]

def rotate():
    global rotor
    global rotation
    rotation += 1
    rotor = rotor[1:] + rotor[0]
    
