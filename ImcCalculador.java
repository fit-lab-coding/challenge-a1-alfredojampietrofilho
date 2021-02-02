package main.java.fit.challenge;
import java.util.*;
import java.lang.Math;
import java.lang.*;

public class ImcCalculador {
    
    public static String Calculador(double peso, double altura) {

        double alturaQuadrado = Math.pow(altura, 2);
        double imc = peso / alturaQuadrado;

        System.out.println(peso + "," + altura);
        System.out.println(alturaQuadrado);

        if (imc < 18.5) return "Magreza";
        if (imc >= 18.5 && imc < 25) return "Normal";
        if (imc >= 25 && imc < 30) return "Sobrepeso";
        if (imc >= 30 && imc < 40) return "Obesidade";
        if (imc > 40) return "Obesidade Grave";

        return null;
    }
}
