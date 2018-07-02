msg = [87, 104, 97, 116, 32, 100, 111, 32, 119, 101, 32, 110, 101, 101, 100, 32, 116, 111, 32, 100, 111, 32, 116, 111, 32, 109, 97, 107, 101, 32, 112, 97, 115, 115, 119, 111, 114, 100, 115, 32, 101, 118, 101, 110, 32, 109, 111, 114, 101, 32, 115, 101, 99, 117, 114, 101, 63]

def openMessage(password = None):
    if (password == None):
        password = input("Enter password: ")

    if (scramble(password) == "£g\x98y"):
        secret = ""
        for num in msg:
            secret = secret + chr(num)
        return secret
    else:
        return "Incorrect password."


def scramble(password):
    scrambled = ""
    for ch in password:
        scrambled += chr(ord(ch) * 107 % 106 + 65)

    return scrambled
