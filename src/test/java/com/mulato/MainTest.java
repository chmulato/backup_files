/**
 * Teste unitário para o método main da classe Main.
 * Garante que a aplicação inicia sem lançar exceções.
 */
package com.mulato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MainTest {

    @Test
    void testMainRunsWithoutException() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}