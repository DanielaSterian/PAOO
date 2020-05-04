package com.ace.CirclePlugin;

import com.ace.PluginsApplication.Interfaces.IPluginsAppPlugin;
import com.ace.PluginsApplication.Interfaces.IShape;

public class CirclePlugin implements IPluginsAppPlugin 
{
    public String getUniqueNameText() {
        return "CirclePlugin";
    }

    public String getDisplayText() {
        return "Circle";
    }

    public IShape getShape() {
        return new Circle();
    }
}
