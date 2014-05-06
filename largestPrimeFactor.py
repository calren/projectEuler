import math

def getLargestPrimeFactor(n):
	for i in range(n/2 - 1, 2, -1) :
		if isFactor(n, i):
			if isPrime(i):
				return i

def isFactor(big, small):
	if big % small == 0:
		return True
	return False
	
def isPrime(n):
	if n % 2 == 0:
		return False
	for i in range(3, n/2 + 1):
		if (n % i == 0):
			return False
	return True
	
print getLargestPrimeFactor(6051475143)
	
