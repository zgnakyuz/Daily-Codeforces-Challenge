n=int(input())
for i in range(n):
    word=input()
    if (len(word)<11):
        print(word)
    else:
        print(word[0],end="")
        print(len(word)-2,end="")
        print(word[-1])