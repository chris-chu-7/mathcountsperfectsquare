# mathcountsperfectsquare

This algorithm implementation solves a classic MathCounts problem that my brother was having trouble solving. 

Given an nxn square, what is the maximum amount of squares that can be formed out of the indices. The solution entails the following algorithm. For example, out of a 2x2 square, for each
index i,j, one 1x1 and one 2x2 square can be formed. Since there are 4 squares of unit 1 inside the 2x2 square,
the total amount of squares formed is 8. 

Algorithm runs in O(n^3) and takes O(1) space. O(n^2) for to iterate over each square of unit one, and O(k) to iterate
every each number from k = 1..n to see how many squares of size k*k can be formed from a particular index. O(1) space
because of the automatic garbage disposal methods of java.

The strategy is to try and imagine an "imaginary" square pivoting around a corresponding width along the axis at point(x,y). Therefore, the
number of squares with length n involved at point x and y is the number of squares you can "pivot" a square of a particular size around. 
