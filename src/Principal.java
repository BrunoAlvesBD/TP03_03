public class Principal {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua do sossego", 696, " área mais afastada do bairro ",
                "Bairro Sul ", "Curitiba", "PR", "945.623-78" );
        Aluno aluno1 = new Aluno("9696", "Bruno","439919191",endereco1);

        Endereco endereco2 = new Endereco("Rua das águas", 552, "próximo a praia",
                "Bairro Quadrado ", "Ilha Comprida", "SP", "532.497-56" );
        Aluno aluno2 = new Aluno("0010", "Joãozinho", "987654321", endereco2);

        System.out.println(aluno1);
        System.out.println();
        System.out.println(aluno2);
    }
}
