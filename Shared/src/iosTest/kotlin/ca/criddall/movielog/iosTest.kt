package ca.criddall.movielog

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(MovieDataFetcher().greet().contains("iOS"), "Check iOS is mentioned")
    }
}