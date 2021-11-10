package service

import model.Student
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

    @Test

    fun findStudentTest() {

        val findStudent = StudentService()

        val estudante = Student("171", "john", "john@john", null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("171"))
    }

}