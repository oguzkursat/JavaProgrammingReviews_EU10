package daily_tasks.day09;

public class ChooseLanguage {
    public static void main(String[] args) {

        String English = "Hello, thank for your call";
        String Spanish = "Hola, gracias para llamar";
        String Turkish = "Merhaba, aradiginiz icin tesekkurler";
        String Russian = "Privet, spasibo za vash zvonok";
        String French = "Merci ,pour votre appel";
        String result = "";
        int num = 2;
        if(num==1){
            result=English;
        } else if (num==2) {
            result=Spanish;
        } else if (num==3) {
            result=Turkish;
        } else if (num==4) {
            result=Russian;
        } else if (num==5) {
            result=French;
        }

        System.out.println(result);


    }
}
