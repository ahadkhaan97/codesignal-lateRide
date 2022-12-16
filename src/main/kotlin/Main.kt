fun main() {
    print(solution(240))
}

fun solution(n: Int): Int {
    var time = "${n / 60}"
    time += "${n - (time.toInt() * 60)}"

    var sum = 0

    for (i in time.indices) {
        sum += time[i].digitToInt()
    }

    return sum
}