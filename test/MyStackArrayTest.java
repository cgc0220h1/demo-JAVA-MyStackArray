import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackArrayTest {
    private MyStackArray<Integer> listInteger;

    @BeforeEach
    void newStack() {
        listInteger = new MyStackArray<>();
    }

    @DisplayName("Trả về size sau khi add thêm đối tượng")
    @Test
    void testSize() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        int expectedSize = 3;
        int actualSize = listInteger.size();
        assertEquals(expectedSize, actualSize);
    }

    @DisplayName("Thêm đối tượng khi stack đã đầy")
    @Test
    void testPushWhenStackFull() {
        listInteger = new MyStackArray<>(3);
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        boolean actualResult = listInteger.push(4);
        int expectedSize = 3;
        int actualSize = listInteger.size();
        assertEquals(false, actualResult);
        assertEquals(expectedSize, actualSize);
    }

    @DisplayName("Đẩy đối tượng ra khỏi stack")
    @Test
    void testPop() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        int value = listInteger.pop();
        int expectedValue = 3;
        assertEquals(expectedValue, value);
    }

    @DisplayName("Vij tris của con trỏ rearPointer sau khi đẩy đối tượng")
    @Test
    void testRearPointerPositionAfterPop() {
        listInteger.push(1);
        listInteger.push(2);
        listInteger.push(3);
        listInteger.pop();
        int expectedPosition = 1;
        int actualPosition = listInteger.getRearPointerPosition();
        assertEquals(expectedPosition,actualPosition);
    }

    @DisplayName("Đẩy đối tượng ra khỏi stack khi stack trống")
    @Test
    void testPopWhenStackEmpty() {
        Object value = listInteger.pop();
        assertNull(value);
    }
}