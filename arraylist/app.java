import java.util.ArrayList;

class app {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        boolean existe = arrayList.contains("A");

        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento n existe no array");
        }
        
        int pos = arrayList.indexOf("B");
        
        if (pos > -1) {
            System.out.println("Elemento n existe no array");
        } else {
            System.out.println("Elemento existe no array");
        }

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList.size());
    }
}