# MySolution
'''
total=0
while True:
    try:
        num=input()
        if num=="":
            break
        else:
            num=num.strip().split()
            total=int(num[0])+int(num[1])
            print(total)
    except E0FError:
        break
        '''
        
# OtherSolution
while True:
    try:
        A, B = map(int, input().split())
        print(A+B)
    except:
        break