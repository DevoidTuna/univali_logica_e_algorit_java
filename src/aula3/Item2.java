package aula3;

/**
 * 2. Crie um programa que calcule o perímetro e o raio de um círculo.
 */
class Item2 {
    void main() {
        double raio, area, perimetro;

        raio = 20;
        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Raio: " + raio + "\nÁrea: " + area + "\nPerímetro: " + perimetro);
    }
}