package controller;

import java.util.ArrayList;
import java.util.List;

import model.Hotel;

public class HotelController {
    private static List<Hotel> hoteis = new ArrayList<Hotel>();

    static {
        hoteis.add(new Hotel("Copacabana"));
        hoteis.add(new Hotel("Tangara"));
        hoteis.add(new Hotel("Fushi"));
        hoteis.add(new Hotel("Tupana"));
        hoteis.add(new Hotel("Hib3"));
        hoteis.add(new Hotel("Hmsp"));
    }

    public static String buscarHotel(String nome) {
        String mensagem = "";
        boolean encontrado = false;

        for (Hotel hotel : hoteis) {
            if (hotel.getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            mensagem = "Hotel encontrado com sucesso.";
        } else {
            mensagem = "Hotel não encontrado.";
        }

        return mensagem;
    }

}
