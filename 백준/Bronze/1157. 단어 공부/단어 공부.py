word=input().lower()
word_list = list(set(word)) # 중복값 제거를 위해 set() 사용
cnt=[]

for i in word_list:
    count=word.count(i)
    cnt.append(count)

if cnt.count(max(cnt)) >= 2:
    print("?")
else:
    print(word_list[(cnt.index(max(cnt)))].upper())