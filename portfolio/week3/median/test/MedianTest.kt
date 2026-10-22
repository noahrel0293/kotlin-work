// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median should be 3" {
        median(listOf(1.0f, 3.0f, 2.0f)) shouldBe 3.0f
    }

    "Median should be 5.6" {
        median(listOf(1.3f, 5.6f, 4.88f, 4.56f)) shouldBe 5.6f
    }

    "Median should be 2.2" {
        median(listOf(2.2f)) shouldBe 2.2f
    }

    "Median should be 8" {
        median(listOf(8.0f, 3.0f)) shouldBe 8.0f
    }

})
