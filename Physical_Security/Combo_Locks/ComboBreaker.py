def lockCombo():
    lastNum = int(input("What is the last number? "))
    
    firstNum = lastNum % 4
    
    while firstNum <= 40:
        if firstNum == lastNum:
            firstNum += 4
        
        middleNum = lastNum % 4 - 2
        if middleNum < 0:
            middleNum += 4
        
        while middleNum <= 40:
            print (firstNum, middleNum, lastNum)
            middleNum += 4
        
        firstNum += 4
    
