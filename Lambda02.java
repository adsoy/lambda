package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));

        ilkHarfEVeyaC(meyve);
        System.out.println("\n ************************");
        basiVeSonuYildiz(meyve);
        System.out.println("\n ************************");
        icindeEHarfi(meyve);
        System.out.println("\n ************************");
        lHarfiSil(meyve);
        System.out.println("\n ************************");
        karakterSayisinaGoreKucuktenBuyuge(meyve);
        System.out.println("\n ************************");
        BuyukKucuk(meyve);
        System.out.println("\n ************************");
        karakterSayisinaGoreKucuktenBuyugeMethodRef(meyve);
        System.out.println("\n ************************");




    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım

    public static void ilkHarfEVeyaC(List<String> meyve){
        meyve.stream().filter(t->t.startsWith("e") ||t.startsWith("c")).forEach(Utils::yazdir);

    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void basiVeSonuYildiz (List<String> meyve) {
        meyve.stream().map(t->"*"+t+"*").forEach(Utils::yazdir);
    }

    // SORU3 : List elemanlarının icinde 'e' harfi olanları yazdırın
    public static void icindeEHarfi (List<String> meyve){
        meyve.stream().filter(t->t.contains("e")).forEach(Utils::yazdir);
    }

    // SORU4 : List elemanlarındaki 'l' harflerini silip yazdırınız

    public static void lHarfiSil (List<String> meyve) {
        meyve.stream().map(t->t.replace("l", "")).forEach(Utils::yazdir);
    }
    // SORU5 : List elemanlarini, Lambda Expression kullanarak
    // karakter sayisina göre kucukten buyuge dogru sıralayarak yazdırınız

    public static void karakterSayisinaGoreKucuktenBuyuge(List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(t->t.length())).forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarini, Lambda Expression kullanarak
    // karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız
    public static void BuyukKucuk (List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).forEach(Utils::yazdir);
    }
    // SORU7 : List elemanlarini, Method References kullanarak
    // karakter sayisina göre buyukten kucuge dogru sıralayarak yazdırınız
    public static void karakterSayisinaGoreKucuktenBuyugeMethodRef (List<String> meyve) {
        meyve.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::yazdir);
    }
}

