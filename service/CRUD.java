package service;

public interface CRUD<T> {
    void tambah(T item);
    void perbarui(T item);
    void hapus(String nama);
    void daftarSemua();
}
