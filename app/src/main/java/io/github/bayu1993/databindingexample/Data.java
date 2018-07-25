package io.github.bayu1993.databindingexample;

public class Data {

    private String nama;
    private String kelas;
    private Integer img;

    public Data(String nama, String kelas, Integer img) {
        this.nama = nama;
        this.kelas = kelas;
        this.img = img;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public Integer getImg() {
        return img;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
