a, b = map(int, input().split())
A, B = a, b

mod = a % b
while mod > 0:
    a = b
    b = mod
    mod = a % b

print(b)
print(A*B//b)