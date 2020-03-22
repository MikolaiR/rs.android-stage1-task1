package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {
        var charArray = charArrayOf()
        charArray = inputString.toCharArray()
        var outString: ArrayList<String> = arrayListOf()
            for ((index, char) in charArray.withIndex()) {
                if (char == '<') {
                    var closeAngelBracket = charArray.indexOf('>')
                    var str = inputString.substring(index + 1, closeAngelBracket)
                    var count = str.indexOf('<')
                    if (closeAngelBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeAngelBracket))
                        charArray.set(closeAngelBracket, '-')
                    }
                    if (closeAngelBracket > 0 && count > 0) {
                        charArray.set(closeAngelBracket,'-')
                        var nextCloseAngelBracket = charArray.indexOf('>')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        charArray.set(nextCloseAngelBracket, '-')
                        charArray.set(closeAngelBracket,'>')
                    }
                }

                if (char == '[') {
                    var closeAngelBracket = charArray.indexOf(']')
                    var str = inputString.substring(index + 1, closeAngelBracket)
                    var count = str.indexOf('[')
                    if (closeAngelBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeAngelBracket))
                        charArray.set(closeAngelBracket, '-')
                    }
                    if (closeAngelBracket > 0 && count > 0) {
                        charArray.set(closeAngelBracket,'-')
                        var nextCloseAngelBracket = charArray.indexOf(']')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        charArray.set(nextCloseAngelBracket, '-')
                        charArray.set(closeAngelBracket,']')
                    }
                }
                if (char == '(') {
                    var closeAngelBracket = charArray.indexOf(')')
                    var str = inputString.substring(index + 1, closeAngelBracket)
                    var count = str.indexOf('(')
                    if (closeAngelBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeAngelBracket))
                        charArray.set(closeAngelBracket, '-')
                    }
                    if (closeAngelBracket > 0 && count > 0) {
                        charArray.set(closeAngelBracket,'-')
                        var nextCloseAngelBracket = charArray.indexOf(')')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        charArray.set(nextCloseAngelBracket, '-')
                        charArray.set(closeAngelBracket,')')
                    }
                }

            }
        return outString.toTypedArray()
    }
}
