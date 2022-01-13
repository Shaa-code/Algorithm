내가 푼 방식
import sys
sys.stdin=open("input.txt","rt")

N = int(input())
lst = []
for _ in range(N):
    lst.append(list(map(int,input().split())))

max = float("-inf")
sum = 0
for i in range(N):
    for j in range(N):
        sum += lst[i][j]
        if max < sum:
            max = sum
    sum = 0

for i in range(N):
    for j in range(N):
        sum += lst[j][i]
        if max < sum:
            max = sum
    sum = 0

for i in range(N):
    sum += lst[i][i]
    if max < sum:
        max = sum
sum = 0

for i in range(N):
    sum += lst[i][N-i-1]
    if max < sum:
        max = sum
    
print(max)

n=int(input())
a = [list(map(int,input().split() for _ in range(N)]
for x in a: -> 이렇게 하면 행렬처럼 볼수 있다.
		print

largest = - 2147000000
for i in range(n):
		sum1=sum2=0
		for j in range(n):
				sum1 += a[i][j]
				sum2 += a[j][i]
		if sum1 > largest:
				largest = sum1
		if sum2 > largest:
				largest = sum2

sum1 = sum2 = 0
for i in range(n):
		sum1 += a[i][i]
		sum2 += a[i][n-i-1]
		if sum1 > largest:
				largest=sum1
		if sum2 > largest:
				largest=sum2
print(largest)


배운점

1.List Comprehesion으로 코드를 줄이자.

lst = []
for _ in range(N):
    lst.append(list(map(int,input().split())))
-> a = [list(map(int,input().split() for _ in range(N)]

2.치명적인 실수

for i in range(N):
    for j in range(N):
        sum += lst[i][j]
        if max < sum:
            max = sum
        sum = 0

마지막에 sum을 0으로 초기화 시켜줘야한다는 생각에 마지막에 0으로 넣었는데,
j가 1씩 증가할때마다, 0으로 초기화되고 있었다. (뭐한거지..)

즉,
for i in range(N):
    for j in range(N):
        sum += lst[i][j]
        if max < sum:
            max = sum
		sum = 0
                 
이렇게 초기화 시켜주어야한다.

또는 아래 코드와 같이 잘 보이도록 첫번째 for문에서 sum을 0으로 초기화 시켜줘도 된다.
for i in range(N):
		sum = 0
    for j in range(N):
        sum += lst[i][j]
        if max < sum:
            max = sum

흠.. 생각해보니 코드의 맨밑에 sum = 0을 넣어주는것 보다, sum을 i가 포함된 for문에 넣는게 더 좋은것 같다.

왜냐하면 for문이 시작되기전에, sum = 0을 한번 꼭 초기화를 해주어야하는데,
i가 포함된 for문 밑에 넣게 되면,바깥에서 초기화를 해줄 필요가 없어지기 때문이다.


3. for 문이 2개이고 변수가 1개인게 좋을까? 아니면, for문이 1개이고 변수가 2개인게 좋을까?
상황마다 다르겠지만, 비용적인 측면에서 일반적으로 변수를 추가하는게 간단하니 변수를 2개 놓고 가는게 훨씬 더 좋은방식 인것같다.
