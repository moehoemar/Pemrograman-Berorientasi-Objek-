class Karyawan {
    private String nama;
    private String NIK;

    public Karyawan(String nama, String NIK) {
        this.nama = nama;
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }
}

class KaryawanEdukatif extends Karyawan {
    private String NIDN;
    private double gajiTetap;
    private double honorMengajar;
    private double tunjangan;

    public KaryawanEdukatif(String nama, String NIK, String NIDN, double gajiTetap, double honorMengajar, double tunjangan) {
        super(nama, NIK);
        this.NIDN = NIDN;
        this.gajiTetap = gajiTetap;
        this.honorMengajar = honorMengajar;
        this.tunjangan = tunjangan;
    }

    public double hitungGajiBulanan() {
        return gajiTetap + honorMengajar + tunjangan;
    }
}

class KaryawanNonEdukatif extends Karyawan {
    private double gajiTetap;
    private double honorKehadiran;
    private double uangLembur;

    public KaryawanNonEdukatif(String nama, String NIK, double gajiTetap, double honorKehadiran, double uangLembur) {
        super(nama, NIK);
        this.gajiTetap = gajiTetap;
        this.honorKehadiran = honorKehadiran;
        this.uangLembur = uangLembur;
    }

    public double hitungGajiBulanan() {
        return gajiTetap + honorKehadiran + uangLembur;
    }
}

public class Tugas2 {
    public static void main(String[] args) {

        KaryawanEdukatif karyawanEdukatif = new KaryawanEdukatif("Karyo", "340417", "456321", 5000, 2000, 1000);
        System.out.println("Gaji Bulanan Karyawan Edukatif: " + karyawanEdukatif.hitungGajiBulanan());

        KaryawanNonEdukatif karyawanNonEdukatif = new KaryawanNonEdukatif("Karto", "350517", 4000, 1500, 800);
        System.out.println("Gaji Bulanan Karyawan Non-Edukatif: " + karyawanNonEdukatif.hitungGajiBulanan());
    }
}
