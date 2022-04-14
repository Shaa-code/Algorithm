내가 푼 방식

import sys
sys.stdin=open("input.txt","rt")

N,K = map(int,input().split())
lst = list(map(int,input().split()))

set1 = set()
for i in range(N):
    for j in range(N):
        for k in range(N):
            set1.add(lst[i]+lst[j]+lst[k])
lst1=list(set1)
lst1.sort(reverse=True)
print(lst1)


강사님이 푼 방식

n,k=map(int, input().split())
a = list(map(int,input().split()))
res = set()
for i in range(n):
		for j in range(i+1,n):
					for m in range(j+1,n):
							res.add(a[i]+a[j]+a[m])
res = list(res)
res.sort(reverse=True)
print(res[k-1])



합한값을 기록하는건 값이 중복되어 나올수 있는데, 한번만 알아도 되기때문에 중복을 제거해야한다.

뽑은 N개 중에 우연히 같은게 여러개 있을수 있다는거지,
처음부터 똑같은거 중복해서 카드를 뽑을 수 있다는 의미가 아니다.
다시말해서

for i in range(N):
    for j in range(N):
        for k in range(N):
            print(i,j,k)

이런 구조가 아니라.

for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            print(i,j,k)

이런 구조가 되어야한다는거다.

카드는 똑같은걸 뽑을 수 없다. 다른 카드를 뽑아야만 한다.

문제를 내가 이해하고 싶은 방식대로 왜곡해서 해석했다.

문제를 잘 이해하는게 굉장히 중요하다는걸 깨달았다.
