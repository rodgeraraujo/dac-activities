package br.edu.ifpb.dac.sessionbeans.controller;

import br.edu.ifpb.dac.sessionBeans.interfaces.IMember;
import br.edu.ifpb.dac.sessionBeans.model.Member;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.EJB;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MemberController {
    @EJB
    private IMember memberI;
    private Member member = new Member();

    public Member getMember() {
        return member;
    }

    public void setIntegrante(Member member) {
        this.member = member;
    }

    public List<Member> allMembers() {
        return this.memberI.allMembers();
    }

    public String save() {
        this.member.setBirthday(LocalDate.now());
        this.memberI.saveMember(member);
        member = new Member();
        return null;
    }

    public String update() {
        this.memberI.updateMember(member);
        this.member = new Member();
        return null;
    }

    public String delete() {
        this.memberI.deleteMember(member.getId());
        return null;
    }
}
