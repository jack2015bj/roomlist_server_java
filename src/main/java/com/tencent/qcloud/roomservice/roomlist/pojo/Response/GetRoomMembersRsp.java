package com.tencent.qcloud.roomservice.roomlist.pojo.Response;

import com.tencent.qcloud.roomservice.roomlist.pojo.Member;

import java.util.ArrayList;

public class GetRoomMembersRsp extends BaseRsp {
    private ArrayList<Member> members = new ArrayList<>();

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
