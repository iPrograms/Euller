'''
Manzoor Ahmed
Euler problem 6
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten
natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one
hundred natural numbers and the square of the sum.

'''

current_power=0
current_number=0

for x in range(1,101):

    current_power+= pow(x,2)
    current_number+=x
    
    #print(x,current_power)
    answer = current_power
    answer1 = pow(current_number,2)
    #print(pow(current_number,2))
    print(answer1-answer)      
