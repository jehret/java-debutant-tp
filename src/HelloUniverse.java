public class HelloUniverse {
    public static void main(String... args) {
        String phraseIntroduction="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(phraseIntroduction);
        int nbPlanetes=8;
        phraseIntroduction="Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(nbPlanetes);
        System.out.println(phraseIntroduction);
        nbPlanetes++;
        System.out.println(nbPlanetes);
    }
}