We'll create an array of booleans, where each element represents a single character and whether it was already found in the target string. 

#Assumptions#
 - The string with be of ASCII characters
    - ASCII defines 128 unique characters

#Optimizations#

 - Return false if a string is greater than 128 characters, as a duplicate must be present
 - If we are setting a character's boolean value to true and already see it is true, we can return false as we've identified a duplicate