내가 푼 방식
import sys
sys.stdin=open("input.txt","rt")

lst = [list(map(int,input().split())) for _ in range(9)]
for x in lst:
    print(x)

for i in range(9):
    ch=[0]*10
    ch1=[0]*10
    for j in range(9):
        ch[lst[i][j]] += 1
        ch1[lst[j][i]] += 1
    if sum(ch) != 9 and sum(ch1) != 9:
        print("NO")
				break

for i in range(3):
    for j in range(3):
        ch2 = [0]*10
        for k in range(3):
            for s in range(3):
                ch2[lst[3*i+k][3*j+s]] +=1
        if sum(ch2) != 9:
            print("NO")
            break
else:
    print("YES")

강사님이 푼 방식
def check(a):
		for i in range(9):
				ch1 = [0]*10
				ch2 = [0]*10
				for j in range(9):
						ch1[a[i][j]]=1
						ch2[a[j][i]]=1
				if sum(ch1)!=9 or sum(ch2)!=9:
						return False
		for i in range(3):
				for j in range(3):
						ch3=[0]*10
						for k in range(3):
								for s in range(3):
										ch3[a[i*3]+k[j*3+s]]=1
						if sum(ch3)!=9:
								return False
		return True

if check(a):
		print("YES")
else:
		print("NO")



행과 열탐색은 너무 쉬웠는데, 그룹탐색을 찾으려고 했는데 굉장히 오래 걸렸다. 결국 못찾음.
4중 for문을 사용한다는 아이디어를 보고 앗차! 하고, 여러개로 분리해서 풀 수 있다는걸 느꼇다.

항상 느끼는거지만,, list에 전체를 모두 넣고 생각하는 방식은 좋지 않다. 메모리 낭비가 너무 커진다.

[0]*n개로 초기화할때, 크기가 클수록 메모리 낭비가 클수도 있는데, 이것은, 상황에 따라서 구현을 달리하면 된다.

그냥 완전탐색을 돌면서 하나씩 카운트하는 방법이 가장 좋은것같다.

딕셔너리에 추가하는 방식과 리스트에 추가하는방식 2가지를 선택할 수 있는데,
다른언어와의 호환성을 생각해서 리스트에 추가하는 방식으로 연습하는게 좋을것같다.
