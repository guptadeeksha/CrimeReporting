package com.example.crimereporting;

public class ViewComplaints {
    private int m_ID;
    private String m_email;
    private String m_victim;
    private String m_police;
    private String m_desc;

    public ViewComplaints(int _ID, String email, String victim, String police, String desc){
        m_ID = _ID;
        m_email = email;
        m_victim = victim;
        m_police = police;
        m_desc = desc;
    }

    public int getID() {
        return m_ID;
    }
    public String getemail(){
        return m_email;
    }
    public String getvictim(){
        return m_victim;
    }
    public String getpolice(){
        return m_police;
    }
    public String getdesc(){
        return m_desc;
    }

}

