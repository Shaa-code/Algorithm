내가 푼 방식

import sys
sys.stdin=open("input.txt","rt")

N = int(input())
lst = list(map(int,input().split()))

cnt = 0
sum = 0
for i in lst:
    if i == 0:
        cnt = 0
    elif i == 1:
        cnt += 1
        sum += cnt
print(sum)

강사님이 푼 방식

sum = 0
cnt = 0
for x in a:
	if x==1:
		cnt += 1
		sum += cnt
	else:
		cnt=0
print(sum)
