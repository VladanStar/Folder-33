package zbircifaratrocifrenbroj;

import java.util.Scanner;

public class ZbirCifaraTrocifrenBroj {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarisanje promenljivih
        int broj, zbir = 0;
        // unos trocifrenog broja
        System.out.print("Unesite trocifreni broj: ");
        broj = input.nextInt();

        // obrada podataka
        // odredjivanje poslednje cifre i dela dvocifrenog beoja
        System.out.println("Cifra jedinica: " + (broj % 10));
        zbir += (broj % 10);
        broj /= 10;
        // broj je dobio novu vrednost, prve dve cifre trocifrenog broja
        System.out.println("Cifra desetica : " + (broj%10));
        
        // dodavanje predposlednje cifre
        zbir += (broj%10);
       
        // odredjivanje prve cifre stotina
        System.out.println("Cifra stotina: " + (broj/10));
        zbir += (broj/10);
        
        System.out.println("Zbir cifara trocifrenog broja je: " + zbir);
        
    }

}
