내가 푼 방식

import sys
sys.stdin=open("input.txt","rt")
T = int(input())

for i in range(T):
    N,s,e,k = map(int,input().split())
    lst1 = list(map(int,input().split()))
    lst2 = sorted(lst1[s-1:e])
    print("#%d %d" %(i,lst2[k-1]))

강사님이 푼 방식

for t in range(T):
		n, s, e, k=map(int,input().split())
		a = list(map(int, input().split()))
		a=a[s-1:e]
		a.sort()
		print("#%d %d" %(t,a[k-1]))


배운점 

1.list slice할때 주의하기
index에 대한 연습이 조금 더 필요함

첫번째 시도 : lst1[s:e]
두번째 시도 : lst1[s-1:e-1]
세번째 시도 : lst1[s-1:e]

첫번째는 index번호에 -1을 해야 원래 번호가 맞게 들어간다.
마지막은 원래 포함하지 않기에 1개 많이 써도 되는것이고.

2.C언어 print에 익숙해져서 자꾸 기억을 못한다.
"%d %d"와 %후 괄호로 묶어줘야한다.

3.
sort는 list의 내장 메소드이고, sort는 반환값이 None이다.
sorted는 내장함수이다.

4. 추가로 학습한 sort(reverse=True), list.reverse()
a.sort(reverse=True)는 오름차순으로 정렬한후에 순서를 역전시킴.
a.reverse()는 그냥 순서만 역전시킴.
