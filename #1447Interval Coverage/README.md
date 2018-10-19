#1447 : Interval Coverage
http://hihocoder.com/problemset/problem/1447

时间限制:10000ms

单点时限:1000ms

内存限制:256MB

##描述
You are given N intervals [S1, T1], [S2, T2], [S3, T3], ... [SN, TN] and a range [X, Y]. Select minimum number of intervals to cover range [X, Y].

##输入
The first line contains 3 integers N, X and Y. (1 <= N <= 100000, 1 <= X < Y <= 1000000)

The following N lines each contain 2 integers Si, Ti denoting an interval. (1 <= Si < Ti <= 1000000)

##输出
Output the minimum number of intevals to cover range [X, Y] or -1 if it is impossible.

###样例输入
5 1 5

1 2    
1 3  
2 4  
3 5  
4 5 
###样例输出
2