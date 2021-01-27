t = int(input())

for i in range(t):
    k , n = int(input()), int(input())  # k층, n호
    arr = list(range(1,n+1))
    
    for j in range(k):
        for l in range(1, n):
            arr[l] = arr[l-1] + arr[l]
    print(arr[n-1])
