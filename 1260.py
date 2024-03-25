from collections import deque
import sys

n ,m ,v = map(int, sys.stdin.readline().split())

graph = [[0] * (n+1) for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

dfs_visited = [0] * (n+1)
bfs_visited = [0] * (n+1)

def DFS(v):
    dfs_visited[v] = 1
    print(v, end=' ')
    for i in range(1, n+1):
        if graph[v][i] == 1 and dfs_visited[i] == 0:
            DFS(i)
            
def BFS(v):      
    queue = deque([v])
    bfs_visited[v] = 1
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, n+1):
            if(bfs_visited[i] == 0 and graph[v][i] == 1):
                queue.append(i)
                bfs_visited[i] = 1

DFS(v)
print()
BFS(v)
