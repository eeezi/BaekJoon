import sys

n = int(sys.stdin.readline())
people = sorted(list(map(int, sys.stdin.readline().split())))
sum = 0

for i in range(n):
    sum += people[i] * (n-i)

print(sum)
