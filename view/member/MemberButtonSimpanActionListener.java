package view.member;

import java.awt.event.*;
import model.*;

    public class MemberButtonSimpanActionListener implements ActionListener{
    private MemberFrame memberFrame;

    public MemberButtonSimpanActionListener(MemberFrame memberFrame)
    {
        this.memberFrame = memberFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String nama = this.memberFrame.getNama();
        JenisMember jenisMember = this.memberFrame.getJenisMember();
        Member member = new Member();
        member.setNama(nama);
        member.setJenisMember(jenisMember);

        this.memberFrame.addMember(member);
    }
 }

