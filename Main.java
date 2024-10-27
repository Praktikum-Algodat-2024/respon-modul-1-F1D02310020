public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("=================================================================");
        System.out.println("                    PRAKTIKUM STRUKTUR DATA");
        System.out.println("                         KELOMPOK 11");
        System.out.println("=================================================================");


        System.out.println("=================================================================");
        System.out.println("                Daftar Praktikan Kelompok 11 ");
        System.out.println("=================================================================");
        linkedList.addLast("Nayla");
        linkedList.addLast("Nini");
        linkedList.addLast("Wira");
        linkedList.addLast("Ananta");
        linkedList.addLast("Salsa");
        linkedList.addLast("Raja");
        linkedList.addLast("Alfath");
        linkedList.addLast("Nopal");
        linkedList.display();

        System.out.println("=================================================================");
        System.out.println("                Daftar Presensi Setelah Wira TidaK Hadir");
        System.out.println("=================================================================");
        linkedList.delete("Wira");
        linkedList.display();

        System.out.println("=================================================================");
        System.out.println("                List Presensi Setelah Dibalik Tengah");
        System.out.println("=================================================================");
        linkedList.reverseSection(1, 5); 
        linkedList.display();

        System.out.println("=================================================================");
        System.out.println("                List Presensi Setelah Dibalik");
        System.out.println("=================================================================");
        linkedList.reverseAll();
        linkedList.display();

        System.out.println("\n=================================================================");
    }
}