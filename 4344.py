c = int(input())

for i in range(c):
    arr = list(map(int, input().split()))
    avg = sum(arr[1:]) / arr[0]
    count = 0

    for i in arr[1:]:
        if(i > avg):
            count += 1
    
    per = (count/arr[0])*100
    print(f'{per:.3f}%')


