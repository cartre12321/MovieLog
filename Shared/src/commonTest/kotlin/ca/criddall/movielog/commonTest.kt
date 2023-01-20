package ca.criddall.movielog

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(MovieDataFetcher().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}