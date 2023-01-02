package daily_tasks.day20;

public class Day20_Task_2_Reverse_Classmates_Name {
    public static void main(String[] args) {
        String classmate[] = {"Oğuz Kürşat Özkan", "Özgür Ciritbeyi", "Akile Altın", "Kerime Ünal", "Enes Zengin",
                "Ferhat Alvar", "Emre Karakuş", "Necdet Emir Güngör", "Canan Bilge Evrim", "Muhammet Gokhan Guner"};
        String temp = "";
        String result = "";


        for (int i = 0; i < classmate.length; i++) {
            for (int x = 0; x < classmate[i].length(); x++) {
                result = "";
                classmate[i] = classmate[i] + " ";
                String sub = classmate[i].substring(0, classmate[i].indexOf(" "));
                classmate[i] = classmate[i].replace(sub, "");
                classmate[i] = classmate[i].trim();
                temp = sub;
                for (int j = temp.length() - 1; j >= 0; j--) {
                    result += temp.charAt(j);
                }
                result += " ";

                //temp = temp.trim();

                System.out.print(result);

            }
            System.out.println("\n");

        }

    }
}
