import sys
n, m = map(int, sys.stdin.readline().split())

n_people = []; m_people = []
for _ in range(n):
    n_people.append(sys.stdin.readline())
for _ in range(m):
    m_people.append(sys.stdin.readline())

stranger = list(set(n_people) & set(m_people))

print(len(stranger))
print(''.join(sorted(stranger)))