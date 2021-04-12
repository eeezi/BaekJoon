import sys
from collections import Counter

n = int(sys.stdin.readline())
number = []
for _ in range(n):
    number.append(int(sys.stdin.readline()))
number = sorted(number)

def mean(num):
    return round(sum(num)/n)

def median(num):
    return num[int(n/2)]

def mode(num):
    if n == 1: return num[0]
    cnt = Counter(num).most_common(2)
    return (cnt[1][0] if cnt[0][1] == cnt[1][1] else cnt[0][0])

def scope(num):
    return max(num) - min(num)

print(mean(number))
print(median(number))
print(mode(number))
print(scope(number))