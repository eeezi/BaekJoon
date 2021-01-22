t = int(input())

for i in range(t):
    r, s = input().split()
    s = list(s)
    for k in range(len(s)):
        print(s[k] * int(r), end="")
    print("")