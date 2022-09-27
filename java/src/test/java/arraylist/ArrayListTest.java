package arraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ArrayListTest {

    @Test
    void Array_add_Should_throw_error() {
        // given
        Integer[] integers = {1, 2, 3};

        // when & then
        // integers.add(4);
        // 위와 같은 경우에는 컴파일 에러가 발생한다.
        assertThat(integers[1]).isEqualTo(2);
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> {
                    int noneExistElement = integers[3];
                }
        );
    }

    @Test
    void List_add_Should_throw_error() {
        // given
        List<Integer> integers = List.of(1, 2, 3, 4);

        // when & then
        assertThrows(
                UnsupportedOperationException.class,
                () -> integers.add(5)
        );
    }

    @Test
    void Arrays_asList_add_Should_throw_error() {
        // given
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        // when & then
        assertThrows(
                UnsupportedOperationException.class,
                () -> integers.add(5)
        );
    }

    @Test
    void Arrays_asList_add_Should_be_added() {
        // given
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // when
        integers.add(5);

        // then
        assertThat(integers.get(4)).isEqualTo(5);
    }

    @Test
    void ArrayList_add_Should_be_added() {
        // given
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        // when
        integers.add(5);

        //  then
        assertThat(integers.get(4)).isEqualTo(5);
    }
}
