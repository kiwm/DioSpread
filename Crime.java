import java.util.*;

public class Crime {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Telefonou para a vítima? (s/n)");
        perguntas.add(sc.next());
        System.out.println("Esteve no local do crime? (s/n)");
        perguntas.add(sc.next());
        System.out.println("Mora perto da vítima? (s/n)");
        perguntas.add(sc.next());
        System.out.println("Devia para a vítima? (s/n)");
        perguntas.add(sc.next());
        System.out.println("Já trabalho com a vítima? (s/n)");
        perguntas.add(sc.next());

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            if (Objects.equals(pergunta, "s")) {
                respostasPositivas++;
            }
        }
        String periculosidade = "";
        if (respostasPositivas == 2) {
            periculosidade = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            periculosidade = "Cúmplice";
        } else if(respostasPositivas == 5) {
            periculosidade = "Assassina";
        } else {
            periculosidade = "Inocente";
        }
        System.out.println("Periculosidade: " + periculosidade);
    }
}
