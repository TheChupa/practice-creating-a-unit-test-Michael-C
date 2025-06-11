package unitTestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryItemTest {


    @Test
    public void testLibraryItemCreation(){
        String msg = "Check if Library Item constructor is functioning";
        String expected = "Item: LOTR by J.R.R. Made-UP (2025)";
        LibraryItem result = new LibraryItem("LOTR", 2025, "J.R.R. Made-UP");

        assertEquals(expected, result.toString(), msg);

    }


}
