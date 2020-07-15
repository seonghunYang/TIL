def solution(array, commands):
    answer = [] * len(commands)
    for com in commands:
        slice = array[com[0]-1 : com[1]]
        slice = sorted(slice)
        answer.append(slice[com[2] - 1])
    return answer