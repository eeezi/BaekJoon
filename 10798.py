line = []

for _ in range(5):
    line.append(input())

for i in range(max(len(row) for row in line)):
    for j in range(5):
        if i <len(line[j]):
            print(line[j][i], end='')