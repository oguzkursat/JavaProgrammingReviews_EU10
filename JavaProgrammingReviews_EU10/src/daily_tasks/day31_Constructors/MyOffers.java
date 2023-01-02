package daily_tasks.day31_Constructors;


import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();

        offer1.setInfo("VA","Amazon Inc","SDET", 110000 , true , true , true , true );
        offer2.setInfo("CA","Sony Inc","QA", 120000 , true , false , false , true );
        offer3.setInfo("FL","Apple Inc","QE", 125000 , true , true , true , false );
        offer4.setInfo("TX","CapitalOne","SM", 115000 , false , false , true , true );
        offer5.setInfo("WA","Bank Of America","BA", 130000 , true , true , false , true );

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("--------------------------------------------------------------");

        Offer [] offers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList(offers));
        localOffer.removeIf(p-> !(p.location.equals("VA")||p.location.equals("CA")));

        System.out.println(localOffer.size());

        for (Offer offer : localOffer) {
            System.out.println(offer.companyName + " : " + offer.salary);
        }







    }
}
