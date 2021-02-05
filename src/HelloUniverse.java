public class HelloUniverse {
    public static void main(String... args) {
        String phraseIntroduction="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int nbPlanetes=8;
        System.out.println(phraseIntroduction+nbPlanetes);
        phraseIntroduction="Il y a quelques années cependant, elles étaient au nombre de : ";
        nbPlanetes++;
        System.out.println(phraseIntroduction+nbPlanetes);
    }
}