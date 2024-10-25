// Function type (Int, Int) -> Int, which takes two integers and returns an integer
val add: (Int, Int) -> Int = { a, b -> a + b }
val multiply: (Int, Int) -> Int = { a, b -> a * b }

// Prints result of using add and multiply with function types
println(add(3, 4))        // Outputs: 7
println(multiply(3, 4))   // Outputs: 12