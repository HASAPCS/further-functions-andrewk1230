package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        return a+b; // Replace with your implementation

    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String str) {
        String word = "";
        for(int i = str.length()-1; i>=0;i--){
            word += str.charAt(i);
        }
        return word; // Replace with your implementation
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"
    public String greeting(String name) {

        return "Hello, "+name+"!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        int max;
        max = arr[0];
        for(int a : arr ){
            if (a>max){
                max = a;
            }
        }

        return max; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        boolean ans = false;
        String word = "";
        for(int i =str.length()-1; i>=0;i--){
            word += str.charAt(i);
        }
        if (str.equals(word)){
            ans = true;
        }

        return ans; // Replace with your implementation
    }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        int count = 0;
        int iIni = 0;
        int nCount = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                if(nCount>count){
                    count = nCount;
                    iIni = i-nCount+1;
                }
                nCount = 0;
            }
            nCount++;
        }
        return str.substring(iIni, iIni+count-1); // Replace with your implementation
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum+=num;
            count++;
        }
        double avg = sum/count;
        return avg; // Replace with your implementation
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        for(int i = 2; i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        double nBase = base;
        for(int i = 0;i<exponent-1; i++){
            nBase*=base;
        }
        return nBase; // Replace with your implementation
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count; // Replace with your implementation
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        int num = nums[1];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>num){
                num = nums[i];
            }
        }

        return num; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        return sum; // Replace with your implementation
    }

    
}
