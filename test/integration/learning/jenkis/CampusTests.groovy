package learning.jenkis

import static org.junit.Assert.*
import org.junit.*

class CampusTests {

    @Before
    void setUp() {
       Campus campus=new Campus()
        campus.descripcion="No pues así y así"
        campus.fechaFinaliza=new Date()
        campus.fechaInicio=new Date()
        campus.nombre="Trololo"
        campus.temario="en el momento se verá"
        campus.horario=10
        campus.save(failOnError: true)
    }

    @After
    void tearDown() {

    }

    @Test
    void testSomething() {

    }
}
