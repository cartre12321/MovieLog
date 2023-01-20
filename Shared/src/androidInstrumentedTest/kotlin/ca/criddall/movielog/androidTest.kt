package ca.criddall.movielog

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidMovieDataFetcherTest {

    private val mainScope = MainScope()

    @Test
    fun testExample() {
        mainScope.launch {
            assertTrue("Check Android is mentioned", MovieDataFetcher().getFact().lowercase().contains("cat"))
        }
    }
}