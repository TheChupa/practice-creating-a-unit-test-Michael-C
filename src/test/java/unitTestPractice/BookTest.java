package unitTestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
@Test
    public void testBookCreation(){
    String msg = "Check if book constructor is functioning";
    String expected = "Book: LOTR by J.R.R. Made-Up (2025) - 100 pages";
    Book result = new Book("LOTR", "J.R.R. Made-Up", 2025, 100);
    assertEquals(expected, result.toString(), msg);

}
@Test
public void testBookRead(){
    String msg = "Check if book reading method is functiong";
    Book test = new Book("Test", "Test", 2026, 100000);
    String result = test.readBook();
    assertNull(result, msg);
}

}
