n = int(input())
member_list = []

for i in range(n):
    member_age, member_name = map(str, input().split())
    member_age = int(member_age)
    member_list.append((member_age, member_name))

member_list.sort(key = lambda member: (member[0]))

for age, name in member_list:
    print(age, name)