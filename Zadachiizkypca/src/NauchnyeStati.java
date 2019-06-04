import java.util.*;

public class NauchnyeStati {
    public static void main(String... args) {
        Kurswork staty = new  Kurswork();
        staty.reshenie();
        staty.print();
    }
}

class  Kurswork {

    private int NumberStatey = 0;  // Считать из первой строки число статей и сохранить в переменную.
    private List<List<String>> Keyslova;  // Объявить множество известных ключевых слов и заполнить его ключевыми словами первой статьи
    private int ReadedStateyCount = 1; // Создать целочисленную переменную для счётчика прочтённых статей и инициализировать единицей, так как первую прочли.




    Kurswork() {                               // Считываем цифры, ключевые слова
        Scanner sc = new Scanner(System.in);
        int statiiCount = sc.nextInt();  // Считать число  статей и сохранить в переменную
        Keyslova = new ArrayList<>(statiiCount);
        while (Keyslova.size() < statiiCount) {
            int kolslov = sc.nextInt ();
            List<String> statyislova = new ArrayList<> ( kolslov );
            for (int i = 0; i<kolslov; i++) {
                statyislova.add (sc.next ());
            }
            Keyslova.add ( statyislova );
        }
        sc.close();
    }

    void reshenie (){
         Set<String> result = new HashSet<> (); //*  пустой список строк,
        // который будет использоваться как промежуточный буфер для хранения ключевых слов каждой статьи.*/
        result.addAll ( Keyslova.get ( 0 ) );
        Keyslova.remove ( 0 );
        for (List<String> statyislova: Keyslova) {
            int kolizvslov = 0;
            for (String s:statyislova) {
                if (result.contains ( s )) {
                    kolizvslov++;
                }
            }
            if (kolizvslov <= statyislova.size () - kolizvslov) {
                result.addAll ( statyislova );
                ReadedStateyCount++;
            }
        }
    }


    void print (){   // Вывести в консоль число прочтённых статей.
        System.out.println ( ReadedStateyCount );
    }
}

