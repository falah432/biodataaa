package com.example.biodata;

import android.os.Parcel;
import android.os.Parcelable;

public class bio implements Parcelable {
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    private String nim;
    private String nama;
    private String kelas;
    private String tgl;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
        dest.writeString(this.tgl);
    }

    public bio() {
    }

    protected bio(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.kelas = in.readString();
        this.tgl = in.readString();
    }

    public static final Parcelable.Creator<bio> CREATOR = new Parcelable.Creator<bio>() {
        @Override
        public bio createFromParcel(Parcel source) {
            return new bio(source);
        }

        @Override
        public bio[] newArray(int size) {
            return new bio[size];
        }
    };
}
