import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Atanas");
        table.put(123, "Ivan");
        table.put(321, "Maria");
        table.put(214, "Georgi");
        table.put(432, "Nina");
        for (Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
        System.out.println();
        Hashtable<String, String> table01 = new Hashtable<>(10);
        table01.put("100", "Atanas");
        table01.put("123", "Ivan");
        table01.put("321", "Maria");
        table01.put("214", "Georgi");
        table01.put("432", "Nina");
        for (String key : table01.keySet()){
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 10 + "\t" + key + "\t" + table01.get(key));
        }
    }
}