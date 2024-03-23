import sys

k = int(sys.stdin.readline())
account = []

for _ in range(k):
    num = int(sys.stdin.readline())
    account.pop() if num == 0 else account.append(num)

print(sum(account))