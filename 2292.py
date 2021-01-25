n = int(input())
num , room = 1, 1

while (n > num):
    num += 6 * room
    room += 1

print(room)