package br.edu.ifpb.dac.sessionBeans.manager;

import br.edu.ifpb.dac.sessionBeans.interfaces.IMember;
import br.edu.ifpb.dac.sessionBeans.model.Member;

import java.util.List;

public class ManagerMember implements IMember {

    @Override
    public boolean saveMember(Member member) {
        return false;
    }

    @Override
    public boolean deleteMember(int id) {
        return false;
    }

    @Override
    public boolean updateMember(Member member) {
        return false;
    }

    @Override
    public List<Member> allMembers() {
        return null;
    }
}
