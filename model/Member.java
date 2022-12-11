package model;

public class Member {
    private String nama;
    private JenisMember jenisMember;

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return nama;
    }

    public void setJenisMember(JenisMember jenisMember)
    {
        this.jenisMember = jenisMember;
    }

    public JenisMember getJenisMember()
    {
       return jenisMember;
    }
}
