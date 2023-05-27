class CountingSortAlgorithm {
    companion object {
        fun countingSort(array: Array<Int>): Array<Int> {
            val countingArray = IntArray(array.maxOf { it } + 1)

            array.forEach { ++countingArray[it] }

            var cursor = 0
            countingArray.forEachIndexed { index, _ ->
                repeat(countingArray[index]) {
                    array[cursor++] = index
                }
            }
            return array
        }
    }
}