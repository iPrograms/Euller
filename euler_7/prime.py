#prime finder
#Euller problem 7

"""
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

"""

for start in xrange(1,11):
    for left in xrange(start,1,-1):
       if(start % left != 0):
           if(left ==1):
                print (start); # prime
           else:
               break
            
