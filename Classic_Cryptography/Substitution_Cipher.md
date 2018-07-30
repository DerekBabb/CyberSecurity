# Substitution Cipher

## Overview
Students will use a substitution cipher to encrypt a message and then to decrypt a message. In a substitution cipher each letter of the alphabet is swapped with a different letter.

## Purpose
Substitution ciphers are significantly more secure than a Caesar cipher but require a more complicated key. Look at the differences in complexity and portability of different ciphers.

### Objectives
#### Students will be able to:
- Encode and decode messages using a substitution cipher.
- Identify the mathematical advantage of substitution over shift cipher.

### Preparation
- [x] Print the [Substitution Cipher Activity Worksheet](Substitution_Cipher/Substitution_Cipher_Activity.docx)
- [x] Arduino Student Inventor Kit (Extended Activity)

### Links
- For the Teacher

- For the Students
	- https://www.guardsupport.com/crypto/index.asp
	- http://www.cryptoclub.org/games/rogue_computer.php
	- http://www.cryptograms.org/play.php

### Vocabulary

## Teaching Guide
### Getting Started
Introduce the idea of a substitution cipher
- Each letter of our alphabet is swapped for that of a jumbled alphabet
- There are 26! different possible alphabets that could be used.

### Activity
- Substitution Cipher Activity Worksheet
- Students will encrypt and decrypt several messages using a substitution cipher.  

- They will then explore a keyword cipher and finally encrypt a message with a keyword to swap with someone else in the class.

### Activity
- Python Programming: There are multiple ways to generate a "key" alphabet in the cipher.
	- [SubstitutionCipher.py](code/SubstitutionCipher.py)
- Python Programming: Program to analyze the letter frequency of a message.
	- [LetterFrequency.py](code/LetterFrequency.py)
	- Output of this is a CSV that can be graphed in Excel

### Wrap-up
#### Discussion
1. How is this type of cipher more secure than a shift cipher like Caesar?
1. What are the weaknesses of this cipher?
1. How does the random substitution compare to a keyword cipher?
	1. What are strengths/weaknesses of each?

### Assessment Questions
- How would frequency analysis be used to decrypt a message encrypted with a substitution cipher?
- Is there are way to change this encryption so it is not vulnerable to frequency analysis?

### Extended Learning
Arduino Programming: Random Alphabet Generator
	https://circuits.io/circuits/5157643-arduino-alphabet-generator/

### Standards Alignment

## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
