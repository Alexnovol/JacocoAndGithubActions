import org.example.BoundaryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoundaryServiceTest {

    private BoundaryService boundaryService = new BoundaryService();


    @ParameterizedTest(name = "{index}: Число {1} минимальное в {0}")
    @MethodSource("argsProviderFactoryForPositiveChecks")
    public void shouldReturnMinNum(int[] numbers, int minNum) {
        assertEquals(minNum, boundaryService.findMin(numbers));
    }

    @Test
    @DisplayName("Возникает исключение, если массив пуст")
    public void shouldThrowExceptionWithEmptyArray() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> boundaryService.findMin(new int[0]));
    }

    static Stream<Arguments> argsProviderFactoryForPositiveChecks() {
        int[] numbers1 = {20, 1, 50, 60, 5};
        int[] numbers2 = new int[3];
        return Stream.of(Arguments.of(numbers1, Arrays.stream(numbers1).min().getAsInt()),
                Arguments.of(numbers2, Arrays.stream(numbers2).min().getAsInt()));
    }


}