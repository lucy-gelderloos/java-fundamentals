# Java Fundamentals

## basics

- pluralize
  - Parameters: String `word`, int `num`
  - Return type: String
  - If `num` is zero or greater than one, returns `word` with "s" appended to the end; otherwise returns `word`
- flipNHeads
  - Parameters: int `n`
  - Return type: String
  - Simulates coin flips until the number of heads flipped in a row reaches `n`, then returns a string "It took ___ flips to flip `n` heads in a row."
- clock
  - Return type: String
  - Prints the current time to the console, updating every second until manually terminated

## basicLibrary

- roll
  - Parameters: int `n`
  - Return type: int[]
  - Simulates rolling a six-sided die `n` times and returns the results of each roll in an array
- containsDuplicates
  - Parameters: int[]
  - Return type: boolean
  - Takes in an array of integers and returns "true" if any of the values are duplicates
- findAverage
  - Parameters: int[]
  - Return type: float
  - Takes in an array of integers and returns the average of all values as a float
- findLowestAverage
  - Parameters: int[][]
  - Return type: int[]
  - Takes in a matrix of arrays of integers, finds the average of each array, and returns the array with the lowest average
