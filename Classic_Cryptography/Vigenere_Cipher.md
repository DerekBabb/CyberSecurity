# The Vigenère cipher

## Overview
The Vigenère cipher is similar to the Caesar cipher but the key shifts between each letter.  This makes frequency analysis more difficult since the same letter in plaintext could be different letters in the cipher text.

## Purpose
To use a polyalphabetic cipher to encrypt and decrypt a message. Analyse the security of this cipher.  

### Objectives
#### Students will be able to:
- Use the Vigenère cipher to encrypt/decrypt a message.
- Explain how frequency analysis would work on this type of encryption.
- Identify possible weaknesses in the Vigenère cipher and how they might be exploited.

### Preparation
- [x] Print copies of The [Vigenère Square](Vigenere_Cipher/Vigenere_square.svg)
- [x] Print copies of The [Vigenère Activity Worksheet](Vigenere_Cipher/Vigenere_square_Activity.docx)

### Links
- For the Teacher

- For the Students

### Vocabulary

## Teaching Guide
### Getting Started
- Polyalphabetic Cipher(video)
  - https://www.youtube.com/watch?v=BgFJD7oCmDE

### Activity
- Have students encrypt/decrypt several messages using the Vigenère Square.
- While students are encrypting, they should be focusing on how patterns emerge and how they might be able to break this code if a keyword was unknown.

### Activity
- Python Programming:
  - [VigenereCipher.py](code/VigenereCipher.py)


### Wrap-up
#### Discussion:
- How does this cipher make the code more secure than previously discussed ciphers?
- What are the primary limitations to this type of encryption?

Video: How Blockchain will Transform Economy
- https://www.ted.com/talks/bettina_warburg_how_the_blockchain_will_radically_transform_the_economy

### Assessment Questions
- How recently was the Vigenere cipher used?
- Why was it so much longer-lived than the Caesar Cipher that it is based on?
- What is the information leak within the cipher?

### Extended Learning
The Codebook - Chapter 2, The Anonymous Codebreaker

As with our first blog post, you should write a post that includes writing, images, links, and other media resources as needed to answer the following questions. The questions should be a guide for your writing but it would be nice if you answered the general questions.

- How did encryption move from a military application to a more everyday pursuit?
- What types of purposes did codes and encryption serve?
- How did people engage in codes as a hobby or interest?
- Why were solutions to ciphers like Vigenere not published when discovered?
- What are some other take-aways from this chapter you found interesting?

### Standards Alignment

### Sources:
By Brandon T. Fields (cdated) - Based upon Vigenere-square.png by en:User:Matt Crypto. This version created by bdesham in Inkscape, and modified by cdated to include visual guides.This vector image was created with Inkscape., Public Domain, https://commons.wikimedia.org/w/index.php?curid=15037524

## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
