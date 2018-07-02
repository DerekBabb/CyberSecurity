# Salt and Hashing
## Overview
Passwords are stored on servers and computers to validate users.  These passwords should not be stored as plaintext so anyone can read them.  To obscure the passwords, salt is added to make the passwords unreadable.  Students will explore how salt can turn a password into a garbled message once hashed.

## Purpose
Students will use salt to obscure a password and see how password files are stored on computers and web servers to validate users without exposing passwords to anyone on the system.

### Objectives
#### Students will be able to:
- Explain how salt is added to passwords.
	- Demonstrate how a salted password increases the strength of the password.
- Describe the output of a hash algorithm.
	- Explain how this can be used to validate a password, file, or other media.

### Preparation

### Links
- For the Teacher
	- https://en.wikipedia.org/wiki/Hash_function
	- https://en.wikipedia.org/wiki/Salt_(cryptography)
	- [HashDemo.py]("HashSalt/HashDemo.py")
	- [HashPassword.py]("HashSalt/HashPassword.py")

- For the Students
	- https://www.pythoncentral.io/hashing-strings-with-python/

### Vocabulary

## Teaching Guide
### Getting Started:
How NOT to Store Passwords
https://www.youtube.com/watch?v=8ZtInClXe1Q

Hashing Algorithms
https://www.youtube.com/watch?v=b4b8ktEV4Bg


### Activity:
Use the HashDemo.py file to find a hash version of a password.
- If you search that hash on the internet, can you recover the original password?

Now try the same thing with the salted version.
- Was the result different?

Modify the HashPassword.py file to do the following:
- Store a password and username in hashed form in a python file.
- The password should contain salt.
- The salt may be stored alongside the hashed password.
- Given this file, can you reverse the password?


### Wrap-up
Secure Hashing Algorithms:
https://www.youtube.com/watch?v=DMtFhACPnTY

Discussion:
- How is this more secure than simply storing the password?
- What are the weaknesses of storing the hash?
	- Same password maps to the same hash
- How do rainbow tables affect the security of a hashed password?		
	- What can be done to overcome this weakness?

### Assessment Questions
- What is the purpose of Hashing?
- Why do all phrases have the same length once hashed?
- What is a vulnerability to storing passwords as a hashed value?
- What is salt?
- How does salting make hashed passwords more secure?

### Extended Learning

### Standards Alignment

## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
