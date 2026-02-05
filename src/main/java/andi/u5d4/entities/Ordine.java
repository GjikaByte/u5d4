package andi.u5d4.entities;


import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Ordine {
    private Tavolo tavolo;
    private List<Item> elementoMenu;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDate oraAcquisizione;
    private double costocoperto;
    private double importoTotale;

    public Ordine(Tavolo tavolo, List<Item> elementoMenu, int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, LocalDate oraAcquisizione, double costocoperto) {
        if(numeroCoperti > tavolo.getNumeroMaxCoperti()){
            throw new IllegalArgumentException("Il tavolo selezionato non ha abbastanza coperti");
        }
        this.tavolo = tavolo;
        this.elementoMenu = elementoMenu;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.costocoperto = costocoperto;
        this.importoTotale = costocoperto*numeroCoperti + elementoMenu.stream().mapToDouble(elem -> elem.getPrice()).sum();
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "tavolo=" + tavolo +
                ", elementoMenu=" + elementoMenu +
                ", numeroOrdine=" + numeroOrdine +
                ", statoOrdine=" + statoOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", costocoperto=" + costocoperto +
                ", importoTotale=" + importoTotale +
                '}';
    }
}
