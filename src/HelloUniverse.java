public class HelloUniverse {
    public static void main(String... args) {

        int nbPlanetes=7;
        while (nbPlanetes<10) {
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre à été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
            }
            nbPlanetes++;
        }
    }
}