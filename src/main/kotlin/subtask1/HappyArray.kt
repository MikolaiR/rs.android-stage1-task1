package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var outArray = arrayListOf<Int>()
        sadArray.forEach { outArray.add(it) }
        var count: Int = 1
        while (count < outArray.size - 1) {
            if (outArray[count] > outArray.get(count - 1) + outArray.get(count + 1)) {
                outArray.remove(outArray[count])
                count = 1
            }
            count++
        }
        return outArray.toIntArray()
    }
}


