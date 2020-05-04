package com.ace.SquarePlugin;

import com.ace.PluginsApplication.Interfaces.IPluginsAppPlugin;
import com.ace.PluginsApplication.Interfaces.IShape;

public class SquarePlugin implements IPluginsAppPlugin 
{
    public String getUniqueNameText() {
        return "SquarePlugin";
    }

    public String getDisplayText() {
        return "Square";
    }

    public IShape getShape() {
        return new Square();
    }
}
