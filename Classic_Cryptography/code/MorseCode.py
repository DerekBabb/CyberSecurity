#Morse Code Translator
#In Morse Code, every letter has a specific set of dots and dashes
#We need to create a legend that connects each letter with the code.

morseCode = [".-", "-...", "-.-.", "-..", "."]

def encode(message):
    alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    message = message.upper()
    code = ""

    for letter in message:
        if (alpha.find(letter) >= 0): #check to see if the letter is actually a letter
            spot = alpha.find(letter)
            code = code + morseCode[spot] + " "
        elif letter == " ":
             code = code + "/ "
             
    return code


def main():
    message = input("Enter a message: ")
    
    code = encode(message)
    print ("Morse Code:", code)
    
#The program works fine as long as you don't use a letter past E in the
#Alphabet.  Can you make it work for all letters?  What about numbers?

#Further challenge, can you create a method to decode the messages?

