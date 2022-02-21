
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaTemp {
    public static void main(String[] args) {

        List<Temp> temps = new ArrayList<>(){{
            add(new Temp(15.0, " 1-Janeiro"));
            add(new Temp(13.0, " 2-Fevereiro"));
            add(new Temp(18.0, " 3-Março"));
            add(new Temp(18.0, " 4-Abril"));
            add(new Temp(12.0, " 5-Maio"));
            add(new Temp(16.0, " 6-Julho"));
        }};

        double sum = 0;
        for (Temp temp : temps) {
            sum += temp.temperatura;
        }
        double media = sum/temps.size();
        System.out.println("Media: " + media);

        Iterator<Temp> iterator = temps.iterator();

        while(iterator.hasNext()) {
            Temp next = iterator.next();
            if(next.temperatura > media) {
                System.out.println("Temperatura: " + next.temperatura + "Mes: " + next.mes);
            }
        }

    }

    public static class Temp {
        private Double temperatura;
        private String mes;

        public Temp(Double temperatura, String mes) {
            this.temperatura = temperatura;
            this.mes = mes;
        }

        public Double getTemperatura() {
            return temperatura;
        }

        public void setTemperatura(Double temperatura) {
            this.temperatura = temperatura;
        }

        public String getMes() {
            return mes;
        }

        public void setMes(String mes) {
            this.mes = mes;
        }
    }
}

