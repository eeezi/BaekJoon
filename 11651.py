arr = []
n = int(input())

for i in range(n):
    x, y = list(map(int, input().split()))
    arr.append((y, x))

arr.sort()

for y, x in arr:
    print(x, y)