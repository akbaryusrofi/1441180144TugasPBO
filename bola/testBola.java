package bola;

/**
 * Created by Akbar on 6/24/2015.
 */
public class testBola{
    private Club club;
    public static void main(String[] args) {

        Liga Italy = new Liga("Italy");
        Liga division = new Liga("Liga Devisi");

        Devisi serieA = new Devisi("Serie A Itali");
        Devisi serieB = new Devisi("Serie B Itali");

        //isi dimensi
        Club Juventus = new Club("Juventus", serieA, Italy);
        Club AcMilan = new Club("AC Milan", serieA, Italy);
        Club Napoli = new Club("Napoli", serieA, Italy);

        Club HellesVerona = new Club("Helles Verona", serieB, Italy);
        Club Udinese = new Club("Udinese",serieB, Italy);
        Club Torino = new Club("Torino",serieB, Italy);
        Club Sassuolo = new Club("Sassuolo",serieB, Italy);


        Italy.setDaftarDevisi(serieA);
        Italy.setDaftarDevisi(serieB);

        serieA.setDaftarClub(Juventus);
        serieA.setDaftarClub(AcMilan);
        serieA.setDaftarClub(Napoli);

        serieB.setDaftarClub(HellesVerona);
        serieB.setDaftarClub(Udinese);
        serieB.setDaftarClub(Torino);
        serieB.setDaftarClub(Sassuolo);






        System.out.println("1." + Italy.getNamaLiga());
        System.out.println("1." + Italy.getDaftarDevisi());

        System.out.println("-----------------");
        System.out.print("2. ");
        Italy.getDaftarClub();


        System.out.println("-----------------");
        System.out.println("3" + serieA.getDaftarClub(serieA));
        System.out.println("3" + serieB.getDaftarClub(serieA));
        System.out.println("-----------------");
        System.out.println("4" + Juventus.getNamaClub());
        System.out.println("4" + AcMilan.getDevisi());
        System.out.println("-----------------");
        AcMilan.setLiga(serieA);

        System.out.println("5." + AcMilan.getNamaClub());
        System.out.println("5." +AcMilan.getLiga());


        System.out.println("-----------------");
        System.out.println("-----------------");


        }
        }




