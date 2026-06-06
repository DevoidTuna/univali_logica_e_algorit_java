package aula5;

/**
 * Exercício 04:
 * Pode entrar no brinquedo?
 * Um parque possui um brinquedo que só permite entrada se:
 * • A pessoa tiver altura ≥ 1.40
 * • E idade ≥ 10
 * Utilize uma flag chamada:
 * podeEntrar
 * Se puder entrar:
 * Apresente a mensagem: “Entrada permitida”
 * Caso contrário:
 * Apresente a mensagem: “Entrada não permitida”
 */
public class Item4 {
    void main() {
        double altura = 1.39;
        int idade = 10;

        boolean podeEntrar = idade >= 10 && altura >= 1.40;

        String message;
        if (podeEntrar) {
            message = "Entrada permitida";
        } else {
            message = "Entrada não permitida";
        }

        System.out.println(message);
    }
}
