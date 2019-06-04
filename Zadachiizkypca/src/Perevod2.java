import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Perevod2 {
    public static void main(String[] args) {
        Scanning slovo = new Scanning ();
        slovo.reshenie ();
        slovo.print ();
    }




    Set<String> knownWords = new HashSet<> ();
    List<String> text = new ArrayList<> ();
    int unknownwordsCount;
    Set<String> uknowswords = new HashSet<> ();

    Scanning() {
        Scanner sc = new Scanner ( System.in );
        int allWordsCount = sc.nextInt ();
        int knownwordsCount = sc.nextInt ();
        unknownwordsCount = sc.nextInt ();
        for (int i = 0; i < knownwordsCount; i++) {
            knownWords.add ( sc.next () );
        }
        for (int i = 0; i < allWordsCount; i++) {
            text.add ( sc.next () );
        }

        sc.close ();
    }

    void reshenie() {


        List<String> tempuknown = new ArrayList<> ();
        AtomicBoolean begintext = new AtomicBoolean ( true ); // Если последовательность < unknowWordsDistance  то пропускаем
        text.forEach ( word -> {
            if (knownWords.contains ( word )) {                  // Сравниваем слова с knownWords
                if (begintext.get ()) {                // Подсчитываем кол=во слов которые незнакомы и идут подряд
                    uknowswords.addAll ( tempuknown );
                }
                begintext.set ( false );   // Сравниваем длину последовательности unknowWordsDistance с

                if (tempuknown.size () >  unknownwordsCount) {  // Если последовательность >= unknowWordsDistance
                    uknowswords.addAll ( tempuknown );         // то включаем в коллекцию слов котторые точно не известны
                }
                tempuknown.clear ();

            } else {
                tempuknown.add ( word );
            }
        } );
        uknowswords.addAll ( tempuknown );


    }

    void print(){
        System.out.println (uknowswords.size () );   //  После пробегания по всему тексту выводим кол-во уникальных неизвестных слов

    }
}

