string = input()
suffix = []
for i in range(len(string)):
    suffix.append(string[i:])

print('\n'.join(sorted(suffix)))