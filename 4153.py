while True:
    arr = list(map(int, input().split()))
    if (sum(arr) == 0): break

    max_arr = max(arr)
    arr.remove(max_arr)
    
    if(arr[0]**2 + arr[1]**2 == max_arr**2): print("right")
    else: print("wrong")