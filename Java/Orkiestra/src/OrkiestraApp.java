public class OrkiestraApp {
    public static void main(String[] args) {
        Instrument[] orkiestra = new Instrument[args.length];
        for (int i = 0; i < args.length; i++)
            orkiestra[i] = OrkiestraDyn.dajInstrument(args[i]);
        for (Instrument i : orkiestra)
            i.graj();
    }
}
