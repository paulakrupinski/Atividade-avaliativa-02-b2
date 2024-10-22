package Avaliativo02;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void realizarReserva(Reserva reserva) {
        boolean quartoReservado = false;
        for (Quarto quarto : quartos) {
        	
      if (quarto.getTipo().equals(reserva.getTipoQuarto()) && quarto.isDisponivel()) {
       quarto.setDisponivel(false);
        reservas.add(reserva);
        quartoReservado = true;
        System.out.println("Reserva realizada para o hóspede: " + reserva.getHospede().getNome());
                return;
            }
        }
        if (!quartoReservado) {
            System.out.println("Nenhum quarto disponível do tipo " + reserva.getTipoQuarto() + " para a reserva.");
        }
    }

    public void realizarCheckIn(String nomeHospede) {
        for (Reserva reserva : reservas) {
         if (reserva.getHospede().getNome().equals(nomeHospede) && !reserva.isCheckInRealizado()) {
        	 
            for (Quarto quarto : quartos) {
            if (quarto.getTipo().equals(reserva.getTipoQuarto()) && !quarto.isDisponivel()) {
               reserva.setCheckInRealizado(true);
        System.out.println("Check-in realizado para o hóspede: " + reserva.getHospede().getNome());
             return;
                    }
                }
         System.out.println("Quarto do tipo " + reserva.getTipoQuarto() + " não está disponível.");
        return;
            }
        }
        System.out.println("Reserva não encontrada para o hóspede: " + nomeHospede);
    }

    public void realizarCheckOut(String nomeHospede) {
        for (Reserva reserva : reservas) {
        	
      if (reserva.getHospede().getNome().equals(nomeHospede) && reserva.isCheckInRealizado()) {
        for (Quarto quarto : quartos) {
         if (quarto.getTipo().equals(reserva.getTipoQuarto()) && !quarto.isDisponivel()) {
               quarto.setDisponivel(true);
               reserva.setCheckInRealizado(false);
          System.out.println("Check-out realizado para o hóspede: " + nomeHospede);
             return;
                    }
                }
            }
        }
        System.out.println("Nenhum hóspede encontrado para check-out com o nome: " + nomeHospede);
    }

    public void relatorioOcupacao() {
        int quartosOcupados = 0;
        System.out.println("Relatório de Ocupação:");
        for (Reserva reserva : reservas) {
            if (reserva.isCheckInRealizado()) {
                quartosOcupados++;
                System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                        ", Quarto: " + reserva.getTipoQuarto() +
                        ", Check-in: " + reserva.getCheckIn() +
                        ", Check-out: " + reserva.getCheckOut());
            }
        }
        System.out.println("Número de quartos ocupados: " + quartosOcupados);
    }

    public void relatorioHistoricoReservas() {
        System.out.println("Histórico de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                    ", Check-in: " + reserva.getCheckIn() +
                    ", Check-out: " + reserva.getCheckOut() +
                    ", Número de quartos: " + reserva.getNumeroQuartos() +
                    ", Tipo de quarto: " + reserva.getTipoQuarto());
        }
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}