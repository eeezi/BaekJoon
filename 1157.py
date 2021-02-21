n = input().upper()
n_set = list(set(n))
n_cnt = []

for i in range(len(n_set)):
    n_cnt.append(n.count(n_set[i]))

if n_cnt.count(max(n_cnt)) > 1:
    print('?')
else:
    print(n_set[n_cnt.index(max(n_cnt))])