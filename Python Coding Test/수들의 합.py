내가 푼 방식

import sys
sys.stdin=open("input.txt","rt")

N,M=map(int,input().split())
A = list(map(int,input().split()))

cnt = 0
for i in range(N+1):
	for j in range(i+1,N+1):
		if sum(A[i:j]) == M:
			cnt +=1
print(cnt)

강사님이 푼 방식

n,m=map(int,input().split())
a = list(map(int,input().split()))

lt = 0
rt = 1
tot = a[0]
cnt = 0
while True:
	if tot < m:
		if rt < n:
			tot += a[rt]
			rt += 1
		else:
			break
	elif tot == m:
		cnt += 1
		tot -= a[lt]
		lt += 1
	else:
		tot -= a[lt]
		lt += 1
print(cnt)

강사님이 푼 방식은 들어오는 수가 많아질때도,잘 작동하게끔 설계되었다.
하지만, 내가 만든 방식은, 시간복잡도가 O(n^2)이라 리스트 원소수가 많아지면, 속도가 크게 저하된다.
