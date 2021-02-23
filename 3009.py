x_coordinate = []; y_coordinate = []
x, y = 0, 0

for _ in range(3):
    x, y = map(int, input().split())
    x_coordinate.append(x)
    y_coordinate.append(y)

for i in range(3):
    x1 = x_coordinate.count(x_coordinate[i])
    y1 = y_coordinate.count(y_coordinate[i])
    if x1 % 2 != 0:
        x = x_coordinate[i]
    if y1 % 2 != 0:
        y = y_coordinate[i]

print(x, y, sep=" ")


''' 다른 사람이 푼 더 간결한 코드
Xpos = list()
Ypos = list()

for _ in range(3):
    x, y = input().split()
    Xpos.append(x) if x not in Xpos else Xpos.remove(x)
    Ypos.append(y) if y not in Ypos else Ypos.remove(y)
print(Xpos[0], Ypos[0])
'''