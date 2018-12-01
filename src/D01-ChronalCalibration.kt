
fun main(args: Array<String>) {
    part1()
    part2()
}

fun part1() {
    println(input1.split("\n").map(Integer::parseInt).sum())
}

fun part2() {
    val frequencyChanges = input1.split("\n").map(Integer::parseInt)
    val seenFrequencies = mutableSetOf(0)
    var currentFrequency = 0

    while (true) {
        for (frequencyChange in frequencyChanges) {
            currentFrequency += frequencyChange

            if (currentFrequency in seenFrequencies) {
                println(currentFrequency)
                return
            }

            seenFrequencies.add(currentFrequency)
        }
    }
}
