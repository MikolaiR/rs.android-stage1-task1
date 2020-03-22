package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum: Int = 0
        val b_actual = (bill.sum() - bill[k]) / 2
        if (b_actual - b == 0) {
            return "Bon Appetit"
        } else sum = b - b_actual
        return "$sum"
    }
}
