
"""
   Find all even fibonacci numbers from 0 to 4 million, and add them togher  
   @Author Manzoor Ahmed
   @Date 07/29/2013
   @Version 1.0
   Euller project problem #2
"""

""""
fibinacci numbers always start with 0,1 and the next number is generated
by added the last tow terms, ie the third term would be 0+1=1
"""

first = 0;  
second =1;
fib =0;
total =0;
count = 0;

while(fib <4000000):

    fib = first+second;
    first = second;
    second = fib;
    count = count+1;

    if(fib%2 ==0):
        total = total+fib;
        print("------------------------------");
        print(count, total);
        print("*");
        







