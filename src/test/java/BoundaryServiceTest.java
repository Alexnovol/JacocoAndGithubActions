import org.example.BoundaryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryServiceTest {

    private BoundaryService boundaryService = new BoundaryService();

    @Test
    @DisplayName("Метод findMin возвращает минимальное число массива")
    public void shouldReturnMinNum() {
        int[] nums = {5, 2, 6, 7, 8, 9, 10, 100, 25};
        assertEquals(2, boundaryService.findMin(nums));
    }
}
