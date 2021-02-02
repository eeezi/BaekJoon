x, y, w, h = map(int, input().split())

if w/2 < x: x_distance = w - x
else: x_distance = x
if h/2 < y: y_distance = h - y
else: y_distance = y

if x_distance < y_distance: print(x_distance)
else: print(y_distance)