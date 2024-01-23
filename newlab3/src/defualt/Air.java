package defualt;

public class Air {
    public static class SnowDust {
        private String name = "Снежная пыль в воздухе";

        @Override
        public String toString() {
            return name;
        }
        public void tremble(){
            System.out.println(this + " дрожала");
        }
        public void iridescent(){
            System.out.println(this + " переливалась");
        }
    }
}
