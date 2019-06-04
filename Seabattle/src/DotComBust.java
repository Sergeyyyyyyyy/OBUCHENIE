import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
// Создадим несколько "сайтов" и присвоим им адреса
        DotCom one = new DotCom();
        one.setName( "Линкор" );
        DotCom two = new DotCom();
        two.setName( "Эсминец" );
        DotCom three = new DotCom();
        three.setName( "Крейсер" );
        dotComsList.add( one );
        dotComsList.add( two );
        dotComsList.add( three );
        System.out.println( "Ваша цель — потопить три \"корабля\"." );
        System.out.println( "Линкор,  Эсминец,  Крейсер" );
        System.out.println( "Попытайтесь потопить их за минимальное количество ходов" );

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom( 3 );
            dotComToSet.setLocationCells( newLocation );
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserlnput( "Сделайте ход: " );
            checkUserGuess( userGuess );
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself( userGuess );
            if (result.equals( "Попал" )) {
                break;
            }
            if (result.equals( "Потопил" )) {
                dotComsList.remove( dotComToTest );
                break;
            }
        }
        System.out.println( result );
    }

    private void finishGame() {
        System.out.println( "Все \"корабли\"  ушли ко дну! Много раз  вы стреляли." );
        if (numOfGuesses <= 18) {
            System.out.println( "Это заняло у вас всего " + numOfGuesses + " попыток." );
            System.out.println( "Вы успели подбить вражеские корабли до того, как вас обнаружили." );
        } else {
            System.out.println( "Это заняло у вас довольно много времени. " + numOfGuesses + " выстрела." );
            System.out.println( "Рыбы водят хороводы вокруг поопленных кораблей." );
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}


