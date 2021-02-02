package fit.challenge;

import main.java.fit.challenge.ImcCalculador;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testes unitários para o "desafio"
 */
public class AppTest 
{
    /**
     * Vamos garantir a estrutura do projeto que queremos
     */
    @Test
    public void shouldHaveCalculateAsStaticMethodOfImcCalculatorClass()
    {
        String resultado = ImcCalculador.Calculador(88, 1.77); //28.08
        Assert.assertEquals(resultado, "Sobrepeso");
    }

    // Vamos garantir os valores limitrofes (superior)

    @Test
    public void shouldCalculateMaxAtMagrezaLayer()
    {
        String resultado = ImcCalculador.Calculador(57.92, 1.77);
        Assert.assertEquals(resultado, "Magreza");
    }

    @Test
    public void shouldCalculateMaxAtNormalLayer()
    {
        String resultado = ImcCalculador.Calculador(77.97, 1.77);
        Assert.assertEquals(resultado, "Normal");
    }

    @Test
    public void shouldCalculateMaxAtSobrepesoLayer()
    {
        String resultado = ImcCalculador.Calculador(93.98, 1.77);
        Assert.assertEquals(resultado, "Sobrepeso");
    }

    @Test
    public void shouldCalculateMaxAtObesidadeLayer()
    {
        String resultado = ImcCalculador.Calculador(94.00, 1.77);
        Assert.assertEquals(resultado, "Obesidade");
    }
}
