// C++ program for n-th  
// element of Newman-Conway Sequence 
#include <bits/stdc++.h> 
using namespace std; 
  
// Recursive Function to find the n-th element 
int sequence(int n) 
{ 
    if (n == 1 || n == 2) 
        return 1; 
    else
        return sequence(sequence(n - 1))  
                + sequence(n - sequence(n - 1)); 
} 
  
// Driver Program 
int main() 
{ 
    int n = 10; 
    cout << sequence(n); 
    return 0; 
} 
