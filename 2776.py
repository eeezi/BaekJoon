import sys

for _ in range(int(input())):
    n = int(input())
    note1 = set(map(int, sys.stdin.readline().split()))
    m = int(input())
    note2 = list(map(int, sys.stdin.readline().split()))

    for i in range(m):
        if note2[i] in note1:
            print(1)
        else: print(0)