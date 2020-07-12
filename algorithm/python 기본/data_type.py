#숫자형 
a = 3
b = 4
a / b
a % b
a // b

#문자형
a = "Life is too short\tYou need python"
b = """Life is too short
You need python"""
print(a) 
print(b)
head = "python"
tail = "is fun"
print(head + tail)
print(head * 2)
print()
print("=" * 50)
print("My Program")
print("=" * 50)

#문자열 인덱스와 슬라이싱
a = "Life is too short, You need Python"
print(a[0:4])
print(a[5:-20])
a = "20010331Rainy"
print(a[:4])
print(a[4:8])
print(a[8:])
a = "Pithon"
print(a[:1] + "y" + a[2:])

#format()
print("I eat {0} apples".format(3))
print("I ate {0} apples, {1}".format(3, 4))
print("I ate {number} apples. so I was sick for {day} days.".format(number=10, day=3))
print("{0:<10}".format("hi"))
print("{0:>10}".format("hi"))
print("{0:0.4f}".format(0.1235324))

#f format
name = "ksf"
print(f"my name is {name.upper()}")

# 문자열 함수
a = "hobby"
print(a.count("b"))
print(a.find("o")) 
print(a.index("o")) #find와 다른점은 못찾을시 오류
print(a.find("c"))

print(",".join("abcd"))
print(",".join(["a", "b", "c", "d"]))
print("/".join(("a", "b", "c", "d")))

a = " h i "
print(a.lstrip())
print(a.rstrip())
print(a.strip())

a = "Life is too short"
print(a.replace("i", "s")) #전부 바뀜

a = "Life is too short"
print(a.split("i"))

a = "abcde"
a = ",".join(a)
print(a)
print(a.split(","))

#list
a = [1, 2, 3]
b = [4, 5, 6]
print(a + b)

a[2] = 4
print(a)

del a[1] #리스트 요소 삭제 함수
print(a)

#list 관련 함수
a = [1, 2, 3]
a.append(4)
print(a)
a.append([5,6])
print(a)
a = [1, 4, 3, 2]
a.sort() #문자열도 알파벳 순으로 정렬
print(a)
a= ["abc", "bca", "acb"]
a.sort()
print(a)
a.reverse()
print(a)
a = [1, 2, 3]
print(a.index(3))

a.insert(0, 5)
print(a)
a.insert(3, 10)
print(a)

print(a.remove(10))
print(a)

print(a.pop())
print(a)
a.pop(1)
print(a)

a = [1,2,3,1]
print(a.count(1))

a = [1,2,3]
a.extend([4, 5])
print(a)

#리스트는 [ ]으로 둘러싸지만 튜플은 ( )으로 둘러싼다.
#리스트는 그 값의 생성, 삭제, 수정이 가능하지만 튜플은 그 값을 바꿀 수 없다.
t1 = ()
t2 = (1, )
t3 = (1, 2, 3)
t4 = 1, 2, 3

# dictionary
dic = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}
print(dic["name"])
dic["name2"] = "지환"
print(dic)
del dic["name"]
print(dic)

dic[(1, 2)] =[1, 2]
print(dic)
# dic[[2, 4]] = [1, 2] 안된다 key는 변치 않음

# dictionary 함수
print(dic.keys())
# dict_keys 객체는 리스트처럼 사용가능하지만
# append, insert, pop같은 함수는 수행 불가능
print(list(dic.keys()))
print(dic.values())
print(list(dic.values()))

print(dic.items())
# dic.clear()
print(dic)

print(dic.get("phone"))
print(dic.get("x"))
print(dic.get("x", "x"))

print("phone" in dic)
print("email" in dic)
print("1118" in dic.values())

#집합 자료형
#중복을 허용하지 않는다.
#순서가 없다(Unordered).
s2 = set("Hello") #대소문자 구분
print(s2)
#중복 제거 용도로 사용하곤 한다

#bool 자료형
print(bool([1,2,3]))
print(bool([]))

#리스트의 복사
a = [1, 2, 3]
b = a[:]

a, b =('python', "life")
print(type(a), b)
[a,b] = ['python', 'life']
print(type(a), b)
a = 3
b = 5
a, b = b, a

# 연습문제
#1
print((80 + 75 + 55) / 3)
#2
print(13 % 2)
#3
num = "881120-1068234"
year = "19" + num[:2]
print(year + num[2:6] + " " + num[7:])
#4
pin = "881120-1068234"
print(pin[7])
#5
a = "a:b:c:d"
print(a.replace(":", "#"))
#6
a = [1, 3, 5, 4, 2]
a.sort()
a.reverse()
print(a)
#7
a = ['Life', 'is', 'too', 'short']
a = " ".join(a)
print(a)
#8
a = (1,2,3)
print(a + (4,))
#9
#3 key에는 불변값만 올수 있음 list 못온다
#10
a = {'A':90, 'B':80, 'C':70}
#dic도 pop 사용가능
result = a.pop("B")
print(a)
print(result)
#11
a = [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]
a = set(a)
print(a)
#12
a = b = [1, 2, 3]
a[1] = 4
print(b, "= [1, 4, 3]")

a = [1, 2, 3, 4, [6, 5]]
a[4].sort()
print(a)