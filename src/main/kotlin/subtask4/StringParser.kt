package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var inputChar:CharArray = inputString.toCharArray()
        var outString: ArrayList<String> = arrayListOf()
            for ((index, char) in inputChar.withIndex()) {
                if (char == '<') {
                    var closeBracket = inputChar.indexOf('>')
                    var processedText = inputString.substring(index + 1, closeBracket)
                    var count = processedText.indexOf('<')
                    if (closeBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeBracket))
                        inputChar.set(closeBracket, '-')
                    }
                    if (closeBracket > 0 && count > 0) {
                        inputChar.set(closeBracket,'-')
                        var nextCloseAngelBracket = inputChar.indexOf('>')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        inputChar.set(nextCloseAngelBracket, '-')
                        inputChar.set(closeBracket,'>')
                    }
                }

                if (char == '[') {
                    var closeBracket = inputChar.indexOf(']')
                    var processedText = inputString.substring(index + 1, closeBracket)
                    var count = processedText.indexOf('[')
                    if (closeBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeBracket))
                        inputChar.set(closeBracket, '-')
                    }
                    if (closeBracket > 0 && count > 0) {
                        inputChar.set(closeBracket,'-')
                        var nextCloseAngelBracket = inputChar.indexOf(']')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        inputChar.set(nextCloseAngelBracket, '-')
                        inputChar.set(closeBracket,']')
                    }
                }
                if (char == '(') {
                    var closeBracket = inputChar.indexOf(')')
                    var processedText = inputString.substring(index + 1, closeBracket)
                    var count = processedText.indexOf('(')
                    if (closeBracket > 0 && count < 0) {
                        outString.add(inputString.substring(index + 1, closeBracket))
                        inputChar.set(closeBracket, '-')
                    }
                    if (closeBracket > 0 && count > 0) {
                        inputChar.set(closeBracket,'-')
                        var nextCloseAngelBracket = inputChar.indexOf(')')
                        outString.add(inputString.substring(index + 1, nextCloseAngelBracket))
                        inputChar.set(nextCloseAngelBracket, '-')
                        inputChar.set(closeBracket,')')
                    }
                }
            }
        return outString.toTypedArray()
    }
}
