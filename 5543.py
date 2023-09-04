arr = [int(input()) for _ in range(5)]

if arr[3] < arr[4]:
    drink = arr[3]
else: drink = arr[4]
ham = min(arr[:3])

print(drink + ham - 50)