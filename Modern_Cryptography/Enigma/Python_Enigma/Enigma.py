#Enigma Machine

import Rotor1 as LEFT
import Rotor2 as MIDDLE
import Rotor3 as RIGHT
import ReflectorA as RF

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
def setStart(l1, l2, l3):
    LEFT.setStart(l1)
    MIDDLE.setStart(l2)
    RIGHT.setStart(l3)


def encode(message):
    secret = ""
    message = message.upper()

    for letter in message:
        if alphabet.find(letter) >= 0:
            letter = RIGHT.translate(letter)
            letter = MIDDLE.translate(letter)
            letter = LEFT.translate(letter)
            letter = RF.reflect(letter)
            letter = LEFT.reverse(letter)
            letter = MIDDLE.reverse(letter)
            letter = RIGHT.reverse(letter)
            turnOver = RIGHT.rotate()
            if turnOver == True:
                turnOver = MIDDLE.rotate()
            if turnOver == True:
                LEFT.rotate()

        secret = secret + letter

    return secret


def main():
    setStart("A", "B", "C")
    msg = input("Enter a message: ")

    code = encode(msg)
    print (code)

main()
