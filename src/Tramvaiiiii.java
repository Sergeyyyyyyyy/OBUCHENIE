import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Tramvaiiiii {

    public static void main(String[] args) {
        Koldneycstatistic exam = new Koldneycstatistic();
        exam.solve();
        exam.print();
    }

    public static class Tramvai {

        public static void main(String[] args) {
            Koldneycstatistic exam = new Koldneycstatistic();
            //ERROR: Koldneycstatistic.prepare(); // не используется
            //ERROR: Koldneycstatistic.solve(); // solve - не статический метод класса, поэтому должен вызываться у конкретного инстанса
            exam.solve();
            //ERROR: Koldneycstatistic.print(); // print - - не статический метод класса, поэтому должен вызываться у конкретного инстанса
            // вывод на экран

        }

        static class Koldneycstatistic {

            static class Tramvai2 {

                //ERROR: <string> Tramvai2(int num, int m, string j){
                //1. Здесь нет необходимости использовать Generic тип
                //2. Трамваев может быть больше одного, поэтому нужна коллекция
                //3. Я понял из кода, что этот внутренний класс хранит только данные за один день, поэтому кол-во дней не нужно здесь хранить (убираем "num")!
                Tramvai2(int m, List<String> j) {

                    //3. Я понял из кода, что этот внутренний класс хранит только данные за один день, поэтому кол-во дней не нужно здесь хранить (убираем "num")!
                    //ERROR: this.num = num; //  количество дней, для которых имеется «статистика»

                    this.m = m; // количество трамваев, прибывающих в ближайшее время
                    this.j = j;//  наименования моделей трамваев в том порядке, в котором они подъедут к остановке

                }

                //WARNING: Это не ввод, а вывод. И к томуже нигде не используется
                // вводим переменные в программу
                //        public String toString() {
                //            return "[" + num + ", "+ m +", "+ j +"]";
                //        }

                //ERROR:        int num; - не используется
                int m;
                //[ERROR]: string j;
                //1. Вне конструктора java незнает ничего про указанный Generic тип, лучше откзаться от него, чтобы не путаться
                //2. Трамваев может быть больше одного, поэтому нужна коллекция
                List<String> j;
            }

            // сканируем введенные переменные
            Koldneycstatistic() {
                //ERROR: num = new Scanner(System.in);
                //num не указан тип (Scanner), и далее в коде используется in в качестве экземпляра сканера
                Scanner in = new Scanner(System.in);
                //ERROR: m = in.nextInt();
                //не обьъявлен тип у переменной "m". Должен быть "int", т.к. число
                int m = in.nextInt();
                //ERROR: j = in.nextInt() - это не нужно здесь, нужно читать кол-во для каждого дня в цикле
                sts = new ArrayList<>(m);
                for (int i = 0; i < m; i++) {
                    //ERROR: int m = in.nextInt() - это не нужно здесь, т.к. общее кол-во Одно и читается в самом начале (в переменную "m")
                    int j = in.nextInt();
                    //ERROR: sts.add(new Tramvaiiiii.Tramvai(i+1, m, j)); - нужно сохранить здесь список трамваев за день, ниже 4 строки правильного кода
                    List<String> trams = new ArrayList<>(j);
                    for (int ji = 0; ji < j; ji++) {
                        trams.add(in.next());
                    }
                    sts.add(new Tramvai2(j, trams));
                }
                in.close();
            }

            //ERROR: нам не нужно в этой задаче сортировать введенные данные, нам важен порядок ввода
            //к томуже здесь не понятно по какому полю сортируются (это наверно в задаче с другим условием было нужно)
            //    void prepare() {
            //        Collections.sort(sts, (m, j) -> {
            //            if (s1.num < s2.num) return -1;
            //            if (s1.num > s2.num) return 1;
            //            return 0;
            //        });
            //    }

            void solve() {
                // ERROR: здесь вообще все не то. Видимо это решение совсем другой задачи
    /*
            TreeSet<Tramvai2> tss = new TreeSet<>((num, m) ->  {
                if (s1.m + s1.j < s2.at + s2.p) return -1;
                if (s1.m + s1.j > s2.at + s2.p) return 1;
                if (s1.m < s2.j) return -1;
                if (s1.m > s2.j) return 1;
                if (s1.num < s2.num) return -1;
                if (s1.num > s2.num) return 1;
                return 0;
            });

            fin = new ArrayList<>(n);

    // проверяем в цикле
            for (Tramvai2 s: sts) {
                if (tss.size() < k) {
                    s.at = s.t;
                    tss.add(s);
                }
                else {
                    Tramvai2 sout = tss.pollFirst();
                    sout.f = sout.m + sout.j;
                    if (sout.f < timer) {
                        sout.f = timer;
                    }
                    sout.f += 1;
                    timer = sout.f;
                    fin.add(sout);

                    s.at = Math.max(s.t, timer);
                    tss.add(s);
                }
            }

            for (Tramvai2 sout: tss) {
                sout.f = sout.m + sout.j;
                if (sout.f < timer) {
                    sout.f = timer;
                }
                sout.f += 1;
                timer = sout.f;
                fin.add(sout);
            }
    */
                // РЕШЕНИЕ:
                // Вводим локальную коллекцию, где будем хранить трамваи, на которых ездил Евлампий
                Set<String> usedTrams = new HashSet<>();
                //Идем по циклу введенного массива дней, когда ездил евлампий:
                for (Tramvai2 travelDay : sts) {
                    // Вводим локальную переменную, в которую запишем кол-во пропущенных трамваев в обрабатываемом дне (по умолчанию он садится на первый трамвай - поэтому инициализируем ее значением "0")
                    int skippedTrams = 0;
                    // проверяем, что Евлампий не на всех моделях трамвая ездил, которые есть в текущем дне (если ездил на всех, то по условию задачи он уедет на первом и ниодин не пропустит в этом дне)
                    if (!usedTrams.containsAll(travelDay.j)) {
                        // последовательно пропускаем трамваи на которых уже ездил Евлампий (увеличиваем счетчик пропущенных)
                        // как только попадается трамвай на котором он не ездил - выходим из цикла
                        int i = 0;
                        while (usedTrams.contains(travelDay.j.get(i))) {
                            skippedTrams++;
                            i++;
                        }
                        // добавляем текущий трамвай на котором уехал в этот день Евлампий, в коллекцию трамваев
                        usedTrams.add(travelDay.j.get(i));
                        // Прибавляем к общему кол-ву пропущенных трамваев те, которые он пропустил в этот день
                        n += skippedTrams;
                    }
                }
            }

            void print() {
                //ERROR: все это лишнее. Нужно вывести лишь кол-во пропущенных трамваев
                //        Collections.sort(fin, (s1, s2) -> {
                //            if (s1.num < s2.num) return -1;
                //            if (s1.num > s2.num) return 1;
                //            return 0;
                //        });

                //        for (Tramvai3 s: fin) {
                //            System.out.println(s.f);
                //        }
                System.out.println(n);
            }

            int n = 0;
            //ERROR:    int k; - лишнее свойство класса, нигде не используется
            ArrayList<Tramvai2> sts;
            //ERROR:    ArrayList<Tramvai2> fin; - лишнее свойство класса, нигде не используется

            //ERROR: Scanner in; - не нужно объявлять сканнер полем класса, он используется лишь в конструкторе
        }
    }

    static class Koldneycstatistic {

        static class Tramvai2 {

            Tramvai2(int m, List<String> j) {
                this.m = m;
                this.j = j;
            }

            int m;
            List<String> j;
        }

        Koldneycstatistic() {
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();
            sts = new ArrayList<>(m);
            for (int i = 0; i < m; i++) {
                int j = in.nextInt();
                List<String> trams = new ArrayList<>(j);
                for (int ji = 0; ji < j; ji++) {
                    trams.add(in.next());
                }
                sts.add(new Tramvai2(j, trams));
            }
            in.close();
        }

        void solve() {
            Set<String> usedTrams = new HashSet<>();
            for (Tramvai2 travelDay : sts) {
                int skippedTrams = 0;
                if (!usedTrams.containsAll(travelDay.j)) {
                    int i = 0;
                    while (usedTrams.contains(travelDay.j.get(i))) {
                        skippedTrams++;
                        i++;
                    }
                    usedTrams.add(travelDay.j.get(i));
                    n += skippedTrams;
                }

            }
        }

        void print() {
            System.out.println(n);
        }

        int n = 0;
        ArrayList<Tramvai2> sts;
    }
}
