#Enigma Machine

import Rotor1 as R1
import Rotor2 as R2
import Rotor3 as R3
import ReflectorA as RF

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def encode(message):
    secret = ""
    message = message.upper()
    
    for letter in message:
        if alphabet.find(letter) >= 0:
            letter = R1.translate(letter)
            letter = R2.translate(letter)
            letter = R3.translate(letter)
            letter = RF.reflect(letter)
            letter = R3.reverse(letter)
            letter = R2.reverse(letter)
            letter = R1.reverse(letter)
            R1.rotate()
      
        secret = secret + letter
            
    return secret


def main():
    msg = input("Enter a message: ")

    code = encode(msg)
    print (code)
    
