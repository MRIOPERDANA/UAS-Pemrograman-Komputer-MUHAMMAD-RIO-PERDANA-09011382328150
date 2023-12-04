public class Soal7 {
    public static void main(String[] args) {
        String[] judul = { " Java programing", " Data structure and Algorithm","Introduction AI", "Data base management", "Web development"};
        String[] author = {"John smith", "Alice johnson", " Robert Williams", " Emily davis"," Michle brown"};
        int [] tahun = {2020, 2019, 2022, 2018, 2021};
        String[] status = { "Tersedia", "Tidak tersedia", "Tersedia", "Tersedia", "Tersedia"};

        System.out.println("Informasi Buku:");
        for ( int i = 0; i < judul.length; i++){
        System.out.println("   ");
        System.out.println("Judul =" + judul[i]);
        System.out.println("Author =" +author[i]);
        System.out.println("Tahun =" + tahun[i]);
        System.out.println("Status =" + status[i]);
        System.out.println("------------------------");
        }
        
    String search = "Introduction AI";
    boolean ditemukan = false;
        for ( int i = 0; i < judul.length; i++ ){
            if (judul[i]. equalsIgnoreCase(search)){
        System.out.println("Buku dengan judul " + search + " tersedia");
        System.out.println("Informasi Buku:");
        System.out.println("   ");
        System.out.println("Author =" +author[i]);
        System.out.println("Tahun =" + tahun[i]);
        System.out.println("Status =" + status[i]);
        System.out.println("------------------------");
      ditemukan = true;
      break;
    }
}
    if(!ditemukan){
        System.out.println(" Buku dengan judul :" + search + " Tdak di temukan");
    }

}
}