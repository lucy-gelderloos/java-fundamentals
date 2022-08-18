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
  - Parameters: int[] `array`
  - Return type: boolean
  - Takes in an array of integers and returns "true" if any of the values are duplicates
- findAverage
  - Parameters: int[] `array`
  - Return type: float
  - Takes in an array of integers and returns the average of all values as a float
- findLowestAverage
  - Parameters: int[][] `matrix`
  - Return type: int[]
  - Takes in an array of arrays of integers, finds the average of each array, and returns the array with the lowest average
- analyzeTemps
  - Parameters: int[][] `monthTemps`
  - Return type: String
  - Takes in an array of arrays of weekly temperatures and finds the minimum and maximum temperature. It returns a string listing the min and max temps as well as any temperatures within that range that do not appear in the input matrix.
- tally
  - Parameters: ArrayList<String> `votes`
  - Return type: string
  - Takes in an arrayList of votes and returns a string containing the value that appears the most times.

## linter

- lintSemicolons
  - Parameters: String `fileName`
  - Return type: String
  - Takes in the specified file and reads line-by-line. Returns the line number of any line that does not meet at least one of the following criteria: line is blank; line begins with `//`; line contains `if`, `else`, or `for`; or line ends with `{`, `}`, or `;`.
