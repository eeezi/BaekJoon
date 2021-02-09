arr = []
n = int(input())

for i in range(n):
    line = list(map(int, input().split()))
    arr.append(line)

arr.sort()

for i in range(n):
    for j in range(2):
        print(arr[i][j], end=' ')
    print('')