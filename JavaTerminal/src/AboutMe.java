public class AboutMe {
    public static void main(String[] args){

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        /*int idade = Integer.valueOf(args[2]); foi usado esse no exemplo
        double altura = Double.valueOf(args[3]); foi usado esse no exemplo*/

        System.out.println("Olá, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é: " + altura + " cm");

    }


}

