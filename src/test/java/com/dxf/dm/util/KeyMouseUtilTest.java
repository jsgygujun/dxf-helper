package com.dxf.dm.util;

import com.dxf.dm.exception.DmOptException;
import com.dxf.dm.model.Coordinate2D;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author GuJun
 * @date 2020/9/21
 */
public class KeyMouseUtilTest {

    @Test
    public void get_cursor_pos() throws DmOptException {
        Coordinate2D pos = KeyMouseUtil.getCursorPos();
        System.out.println(pos);
    }

}