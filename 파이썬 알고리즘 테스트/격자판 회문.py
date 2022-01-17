내가 푼 방식
cnt = 0
for i in range(7):
    for j in range(3):
        plus = minus = (j+4)//2
        for _ in range(2):
            plus -= 1
            minus += 1
            if lst[i][minus]!=lst[i][plus]:
                break
        else:
            cnt+=1
print(cnt)

행만 구현하다가 실패함.


강사님이 푼 방식

import sys
sys.stdin=open("input.txt", "r")
board=[list(map(int,input().split())) for i in range(7)]
cnt=0
for i in range(3):
		for j in range(7):
				tmp=board[j][i:i+5]
				if tmp==tmp[::-1]:
						cnt+=1
		for k in range(2):
				if board[i+k][j]!=board[i+5-k-1][j]:
						break
		else:
				cnt+=1

배운점


1.반복이 돌때, 가장 크게 3개로 나눈 그룹 단위로 반복문이 돌수 있게 만들어야한다.

2.slice로 할것은 slice로 하자

3.서로 마주보게 만드는 아이디어

board[i+k][j]!=board[i+5-k-1][j]:
이것이 정말 중요한 아이디어인데,

내가 처음에 활용하고자 했던 중간인덱스를 활용하여 즉,i//2를 이용해 plus minus에 1을 더하거나 빼는 방식은 반복되는 문제가 있다. 다음을 보자.

i//2는 반복된다. 4여도 2이고, 5면 또 2이다. 같은걸 2번 돌게된다.

가지고 있는 변수를 활용할 수 있어야한다.

처음 인덱스(i)와 끝의 인덱스(i+4)는 알수 있으니, 어떤 수를 반복더하거나 빼면서 진행하면 되겠다는 아이디어를 포착할 수 있다.

k에 어떤수가 반복되어야하는가를 눈치채고 활용하는게 진짜 중요한 포인트이다.
k는 0과 1만 반복된다.
