package ca.criddall.movielog

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    private val mainScope = MainScope()
    @Test
    fun testExample() {
        mainScope.launch {
            assertTrue(MovieDataFetcher().getFact().lowercased().contains("iOS"), "Check iOS is mentioned")
        }
    }
}