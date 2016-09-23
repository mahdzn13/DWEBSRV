package GarbageCollector;

/**
 * Created by mahernandezd on 23/09/16.
 */
public class GarbageCollectorEnd {
    public static void main(String[] args) {
        GarbageCollectorEnd gce = new GarbageCollectorEnd();
        gce = null;
        System.gc();
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("");
        System.out.println("Cleaned all!             .-----------------TTTT_-----_______\n" +
                "                        /''''''''''(______O] ----------____  \\______/]_\n" +
                "     __...---'\"\"\"\\_ --''   Q                               ___________@\n" +
                " |'''                   ._   _______________=---------\"\"\"\"\"\"\"\n" +
                " |                ..--''|   l L |_l   |\n" +
                " |          ..--''      .  /-___j '   '\n" +
                " |    ..--''           /  ,       '   '\n" +
                " |--''                /           `    \\\n" +
                "                      L__'         \\    -\n" +
                "                                    -    '-.\n" +
                "                                     '.    /\n" +
                "                                       '-./");
    }
}
