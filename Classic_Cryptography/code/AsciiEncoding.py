#Text to binary converter
#The ASCII and UNICODE charts give every character a numerical value.
#We want to convert text to this number.

def encode(message):
    #Python has a built-in function to see the "ordinal value" of a letter
    print (ord('a'))

    #we can also look at a string of letters, one letter at a time with a for loop
    for letter in message:
        print (letter)

    #we can also create a list of numbers
    nums = []
    for n in range(10):
        nums.append(n) #we are adding the new number to the list of nums

    return nums #share the value we've computed with the function that called this function



def main():
    message = input("Enter a message: ")
    
    asciiMessage = encode(message)
    print ("Ascii Message:", asciiMessage)
    
#All of the pieces are here but the program doesn't quite do what we want
#Modify the code to get the ASCII values for your message


#Extention: can you display the binary values of the ASCII numbers?
#Python also has a built-in binary converter bin(num)
#bin(123)
#This would convert the base-10 number to a binary string with the prefix '0b'


