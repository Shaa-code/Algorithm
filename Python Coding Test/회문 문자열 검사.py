내가 만든 코드  
import sys  
sys.stdin=open("input.txt","rt")  

N = int(input())  

for i in range(N):
    str = input()
    tmp = str[::-1]
    if str.upper() == tmp.upper(): -> 대소문자 상관없으니, 하나로 받음
        print("#%d : YES" %(i+1))
    else:
        print("#%d : NO" %(i+1))

강사님이 푼 코드

for i in range(n):
	s=input()
	s=s.upper()
	size=len(s)
	for j in range(size//2): -> 대칭검증이기 때문에 절반까지만 돌리면됨.
		if s[j]!=s[-1-j]:
			print("#%d NO" %(i+1))
			break -> break를 해주지 않으면 else:문에 있는것이 바로 실행된다.
	else:
		print("#%d YES" %(i+1))

python은 index를 음수로도 접근이 가능하다.
강사님이 푼 아이디어는 배열의 원소가 대칭형으로 같은가를 체크하는 방식이다.

강사님이 푼 Pyhtonic 코드

for i in range(n)
	s=input()
	s=s.upper()
	if s==s[::-1]:
		print("#%d YES",%(i+1))
	else:
		print("#%d NO",%(i+1))

str은 s로 쓰자, 훨씬 깔끔해 보인다.
