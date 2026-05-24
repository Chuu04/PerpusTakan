package PraktikumModul6;



class Biodata {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public void setKarya(String karya) {
        this.karya = karya;
    }


    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getJurusan() { return jurusan; }
    public String getFakultas() { return fakultas; }
    public String getUniversitas() { return universitas; }
    public String getAlamat() { return alamat; }
    public String getEmail() { return email; }
    public String getPekerjaan() { return pekerjaan; }
    public String getHobi() { return hobi; }
    public String getKeahlian() { return keahlian; }
    public String getKarya() { return karya; }
}


public class Encapltion {  
    public static void main(String[] args) {
        Biodata data = new Biodata();

        data.setNama("Cinta Satilla");
        data.setNim("11221071");
        data.setJurusan("Informatika");
        data.setFakultas("FSTI");
        data.setUniversitas("ITK");
        data.setAlamat("Balikpapan");
        data.setEmail("11221071@student.itk.ac.id");
        data.setPekerjaan("Mahasiswa");
        data.setHobi("Reading");
        data.setKeahlian("Java dan Python");
        data.setKarya("BUlbuL");

        System.out.println("Nama: " + data.getNama());
        System.out.println("NIM: " + data.getNim());
        System.out.println("Jurusan: " + data.getJurusan());
        System.out.println("Fakultas: " + data.getFakultas());
        System.out.println("Universitas: " + data.getUniversitas());
        System.out.println("Alamat: " + data.getAlamat());
        System.out.println("Email: " + data.getEmail());
        System.out.println("Pekerjaan: " + data.getPekerjaan());
        System.out.println("Hobi: " + data.getHobi());
        System.out.println("Keahlian: " + data.getKeahlian());
        System.out.println("Karya: " + data.getKarya());
    }
}
