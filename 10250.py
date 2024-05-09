import sys

t = int(sys.stdin.readline())

for _ in range(t):
    h, w, n = map(int, sys.stdin.readline().split())
    
    if(n%h) == 0:
        floor = h
        room = n // h
    else:
        floor = n % h
        room = n // h + 1

    print('%d%02d'%(floor,room))
    # print(floor * 100 + room)