내가 푼 방식
import sys
sys.stdin=open("input.txt","rt")

def right_rotate(l,n):
    return l[-n:]+l[:-n]

def left_rotate(l,n):
    return l[n:]+l[:n]

N = int(input())
lst = [list(map(int,input().split())) for _ in range(N)]
M = int(input())

for _ in range(M):
    row,dir,cnt = map(int,input().split())
    if dir==0:
        #lst[row-1] = left_rotate(lst[row-1],cnt)
        lst[row-1] = lst[row-1][cnt:]+lst[row-1][:cnt]
    if dir==1:
        #lst[row-1] = right_rotate(lst[row-1],cnt)
        lst[row-1] = lst[row-1][-cnt:]+lst[row-1][:-cnt]

ret=0
b=0
f=N-1
for i in range(N):
    for j in range(b,f+1):
        ret += lst[i][j]
    if i < N//2:
        b += 1
        f -= 1
    else:
        b -= 1
        f += 1

print(ret)

굳이 함수를 만들필요는 없다. 혹시 깔끔해질까 싶어서, 만들어보았다.

강사님이 푼 방식
for i in range(M):
		h, t, k= map(int, input().split())
		if t==0:
				for _ in range(k):
						a[h-1].append(a[h-1].pop(0)) #Left-Rotate
		else:
				for _ in range(k):
						a[h-1].insert(0,a[h-1].pop()): #Right-Rotate

ret=0
s=0
e=n-1
for i in range(n):
		for j in range(s, e+1):
				ret+=a[i][j]
		if i < n//2:
				s += 1
				e -= 1
		else:
				s -= 1
				e += 1


b,f -> back과 front의 약자로 썻다.
s,e -> start와 end가 더 직관적일까?
