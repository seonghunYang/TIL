import re
# 나의 풀이
def solution1(dartResult):
    answer = 0
    expo = {"S": 1, "D": 2, "T": 3}
    prize = {"*": 2, "#": -1, "": 1}
    
    pattern = re.compile('(\d+)([SDT]{1})([*#]?)') 
    token = pattern.findall(dartResult)
    #[('1', 'S', ''), ('2', 'D', '*'), ('3', 'T', '')]
    for i in range(len(token)):
        if i == 0:
            token[i] = int(token[i][0]) ** expo[token[i][1]] * prize[token[i][2]]
        else:
            if token[i][2] == "*":
                token[i-1] = int(token[i-1]) * prize[token[i][2]]
            token[i] = int(token[i][0]) ** expo[token[i][1]] * prize[token[i][2]]
    answer = sum(token)
    return answer

# 개선 풀이
# def solution2(dartResult):
#     answer = 0
#     expo = {"S": 1, "D": 2, "T": 3}
#     prize = {"*": 2, "#": -1, "": 1}
    
#     pattern = re.compile('(\d+)([SDT]{1})([*#]?)') 
#     token = pattern.findall(dartResult)
#     #[('1', 'S', ''), ('2', 'D', '*'), ('3', 'T', '')]
#     for i in range(len(token)):
#         # 가장 기본은 그 인덱스에다가 연산을 하는 것
#         # 특수 상황 0보다 인덱스가 크고 *가 나와야 앞에도 연산 
#         if i > 0 and token[i][2]  == "*":
#           token[i] *= prize[token[i][2]]
#         token[i] = int(token[i][0]) ** expo[token[i][1]] * prize[token[i][2]]
#     answer = sum(token)
#     return answer