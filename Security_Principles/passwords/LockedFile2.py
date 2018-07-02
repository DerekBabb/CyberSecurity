msg = [84, 104, 101, 115, 101, 32, 112, 97, 115, 115, 119, 111, 114, 100, 115, 32, 97, 114, 101, 32, 103, 101, 116, 116, 105, 110, 103, 32, 104, 97, 114, 100, 101, 114, 46, 46, 46, 32, 73, 32, 97, 109, 32, 105, 109, 112, 114, 101, 115, 115, 101, 100, 32, 119, 105, 116, 104, 32, 121, 111, 117, 114, 32, 99, 111, 100, 101, 32, 98, 114, 101, 97, 107, 105, 110, 103, 32, 97, 98, 105, 108, 105, 116, 121, 46]

def openMessage(password = None):
    if (password == None):
        password = input("Enter password: ")

    if (scramble(password) == "_Hxa"):
        secret = ""
        for num in msg:
            secret = secret + chr(num)
        return secret
    else:
        return "Incorrect password."


def scramble(password):
    scrambled = ""
    for ch in password:
        scrambled += chr(ord(ch) * 107 % 60 + 65)

    return scrambled
