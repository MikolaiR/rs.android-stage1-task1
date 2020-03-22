package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var count: Int = 0
        var output: ArrayList<Int> = arrayListOf<Int>(0, 0)
        while (count < input.size) {
            if (output[0] > input.sum() - input[count] || output[0] == 0) {
                output[0] = input.sum() - input[count]
                println(output.get(0))
            }
            if (output[1] < input.sum() - input[count]) {
                output[1] = input.sum() - input[count]
            }
            count++
        }
        return output.toIntArray()
    }
}
