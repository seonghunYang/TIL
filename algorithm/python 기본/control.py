# if문
#조건부 표현식
score = 75
# if score > 60:
#   message = "success"
# else:
#   message = "failure"

message = "success" if score > 60 else "failure"
print(message)

#while문
#for문
a = [(1,2), (3, 4), (5, 6)]
for (first, last) in a:
  print(first + last)

#리스트 내포
a= [1, 2, 3, 4]

result = [num * 3 for num in a]

#연습문제
#1
#shirt 
#2
n=1
ans = 0
while n<=1000:
  if n % 3 == 0: ans += n
  n +=1
print(ans)
#3
n = 1
while n <= 5:
  print("*" * n)
  n+=1
#4
for i in range(1, 101):
  print(i)
#5
a = [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]
sum = 0
for i in a:
  sum += i
print(sum/len(a))
#6
numbers = [1, 2, 3, 4, 5]
result = [num * 2 for num in numbers if num % 2 == 1]
print(result)