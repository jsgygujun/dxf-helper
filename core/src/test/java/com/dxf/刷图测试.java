package com.dxf;

import com.dxf.model.坐标;
import com.dxf.util.DXF;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class 刷图测试 {

    private DXF dxf;


    @Before
    public void setUp() {
        dxf = new DXF();
        dxf.setUp();
        基础功能.开启无视地图障碍(dxf.getHwnd());
    }

    @After
    public void cleanUp() {
        基础功能.关闭无视地图障碍(dxf.getHwnd());
        dxf.cleanUp();
    }

    @Test
    public void 刷图测试() throws Exception {
        地图信息 map = new 地图信息(dxf);
        人物角色 player = new 人物角色(dxf);
        player.测试移动速度();
        房间信息 room = new 房间信息(dxf);
        List<坐标> 怪物列表 = room.取怪物列表();
        if (怪物列表.isEmpty()) {
            System.out.println("怪物已经被清理完毕");
            坐标 pos = room.取当前房间坐标();
            方向 dir = map.取过图方向(pos);
            System.out.println("过图方向： " + dir);
            坐标 door = room.取过图门坐标(dir);
            player.移动到(door);
        } else {

        }
    }

}
