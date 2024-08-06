package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"2"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    void whenManyValidInput() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"0", "1", "2", "3", "4"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
        int selected1 = validateInput.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        int selected2 = validateInput.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(2);
        int selected3 = validateInput.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(3);
        int selected4 = validateInput.askInt("Enter menu:");
        assertThat(selected4).isEqualTo(4);
    }

    @Test
    void whenValidInputMinus() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"-3"}
        );
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-3);
    }

}