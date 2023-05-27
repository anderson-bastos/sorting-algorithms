import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountingSortAlgorithmTest {
    @Test
    fun `Should sort array of integers using counting sort algorithm`() {
        Assertions.assertArrayEquals(
            arrayOf(1, 2, 3, 4), CountingSortAlgorithm.countingSort(arrayOf(3, 2, 1, 4))
        )
    }

    @Test
    fun `Should sort array of repeated integers using counting sort algorithm`() {
        Assertions.assertArrayEquals(
            arrayOf(1, 2, 3, 4, 4, 6), CountingSortAlgorithm.countingSort(arrayOf(3, 2, 6, 4, 1, 4))
        )
    }
}