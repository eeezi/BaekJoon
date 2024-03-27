import sys
from collections import deque

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

network = [[0] * (n+1) for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    network[a][b] = network[b][a] = 1

count = 0
visited = [0] * (n+1)
queue = deque([1])
visited[1] = 1

while queue:
    v = queue.popleft()
    count += 1
    for i in range(1, n+1):
        if visited[i] == 0 and network[v][i] == 1:
            queue.append(i)
            visited[i] = 1

print(count-1)