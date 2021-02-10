def BinarySearch(arr, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if target == arr[mid]:
            return 1
        elif target > arr[mid]:
            start = mid + 1
        else: end = mid - 1
    return 0

n = int(input())
A = list(map(int, input().split()))
m = int(input())
B = list(map(int, input().split()))
A = sorted(A)

for i in range(m):
    print(BinarySearch(A, B[i], 0, n-1))