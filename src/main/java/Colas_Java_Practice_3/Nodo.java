package Colas_Java_Practice_3;

public class Nodo {
        private String persona;
        private String info;
        private Nodo behind;
        public Nodo() {
        }
        public String getInfo() {
            return info;
        }
        public void setInfo(String info) {
            this.info = info;
        }
        public Nodo getBehind() {
            return behind;
        }
        public void setBehind(Nodo behind) {
            this.behind = behind;
        }
        @Override
        public String toString() {
            return info;
        }
}
