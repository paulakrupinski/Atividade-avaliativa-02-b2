package Avaliativo02;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("1. Cadastrar Quarto");
            System.out.println("2. Fazer Reserva");
            System.out.println("3. Realizar Check-in");
            System.out.println("4. Realizar Check-out");
            System.out.println("5. Relatório de Ocupação");
            System.out.println("6. Histórico de Reservas");
            System.out.println("7. Sair");
            
            int opcao = scanner.nextInt();
            
            scanner.nextLine();  

            switch (opcao) {
            case 1:
            System.out.println("Número do quarto:");
                int numero = scanner.nextInt();
                scanner.nextLine();
             System.out.println("Tipo de quarto:");
             System.out.println("1. Solteiro");
             System.out.println("2. Casal");
             System.out.println("3. Suíte");
                
             int tipoEscolha = scanner.nextInt();
                String tipo = "";
                
                switch (tipoEscolha) {
                 case 1: tipo = "solteiro"; break;
                  case 2: tipo = "casal"; break;
                  case 3: tipo = "suite"; break;
                  default: System.out.println("Tipo inválido."); continue;
            }
                System.out.println("Preço diário:");
                
                double preco = scanner.nextDouble();
                
                hotel.cadastrarQuarto(new Quarto(numero, tipo, preco));
                
                System.out.println("Quarto cadastrado!!");
                break;

                case 2:
                    System.out.println("Nome do hóspede:");
                    String nomeHospede = scanner.nextLine();
                    System.out.println("Data de check-in (Dia/Mes/ano):");
                    String checkIn = scanner.nextLine();
                    System.out.println("Data de check-out (Dia/Mes/ano:");
                    String checkOut = scanner.nextLine();
                    System.out.println("Número de quartos reservados:");
                    
                    int numeroQuartos = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Tipo de quarto reservado:");
                    System.out.println("1. Solteiro");
                    System.out.println("2. Casal");
                    System.out.println("3. Suíte");
                    int tipoQuartoEscolha = scanner.nextInt();
                    String tipoQuarto = "";
                    switch (tipoQuartoEscolha) {
                        case 1: tipoQuarto = "solteiro"; break;
                        case 2: tipoQuarto = "casal"; break;
                        case 3: tipoQuarto = "suite"; break;
                        default: System.out.println("Tipo inválido"); continue;
                    }
                    hotel.realizarReserva(new Reserva(new Hospede(nomeHospede), checkIn, checkOut, numeroQuartos, tipoQuarto));
                    System.out.println("Reserva realizada com sucesso!");
                    break;

                case 3:
                    System.out.println("Nome do hóspede para check-in:");
                    String nomeCheckIn = scanner.nextLine();
                    hotel.realizarCheckIn(nomeCheckIn);
                    break;

                case 4:
                    System.out.println("Nome do hóspede para check-out:");
                    String nomeCheckOut = scanner.nextLine();
                    hotel.realizarCheckOut(nomeCheckOut);
                    break;

                case 5:
                    hotel.relatorioOcupacao();
                    break;

                case 6:
                    hotel.relatorioHistoricoReservas();
                    break;

                case 7:
                    System.exit(0);
                	//scanner.close();
            }
        }
    }
}