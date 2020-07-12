import re

data = """
park 800905-1049118
kim  700905-1059119
"""
pat = re.compile(r"\d+")
m = pat.search(data)
a = pat.findall(data)
print(a)

p = re.compile('[a-z]+')

result = p.findall("python")
print(result)

d = "1S2D*1T"
pa = re.compile("(\d+)([SDT])([*#]?)")
a = pa.findall(d)
print(a)