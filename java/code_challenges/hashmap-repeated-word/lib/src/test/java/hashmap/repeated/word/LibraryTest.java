/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated.word;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

  public static void main(String[] args) {
    repeatedWordsTest();
  }
    @Test
    static void repeatedWordsTest(){
      assertEquals(RepeatedWord.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York"),"summer");
    }
}
