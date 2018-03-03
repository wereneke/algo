# algo

####binSearch
------------------------------------------------------------------------
For a given list of integers find given value in it.
Write a program that will be binary search algorithm. 
It should be a method that take on input list of integers 
and value that we are looking for and returns true or false: 
true if value is found in given list otherwise false.


####Flattening
-------------------------------------------------------------------------
Write a program that will take on input list (it might contains different type of objects) and returns flatten list.
Input list may be multidimensional.
Example :

For given list:

[ 1, 3, ["age", 5], "Kraków", [1, [3, [4, 5], "codecool"], 6, 7]]

the output should be:

[1, 3, "age", 5, "Kraków", 1, 3, 4, 5, "codecool", 6, 7]


####counter out
-------------------------------------------------------------------------
It is a K-long sequence of syllables after all, and play this game repeatedly:
N children stand in a circle, and they count from 1 to K starting from Player #1. 
This time Player #K gets excluded. They continue counting from the next player, 
#(K+1), and after each round one player leaves the circle. After N-1 rounds there will be one player standing, who wins the game.

The outcome of this game for N and K is the sequence of the excluded numbers. For example, in case of N = 5, K = 3 the solution is [3, 1, 5, 2, 4]. In a more verbose form:

starting from 1 --> [1 2 3 4 5] --> 3 is out -->
starting from 4 --> [1 2    4 5] --> 1 is out -->
starting from 2 --> [   2    4 5] --> 5 is out -->
starting from 2 --> [   2    4   ] --> 2 is out --> [4] wins
