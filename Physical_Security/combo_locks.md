# Combo Locks

## Overview
Combination locks are a metaphor for security.  On the surface it seems as though there are thousands of possibilities but as we learn the rules that govern their workings we can get the number of possible combinations down to a much smaller number.

Students will look at Masterlock combination locks to learn how they work and find potential vulnerabilities.

## Purpose
Look at a common method of securing belongings and the mathematics behind the possible number of combinations.

### Objectives
#### Students will be able to:

### Preparation
- [x] Masterlock combination lock
- [x] Print sheets to help find number of combinations[ComboLocks.png](Combo_Locks/ComboLocks.png)

### Links
- For the Teacher
	- https://lifehacker.com/5376442/crack-a-master-combination-padlock-redux
	- https://samy.pl/master/master.html

- For the Students

### Vocabulary

## Teaching Guide
### Getting Started
- Look at the mathematics of a masterlock combo lock
	- 40 possible digits in each of 3 spots = 64,000 possible combos
	- All even or all odd = 40 * 20 * 20 = 16,000 possibilities
	- First number = last number % 4 = 40 * 20 * 10 = 8000 possibilities
	- Middle number = last number % 4 + 2 = 40 * 10 * 10 = 4000 possibilities

- If last number is known: 10 * 10 * 1 = 100 possible combos

### Activity:
- Distribute locks and combo finding worksheet
	- Find the last digit by testing the "sticking points" in the lock
	- Calculate the 100 possible combos based on knowing the last digit
	- Open the lock

### Activity
- Use the Combo Breaker python file to automate the process of listing all possible combinations.
	- [ComboBreaker.py](Combo_Locks/comboBreaker.py)
	- [Snap Coding Version](https://snap.berkeley.edu/snapsource/snap.html#present:Username=derekbabb&ProjectName=ComboLock2)

### Activity:
- Show the Samy Kamkar video
	- https://www.youtube.com/watch?v=09UgmwtL12c

-	Use Samy's method
	- https://samy.pl/master/master.html

### Wrap-up
#### Discussion:
- Why are there not 64,000 actual combinations?
- Knowing that it can be broken in 8 tries, why even bother with locks?
- How do other locks like directional locks work?
	- Are there weaknesses to other locks?

#### Video:
- Top Hacker Shows Us How It's Done
	- https://www.youtube.com/watch?v=hqKafI7Amd8

### Assessment Questions


### Extended Learning
- Look at another type of combo lock
	- Break down the number of possible combinations
	- What are the rules that govern this lock?
	- How might those rules be exploited?

### Standards Alignment

## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
