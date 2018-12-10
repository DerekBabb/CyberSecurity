#Rotor II
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
rotor = "AJDKSIRUXBLHWTMCQGZNPYFVOE"
notch = "E"

def setStart(letter):
    while(rotor[0] != letter):
        rotate()

def translate(letter):
    spot = alphabet.find(letter)
    return rotor[spot]

def reverse(letter):
    spot = rotor.find(letter)
    return alphabet[spot]

def rotate():
    global rotor
    turnOver = False
    if rotor[0] == notch:
        turnOver = True
    rotor = rotor[1:] + rotor[0]
    
    return turnOver
