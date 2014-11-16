public class OrkiestraDyn {
    public static Instrument dajInstrument(String nazwa) {
        Instrument ret = null;
        try {
            ret = Class.forName(nazwa).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Nie znaleziono klasy " + nazwa);
        }
        return ret;
    }
}
