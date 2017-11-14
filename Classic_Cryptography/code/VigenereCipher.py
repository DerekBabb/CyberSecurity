#VigenereCipher.py
import CaesarCipher

alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def findKey(keyword, letterCount):
    keyword.upper()
    spot = letterCount % len(keyword)
    key = alpha.find(keyword[spot])

    return key

#use the encode/decode methods from your Caesar Cipher.
#The key will change for each letter so you'll be encoding
#a one-letter phrase using the Caesar Cipher and adding the results together.




def main():

    message = input("Enter message: ")
    keyword = input("Enter keyword: ")

    secret = ""
    letterCount = 0

    message = message.upper()
    for letter in message:

        key = findKey(keyword, letterCount)

        if (alpha.find(letter) >= 0): #check to see if the letter is actually a letter
            spot = (alpha.find(letter) + key) % 26
            letterCount = letterCount + 1
            secret = secret + alpha[spot]
        else: # letter must have been a number, symbol, or punctuation.
            secret = secret + letter


    print ("Encoded message:", secret)
