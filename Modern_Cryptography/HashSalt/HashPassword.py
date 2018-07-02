#HashPassword.py
import hashlib

hashPass = "d89eddeec748c49d5add2f8f347b8899"
salt = "pepper"

password = input("Enter password: ")
userHash = hashlib.md5(password.encode() + salt.encode()).hexdigest()

if(hashPass == userHash):
    print("Password correct!")
else:
    print("Password Incorrect.")
