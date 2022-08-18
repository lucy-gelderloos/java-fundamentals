# Linter

- lintSemicolons
    - Parameters: String `fileName`
    - Return type: String
    - Takes in the specified file and reads line-by-line. Returns the line number of any line that does not meet at least one of the following criteria: line is blank; line begins with `//`; line contains `if`, `else`, or `for`; or line ends with `{`, `}`, or `;`. **Note** Currently only works for files in the specified absolute file path.
