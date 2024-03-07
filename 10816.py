n = int(input())
held_card = list(map(int, input().split()))
m = int(input())
count_card = list(map(int, input().split()))

answer = dict()

for x in held_card:
    if x in answer:
        answer[x] += 1
    else:
        answer[x] = 1

print(" ".join(str(answer[y]) if y in answer else '0' for y in count_card))