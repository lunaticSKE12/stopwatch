# stopwatch


Tasks by Napong Dungduangsasitorn (5710546216)

I ran the tasks on a Lenovo Y700, and got these results:

Task                                    | Time 
----------------------------------------|-------:
Append  50,000 chars to String          |  0.994450 sec
Append 100,000 chars to String          |  2.963803 sec
Append 100,000 chars to StringBuilder   |  0.002281 sec
Add 1 billion double using array        |  1.615375 sec
Add 1 billion Double object using array |  6.849823 sec
Add 1 billion BigDecimal using array    |  9.810648 sec

## Explanation of Results 

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

Because task 2X then it must use 2X time.

Why is appending to StringBuilder so much different than appending to String?  What is happening to the String?

StringBuilder object are mutable, they offer better performance than string object of type System.String, 
when heavy string manipulation is involved. String is immutable once created, can not be modified, 
so string is slow and consumes more memory when use too many string because every time it create new instance.
 
Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why? 

double is faster because double is a primitive type whereas Double is an Object so Double need create new object to use,
 BigDecimal it can represent numbers to as many bits of precision as you want to throw memory and time at.