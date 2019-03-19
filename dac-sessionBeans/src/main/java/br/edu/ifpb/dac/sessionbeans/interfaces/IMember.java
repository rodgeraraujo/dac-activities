package br.edu.ifpb.dac.sessionBeans.interfaces;

import br.edu.ifpb.dac.sessionBeans.model.Member;

import java.util.List;

public interface IMember {

    boolean saveMember (Member member);
    boolean deleteMember (int id);
    boolean updateMember (Member member);
    List<Member> allMembers();

}
