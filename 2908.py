a, b = input().split()
a = a[::-1]     # int형은 불가능 -> 문자열로 취급
b = b[::-1]

if(a>b): print(a)
else: print(b)