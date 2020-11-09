
val list = List(1,2,3,4,5,6,7,8,9)
val oddnums = list.filter((x:Int) => x%2!=0)
for (oddnum <- oddnums)
  println(oddnum)

def cube(x: Int) = {x * x * x}
val cubefunc = oddnums.map(cube)
println(cubefunc)
