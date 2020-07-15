def solution(participant, completion):
    answer = ''
    sum = 0
    dic = {}
    for i in participant:
        dic[hash(i)] = i
        sum += int(hash(i))
    for j in completion:
        sum -= hash(j)
    answer = dic[sum]
    return answer