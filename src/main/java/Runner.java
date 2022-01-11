public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        bear.setName("Baloo");
        String name = bear.getName();
        System.out.println(name);

        Planet planet = new Planet();
        planet.setName("Mars");
        planet.setSize(908973);
        System.out.println(String.format("%s is %s",planet.getName(),planet.getSize()));
        System.out.println(planet.getExplode());
    }

}
