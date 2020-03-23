package subtask5

class HighestPalindrome {

    fun stringToInt(numberString: String): ArrayList<Int> {
        val outArray = arrayListOf<Int>()
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
        var output = ""
        var invertNumber = mutableListOf<Int>()
        var originNumber = mutableListOf<Int>()
        originNumber = stringToInt(digitString)

        for (change in 0 until k) {
            loop@for (index in 0 until n / 2) {
                if (originNumber[index] != originNumber[n - index - 1] && originNumber[index] < originNumber[n - index - 1]) {
                    originNumber[index] = originNumber[originNumber.size - index - 1]
                    invertNumber = originNumber.reversed().toMutableList()
                    break
                } else if (originNumber[index] != originNumber[n - index - 1] && originNumber[index] > originNumber[n - index - 1]) {
                    originNumber[n - index - 1] = originNumber[index]
                    invertNumber = originNumber.reversed().toMutableList()
                    break
                } else if (originNumber == invertNumber) {
                    for (indexMax in 0 until n / 2) {
                        if (originNumber[indexMax] != 9) {
                            originNumber[indexMax] = 9
                            originNumber[n - indexMax - 1] = 9
                            invertNumber = originNumber.reversed().toMutableList()
                            break@loop
                        }
                    }
                }
            }
        }
        invertNumber = originNumber.reversed().toMutableList()
        if (originNumber != invertNumber) {
            return "-1"
        } else {
            originNumber.forEach { output += it }
        }
        return output

    }
}
