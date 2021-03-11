package com.muhammedazman;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class FilmData {

    private static FilmData instance = new FilmData();
    private DateTimeFormatter formatter;
    private ObservableList<Film> filmListesi;

    private FilmData(){
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//11-03-2021
    }

    public static FilmData getInstance() {
        return instance;
    }

    public void filmEkle(Film eklenecekFilm){
        filmListesi.add(eklenecekFilm);
    }

    public void filmSil(Film silinecekFil) {
        filmListesi.remove(silinecekFil);
    }

    //uygulama acildiginda dosyadan tüm filmler getirilip observable listeye atanir
    public void dosyadanFilmleriGetir(){
        // Dosya icerigi su sekilde olacak
        // Baslik \t Detay \t Cikis Tarihi

        filmListesi = FXCollections.observableArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader("filmler.txt"))){
            String tekFilmSatir;
            while ((tekFilmSatir = reader.readLine()) != null){
                String[] filmParcalari = tekFilmSatir.split("\t");
                String filmBaslik = filmParcalari[0];
                String filmDetay = filmParcalari[1];
                String filmBitisTarihi = filmParcalari[2];

                LocalDate bitis = LocalDate.parse(filmBitisTarihi, formatter);

                Film okunanFilm = new Film(filmBaslik, filmDetay, bitis);
                filmListesi.add(okunanFilm);
            }

            System.out.println("Dosyadan getirilen fimler "+ filmListesi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //uygulama kapatilirkenobservable listeeki filmler dosyaya yazilir
    public void dosyayaFilmleriYaz() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("filmler.txt"))) {
            Iterator<Film> iterator = filmListesi.iterator();
            while (iterator.hasNext()){
                Film onAnkiFilm = iterator.next();
                writer.write(String.format("%s\t%s\t%s",
                        onAnkiFilm.getBaslik(),onAnkiFilm.getDetay(),
                        onAnkiFilm.getCikisTarihi().format(formatter)));
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Film> getFilmListesi() {
        return filmListesi;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }
}
