내가 푼 방식
import sys
sys.stdin=open("input.txt","rt")

N = input()

lst = []
for i in N:
	if i.isnumeric() == True:
		lst += i
number = int(''.join(lst))

cnt = 0
for i in range(1,number+1):
	if number%i == 0:
		cnt += 1

print(number)
print(cnt)

강사님이 푼 방식

res=0
for x in s:
	if x.isdecimal():
		res=res*10+int(x)
cnt = 0
for i in range(1,res+1):
	if res%i == 0:
		cnt+=1
print(cnt)


내가 만든 코드는 너무 Python에 특화되어 있다.
조금 더 수학적으로 접근해보자.


isdecimal (0~9)까지의 숫자.
isdigit (2^23 =이것도 숫자로 봐줌)
