t = int(input())

for i in range(t):
    h, w, n = map(int, input().split())
    
    if(n%h) == 0:
        floor = h
        room = int(n / h)
    else:
        floor = n % h
        room = int(n / h) + 1

    print('%d%02d'%(floor,room),sep='')