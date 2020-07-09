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