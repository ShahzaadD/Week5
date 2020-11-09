
    val nums = 1 to 45
    val sum1 = nums.filter((x: Int) => x % 4 == 0)
    val result = sum1.sum
    println("Sum of the numbers divisible by 4 is " + result)

    def square (x:Int) = x * x
    val num2 = nums.filter((x: Int) => x % 3 ==0 || x < 20)

    val squarefunc = num2.map(square)
    val result2 =squarefunc.sum
    println("Sum of the squares of the numbers divisible by 3 and less than 20 is " + result2)
