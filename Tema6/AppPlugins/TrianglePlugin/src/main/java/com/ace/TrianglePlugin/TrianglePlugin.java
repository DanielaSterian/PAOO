package com.ace.TrianglePlugin;

import com.ace.PluginsApplication.Interfaces.IPluginsAppPlugin;
import com.ace.PluginsApplication.Interfaces.IShape;

public class TrianglePlugin implements IPluginsAppPlugin 
{
    public String getUniqueNameText() {
        return "TrianglePlugin";
    }

    public String getDisplayText() {
        return "Triangle";
    }

    public IShape getShape() {
        return new Triangle();
    }
}
