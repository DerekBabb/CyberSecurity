import hashlib

msg = [67, 111, 110, 103, 114, 97, 116, 117, 108, 97, 116, 105, 111, 110, 115, 44, 32, 121, 111, 117, 32, 104, 97, 118, 101, 32, 102, 111, 117, 110, 100, 32, 116, 104, 101, 32, 99, 111, 114, 114, 101, 99, 116, 32, 112, 97, 115, 115, 119, 111, 114, 100, 46]

def openMessage(password = None):
    if (password == None):
        password = input("Enter password: ")

    if (hash(password) == '2d86bdac01a3315b95794ffa7360edc3'):
        secret = ""
        for num in msg:
            secret = secret + chr(num)
        return secret
    else:
        return "Incorrect password."

def hash(password):
    userHash = hashlib.md5(password.encode()).hexdigest()
    
    return userHash
