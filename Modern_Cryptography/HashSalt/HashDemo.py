#HashDemo.py
import hashlib

#Get a password or phrase from the user.
mystring = input('Enter String to hash: ')
#Hash using MD5
hash_object = hashlib.md5(mystring.encode());
print("MD5:", mystring, "\t" , hash_object.hexdigest())
#Hash using SHA256
hash_object = hashlib.sha256(mystring.encode())
print("SHA256:", mystring, "\t" , hash_object.hexdigest())

#now add salt
salt = "!@#$%"
print ("Now with salt of", salt)

hash_object = hashlib.md5(mystring.encode() + salt.encode())
print("MD5:", mystring, "\t" , hash_object.hexdigest())
hash_object = hashlib.sha256(mystring.encode() + salt.encode())
print("SHA256:", mystring, "\t" , hash_object.hexdigest())
