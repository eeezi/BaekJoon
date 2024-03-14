import sys

def isVPS(str):
    answer = []
    for x in str.strip():
        if x == "(":
            answer.append(x)
        else:
            try:
                answer.pop()
            except:
                return False
    return not answer

T = int(sys.stdin.readline())
for _ in range(T):
    str = sys.stdin.readline()
    print("YES") if isVPS(str) else print("NO")