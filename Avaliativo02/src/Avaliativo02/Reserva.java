package Avaliativo02;

public class Reserva {
    private Hospede hospede;
    private String checkIn;  
    private String checkOut; 
    private int numeroQuartos;
    private String tipoQuarto;
    private boolean checkInRealizado;

    public Reserva(Hospede hospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
        this.hospede = hospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numeroQuartos = numeroQuartos;
        this.tipoQuarto = tipoQuarto;
        this.checkInRealizado = false;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public int getNumeroQuartos() {
        return numeroQuartos; 
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }
    public boolean isCheckInRealizado() {
        return checkInRealizado;
    }

    public void setCheckInRealizado(boolean checkInRealizado) {
        this.checkInRealizado = checkInRealizado;
    }
}
