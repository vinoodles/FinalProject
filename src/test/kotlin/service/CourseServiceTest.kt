package service

import org.junit.Test
import org.junit.jupiter.api.Assertions.*



internal class CourseServiceTest
{
    @Test

    fun showSummaryTest ()
    {
        var ssuma = CourseService()

        assertEquals(null, ssuma.getCourse("INTRO-CS-777"))

    }

}