package com.ace.PluginsApplication;

public class PluginApp
{
    public static void main(String[] args)
    {
    	PluginManager pluginMan = new PluginManager();
        
        ApplicationMenu menu = new ApplicationMenu(pluginMan);
        menu.load();
        menu.execute();
    }
}
