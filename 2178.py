import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())
maze = [0] * n

for i in range(n):
    maze[i] = list(map(int, sys.stdin.readline().strip()))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    queue = deque()
    queue.append((x,y))
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < n and 0 <= ny < m and maze[nx][ny] ==1:
                maze[nx][ny] = maze[x][y]+1
                queue.append((nx, ny))
                
    return maze[n-1][m-1]

print(bfs(0,0))