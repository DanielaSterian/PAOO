package com.ace.RectanglePlugin;

import com.ace.PluginsApplication.Interfaces.IPluginsAppPlugin;
import com.ace.PluginsApplication.Interfaces.IShape;

public class RectanglePlugin implements IPluginsAppPlugin 
{
    public String getUniqueNameText() {
        return "RectanglePlugin";
    }

    public String getDisplayText() {
        return "Rectangle";
    }

    public IShape getShape() {
        return new Rectangle();
    }
}
