# 알파벳 찾기

word=input()

versus="abcdefghijklmnopqrstuvwxyz" # 25개

for i in range (len(versus)):
    for j in range (len(word)):
        count=0
        if versus[i]==word[j]:
            print(j, end=" ")
            count=1
            break
    if count==0:
        print(-1, end=" ")

