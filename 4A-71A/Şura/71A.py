long=int(input())
array=[]
for i in range(long):
    word=input()
    numberOfword=0
    for i in word:
        numberOfword+=1
    if numberOfword>10:
        inBetween=numberOfword-2
        newWord=word[0]+str(inBetween)+word[numberOfword-1]
        array.append(newWord)
    else:
        array.append(word)
for i in array:
    print(i)
