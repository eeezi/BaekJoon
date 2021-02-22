import sys
n = int(input())

file = []
for _ in range(n):
    file.append(sys.stdin.readline().strip())

ans = [0 for i in range(len(file[0]))]
for i in range(n-1):
    for j in range(len(file[0])):
        if file[i][j] == file[i+1][j]:
            ans[j] += 1

for i in range(len(ans)):
    if ans[i] == n-1:
        print(file[0][i], end='')
    else: print('?', end='')


''' 다른 사람이 푼 더 간결한 코드

n = int(input())
a = list(input())

for i in range(n - 1):
    b = list(input())
    for j in range(len(a)):
        if a[j] != b[j]:
            a[j] = '?'
    
print(''.join(a))
'''