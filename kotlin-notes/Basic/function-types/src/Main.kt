// Defining a function type that takes two integers and returns their sum
val add: (Int, Int) -> Int = { a, b -> a + b }

// Defining a function type that takes two integers and returns their product
val multiply: (Int, Int) -> Int = { a, b -> a * b }

// Using the function types by calling add and multiply
println(add(3, 4))        // Outputs: 7
println(multiply(3, 4))   // Outputs: 12