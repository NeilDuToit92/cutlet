/*
 * Copyright (C) 2017 rudolf.muehlbauer@gmail.com
 */

package com.cutlet.lib.testing;

import com.cutlet.lib.model.Dimension;
import com.cutlet.lib.model.Panel;
import com.cutlet.lib.model.Project;
import com.cutlet.lib.model.StockSheet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rmuehlba
 */
public class Data1 extends AbstractTestData {

    @Override
    public Project getData() {
        StockSheet sheet = makeSheet(800, 600);

        final boolean canRotate = false;
        List<Panel> inputs = new ArrayList<>();
        inputs.add(new Panel(sheet, new Dimension(100, 100), "p1", canRotate));
        inputs.add(new Panel(sheet, new Dimension(200, 250), "p2", canRotate));
        inputs.add(new Panel(sheet, new Dimension(200, 250), "p3", canRotate));
        inputs.add(new Panel(sheet, new Dimension(300, 250), "p4", canRotate));
        inputs.add(new Panel(sheet, new Dimension(50, 250), "p4", canRotate));
        inputs.add(new Panel(sheet, new Dimension(15, 13), "p5", canRotate));
        inputs.add(new Panel(sheet, new Dimension(15, 13), "p6", canRotate));

        return makeProject(inputs, 1);
    }

    @Override
    public String getTitle() {
        return "Data1";
    }

}
