// leetcode 1299
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {

        
        int maxv = -1 ;
        
        for (int i = arr.size()-1 ; i >= 0 ; i--) {
            int t = maxv;
            if (arr.at(i) >= maxv) {
                maxv = max(maxv,arr.at(i));
                
            } 
            
                arr.at(i) = t;
            
            
        }

        return arr;
        
    }
};

int main() {
    std::cout << "This is Leetcode 1299 begin .." << std::endl ;

    Solution s ;

    vector<int> v1{17,18,5,4,6,1} ;

    vector<int> arr = s.replaceElements(v1);

    for (int i = 0 ; i < arr.size() ; i++) {
            cout << arr.at(i) << endl ;

    }


    std::cout << "This is Leetcode 1299 begin .." << std::endl ;
}
