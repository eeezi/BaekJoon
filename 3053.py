import math

R = int(input())
euclidean = (R**2) * math.pi
taxicab = (R**2) * 2
print("%.6f\n%.6f" % (euclidean, taxicab))