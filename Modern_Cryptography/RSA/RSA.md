# RSA Activity

## Overview
Students participate in an activity using the RSA Public Key Cryptography algorithm to send secret messages to each other. This activity acts as an anchor to help students remember concepts of public-key cryptography and digital certificates.

## Purpose

### Objectives
#### Students will be able to:
- Explain how this process (the RSA Algorithm) is an example of Public Key Cryptography
- Explain how digital certificates help ensure the security of encrypted communications

### Preparation
- [x] Have a padlet website created for students to post their public keys (https://www.padlet.com)
- [x] Have the RSA Activity guide posted on Google Classroom or prepared to be handed out
- [x] Have a Python repl open on a hidden teacher computer: https://repl.it/languages/python3

### Links
- For the Teacher

- For the Students
	- https://mathymcmatherson.github.io/RSA_Activity/rsa.html
	- A padlet site you create ahead of time

### Vocabulary

## Teaching Guide
### Getting Started:

- Have students convert their birthday into a number. For example, if you were born on November 30th, you would write 1130. if you were both February 8th, you would write 28. Keep it a secret!
- Use a calculator to raise that number to the 3rd power (you will probably use the ^ symbol on your calculator, or multiply the number by itself 3 times). You will probably end up with a very large number.
- Go to this website: https://studio.code.org/s/csp4/stage/7/puzzle/5 . Type your (very large) number in the first box. Type 1255 into the second box. Press Go and watch what happens. Eventually it will stop on a brand new number
- Write this new number on an index card

### Activity: A Magic Trick
- Ask students to shout out their new number to you
- In a Python REPL (https://repl.it/languages/python3), type \[THEIR_NUMBER\] \** 667 % 1255.
- Convert the number you get back into a birthday and tell them their birthday
- Do several of these. Really ham it up.

### Explanation
- Show the Code.org video on Public Key Encryption: https://www.youtube.com/watch?v=ZghMPWGXexs&t=251
- Tell students that's how the magic trick works. They're using your public key of 1255 to encrypt their birthday. You're using a secret number of 667 to decrypt their birthday.
- Importantly: you can shout this secret number out in the open, for everyone to see, and yet no one will be able to decrypt it without your secret number.
- Optional: Show this video to explain the concept and the math behind what's happening: https://www.youtube.com/watch?v=3QnD2c4Xovk

### Activity: Creating Your Own Public / Private Keys
- Distribute the RSA handout (The .docx file also in this folder of the lesson). Have students generate their own Public Key following the directions on the handout and this website: https://mathymcmatherson.github.io/RSA_Activity/rsa.html
- Have students post their public keys on a Padlet website you've created ahead of time. Make sure the exponent that students have are at least 4 digits.
- Once enough keys are posted, have students send the first 3 digits of their phone number to each other. They can use the REPL widgets on the website to do this.
- They should write down their secret messages on index cards, then you (or other students) can hand deliver them to others in the room.
- **Importantly:** Whoever is delivering the messages can eavesdrop on them, but it doesn't matter - they can't decrypt the message without the private key

### Be Sneaky
- Without telling anyone or making a big deal about it, change a few of the posted Public Keys on the Padlet site to _your own_ public key. Eventually, hopefully, someone will notice.
- When they do: make a big deal about the fact that this means you are able to read the messages meant for _them_ because you stole their identity.
- How can this be avoided? Digital Certificates & Certificate Authorities: show the end of this video from Code.org: https://www.youtube.com/watch?v=kBXQZMmiA4s&t=280

### Wrap-up / Assessment Questions
- Have students explain how this was an example of Public-Key Cryptography - which things were public? Which things were private?
- Have students explain how this was an example of Asymmetric Encryption
- Have students explain why certificate authorities are necessary, and what a Digital Certificate does.

## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
