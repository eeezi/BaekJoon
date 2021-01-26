a, b, v = map(int, input().split())

x = (v-b) / (a-b)
# 마지막 날에는 미끄러질 필요가 없음 -> (v-b)

if (v-b) % (a-b) == 0:
    print(int(x))
else: print(int(x) + 1)