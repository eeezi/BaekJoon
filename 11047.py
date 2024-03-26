import sys

n, k = map(int, sys.stdin.readline().split())
coin = []
count = 0

for _ in range(n):
    coin.append(int(sys.stdin.readline()))

for x in coin[::-1]:
    if k >= x:
        count += k//x
        k -= x * (k//x)

print(count)