package subtask5

class HighestPalindrome {

    fun stringToInt(numberString: String): ArrayList<Int> {
        var outArray = arrayListOf<Int>()
        var count = 0
        var numberASCI: Int = 0
        while (count < numberString.length) {
            if (numberString[count].isDigit()) {
                numberASCI = numberString[count].toInt()
                outArray.add(numberASCI - 48)
            } else "Pleas enter to number"
            count++
        }
        return outArray
    }

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var count = 0
        var output = ""
        var invertNumber = mutableListOf<Int>()
        var originNumber = mutableListOf<Int>()
        originNumber = stringToInt(digitString)
        invertNumber = originNumber.reversed().toMutableList()
        var maxValue = originNumber.max()

        while (count <= k) {
            for (index in 0 until invertNumber.size) {
                if (invertNumber[index] != originNumber[index] && invertNumber[index] > originNumber[index]) {
                    if (maxValue != null) {
                        originNumber[index] = maxValue
                        invertNumber = originNumber.reversed().toMutableList()
                        break
                    }
                } else if (originNumber == invertNumber) {
                    break
                }
            }
            count++
        }
        if (originNumber != invertNumber) {
            return "-1"
        }else {
            originNumber.forEach{output += it }
        }
        return output
    }
}
