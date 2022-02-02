내가 푼 코드

import sys
sys.stdin=open("input.txt","rt")

n,m = map(int,input().split())
lst = list(map(int,input().split()))

#lst.sort()
#print(lst.index(m)+1)

lst.sort()
print(lst)
lt = 0
rt = n-1
mid = (lt+rt)//2
while lst[mid]!=m:
	if m < lst[mid]:
		mid -= 1
	else:
		mid += 1
print(mid+1)

강사님이 푼 코드

lst.sort()
lt=0
rt=n-1
while lt<=rt:
	mid = (lt+rt)//2
	if lst[mid] == m:
		print(mid+1)
		break
	elif lst[mid] > m:
  		rt = mid-1
	else:
  		lt = mid+1
