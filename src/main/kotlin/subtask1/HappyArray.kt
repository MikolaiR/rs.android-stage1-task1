package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var outArray = arrayListOf<Int>()
        sadArray.forEach { outArray.add(it) }
        var counte: Int = 1
        while (counte < outArray.size - 1) {
            if (outArray[counte] > outArray.get(counte - 1) + outArray.get(counte + 1)) {
                outArray.remove(outArray[counte])
                counte = 1
            }
            counte++
        }
        return outArray.toIntArray()
    }
}


