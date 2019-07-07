import java.util.*;


public static void main(String[]args){

public class Lekcia07072019 {


    MyClass2<Integer>[] mca =
            new MyClass<Integer>[20];

    Throwable
}

/* MyClass2 <T> {....}  T obj;
    T get obj () {return; obj};

class SpecMyClass extends MyClass2 <Streing> {
String obj
        String getObj () {return obj};
}
-------------------------
        Object getobj()....
        String getobj() ...

}
*/

"Exception"
//cheacked
//                   error  - unchecked
//        runtime exception  - unchecked


        try{
        PrintWriteer ou = new PrintWriter(new FileWriter("result.txt"));
        for(int i=0;i<SIZE; i++){
        out.println("a["i+" ]"+a.get(i));
        }
        }
        catch(IndexOutOfBoundsException e){System.err.println(e);}
        catch(IOException e){System.err.println(e);}

        finally{
        if(out!=null){
        out.close();
        }
        else{
        System.out.println("Файл не был открыт");
        }
        }

//                                             Throwable
//          Error                                                            Exceprtion
//                                                                               |
//                                                                            RuntimeException


        AutoCloseable

        try(BufferedReader br=new Buffererd(
        new Filereader(path));
        ....){
        return br.readLine();
        }


//// Оператор throws
//
//void meth () throws IOException, ... Exception {
//        .....
//        };
//
//        main
//          |
//       3 throws
//          |
//        2 throws
//           |
//         1 throw

//Throwable
//        (String , Throwable)
//        (Throwable)
//   getCause ()
//   initCause (Throwable)
//

// try {
//        Handler h=new FileHandler(" outf.log");
//        Logger.getlogger ("").addHandler (h);
//        }
//        catch (IOException e);
//  Logger logger  = Logger.getLogger ("package.name");
//  StackTraceElement [] elements = e.getStackTrace();
//  for (int i = 0 ; n = elements.length; i<n;i++){
//      logger.log (Leval.Warning, elements [])
//        get ...  ();
//        }





















































































