import sys
from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

n, m = map(int, sys.stdin.readline().split())
campus = [list(sys.stdin.readline()) for _ in range(n)]

def bfs():
    queue = deque()
    count = 0
    visited = [[False] * m for _ in range(n)]
    
    for i in range(n):
        for j in range(m):
            if campus[i][j] == 'I':
                queue.append((i, j))
                visited[i][j] = True
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < n and 0 <= ny < m:
                if campus[nx][ny] != 'X' and not visited[nx][ny]:
                    queue.append((nx, ny))
                    visited[nx][ny] = True
                    
                    if campus[nx][ny] == 'P':
                        count += 1
                        
    return count if count != 0 else 'TT'
                
print(bfs())