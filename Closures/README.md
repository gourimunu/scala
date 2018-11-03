Problem : 
You want to pass a Scala function around like a variable, and while doing so, you want that function to be able to refer to one or more fields that were in the same scope as the function when it was declared.

Solution : 
A closure is a function, whose return value depends on the value of one or more variables declared outside this function.