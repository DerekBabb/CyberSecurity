#This password cracker will bruteforce the password for several locked files.
#We will need to try all of the possible permutations of passwords until we
#get the correct one.

#SETUP
fileName = "LockedFile1"
letters = "abcdefghijklmnopqrstuvwxyz"
passLength = 4 #How many characters is the password?
viewAll = True #True or False, select False for maximum speed.

#There are three files we want to break.
#LockedFile1 - we know the password is only 4 characters and only lowercase letters
#LockedFile2 - 4 characters long but mix of upper and lowercase letters
#LockedFile3 - Between 4-6 characters long, mix of uppercase, lowercase, symbols, and numbers.

#--------------------------------------------------------------------------

#Need to convert a list of numbers to a word
def convertPass(nums, letterList):
    p = ""
    for num in nums:
        p = p +letterList[num]
    return p

exec("import %s as attackFile" %(fileName))
import time

def passwordCrack():
    startTime = time.time()

    password = []

    for i in range(passLength):
        password.append(0)

    word = convertPass(password, letters)
    msg = "Incorrect password."

    while(msg == "Incorrect password."):
        last = passLength - 1
        password[last] = password[last] + 1
        for spot in range(last, 0, -1):
            if password[spot] >= len(letters):
                password[spot-1] = password[spot-1] + 1
                password[spot] = 0

        word = convertPass(password, letters)
        msg = attackFile.openMessage(word)
        if viewAll:
            print(word + ": " + msg)

    endTime = time.time()
    print("Password cracked in %0.4f seconds." %(endTime - startTime))
    print ("Password:", word)
    print ("Message:",msg)

passwordCrack()
