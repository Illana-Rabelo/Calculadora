package org.iftm.atividadea2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Teste: Construtor vazio
    @Test
    void testConstrutorVazio() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.getMemoria());
    }

    // Teste: Construtor com parâmetro positivo
    @Test
    void testConstrutorParametroPositivo() {
        Calculadora calc = new Calculadora(3);

        assertEquals(3, calc.getMemoria());
    }

    // Teste: Construtor com parâmetro negativo
    @Test
    void testConstrutorParametroNegativo() {
        Calculadora calc = new Calculadora(-3);

        assertEquals(-3, calc.getMemoria());
    }

    // Testes: Somar
    @Test
    void testSomarPositivo() {
        Calculadora calc = new Calculadora(3);

        calc.somar(5);

        assertEquals(8, calc.getMemoria());
    }

    @Test
    void testSomarNegativo() {
        Calculadora calc = new Calculadora(3);

        calc.somar(-2);

        assertEquals(1, calc.getMemoria());
    }

    // Testes: Subtrair
    @Test
    void testSubtrairNumeroPositivo() {
        Calculadora calc = new Calculadora(10); 
        calc.subtrair(4); 
        assertEquals(6, calc.getMemoria(), "Subtração de número positivo falhou");
    }

    @Test
    void testSubtrairNumeroNegativo() {
        Calculadora calc = new Calculadora(10); 
        calc.subtrair(-3); 
        assertEquals(13, calc.getMemoria(), "Subtração de número negativo falhou");
    }

    // Testes: Multiplicar
@Test
void testMultiplicarValorPositivo() {

    Calculadora calc = new Calculadora(3);
    calc.multiplicar(2);
    assertEquals(6, calc.getMemoria());
}

@Test
void testMultiplicarValorNegativo() {


    Calculadora calc = new Calculadora(3);
    calc.multiplicar(-2);
    assertEquals(-6, calc.getMemoria());
}

    // Testes: Dividir
@Test
void testDividirValorPositivo() throws Exception {

    Calculadora calc = new Calculadora(6);
    calc.dividir(2);
    assertEquals(3, calc.getMemoria());
}

@Test
void testDividirValorNegativo() throws Exception {

    Calculadora calc = new Calculadora(6);
    calc.dividir(-2);
    assertEquals(-3, calc.getMemoria());
}

@Test
void testDividirPorZero() {

    Calculadora calc = new Calculadora(6);

    assertThrows(Exception.class, () -> {
        calc.dividir(0);
    });
}

    // Testes: Exponenciar
@Test
void testExponenciarMaiorQue10() {

    Calculadora calc = new Calculadora(2);

    assertThrows(Exception.class, () -> {
        calc.exponenciar(20);
    });
}

@Test
void testExponenciarPor1() throws Exception {

    Calculadora calc = new Calculadora(2);

    calc.exponenciar(1);

    assertEquals(2, calc.getMemoria());
}

@Test
void testExponenciarPor10() throws Exception {

    Calculadora calc = new Calculadora(2);

    calc.exponenciar(10);

    assertEquals(1024, calc.getMemoria());
}

    // Teste: Zerar memória
    @Test
    void testZerarMemoria() {
        Calculadora calc = new Calculadora(5);

        calc.zerarMemoria();

        assertEquals(0, calc.getMemoria());
    }
}

