import sys
sys.stdin=open("input.txt","rt")

내가 푼 방식
N,M = map(int,input().split())
sum = []
for i in range(1,N+1):
    for j in range(1,M+1):
        sum.append(i+j)
count = {}
for i in sum:
    try : count[i] += 1
    except : count[i] = 1
a = [k for k,v in count.items() if max(count.values()) == v]
a.sort()
a = ' '.join(str(s) for s in a)
print(a)


강사님이 푼 방식
cnt = [0]*(n+m+3)
max = -2147000000
for i in range(1, n+1):
	for j in range(1, m+1):
		cnt[i+j] += 1
for i in range(n+m+1):
	if cnt[i]>max:
		max=cnt[i]
for i in range(n+m+1):
	if cnt[i]==max:
print(i, end=' ')

배열인덱스를 n+m개 이상 만들어놓고 배열이 선택되면 그에대한 카운트가 1개 증가하는방식 -> 메모리가 낭비될수 있다.

	
count = {}
for i in sum:
    try : count[i] += 1
    except : count[i] = 1

왜 try, except를 사용할까?
count에 +=1 을 하려고 하는데 초기화 되어있지 않기 때문에 바로 except로 가서 1을 초기화시켜주고, 그 후에 1씩 추가하게 되는 구조이다.
