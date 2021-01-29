n = int(input())

for i in range(n):
    count, score = 0, 0
    arr = input()
    for k in range(len(arr)):
        if (arr[k] == 'X'):
            count = 0
        else:
            count += 1
            score += count

    print(score)