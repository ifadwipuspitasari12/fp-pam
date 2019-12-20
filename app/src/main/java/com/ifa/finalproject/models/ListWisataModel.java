package com.ifa.finalproject.models;

public class ListWisataModel {
    private String id;

    private String nama_tempat;

    private String url;

    private String alamat;

    private String thumbnailUrl;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getNama_tempat ()
    {
        return nama_tempat;
    }

    public void setNama_tempat (String nama_tempat)
    {
        this.nama_tempat = nama_tempat;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getAlamat ()
    {
        return alamat;
    }

    public void setAlamat (String alamat)
    {
        this.alamat = alamat;
    }

    public String getThumbnailUrl ()
    {
        return thumbnailUrl;
    }

    public void setThumbnailUrl (String thumbnailUrl)
    {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", nama_tempat = "+nama_tempat+", url = "+url+", alamat = "+alamat+", thumbnailUrl = "+thumbnailUrl+"]";
    }
}
