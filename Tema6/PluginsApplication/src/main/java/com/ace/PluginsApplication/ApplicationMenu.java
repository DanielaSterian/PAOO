package com.ace.PluginsApplication;

import com.ace.PluginsApplication.Interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMenu
{
	private PluginManager pluginMan;
    private Menu mainMenu = null;
    
    public ApplicationMenu(PluginManager pluginMan)
    {
        this.pluginMan = pluginMan;
    }
    
    public void load()
    {
        pluginMan.loadPlugins("/plugins");
        ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>();
        ArrayList<IMenuItem> addMenuItems = new ArrayList<IMenuItem>();
        ArrayList<IMenuItem> removeMenuItems = new ArrayList<IMenuItem>();
        ArrayList<IMenuItem> drawMenuItems = new ArrayList<IMenuItem>();
        ArrayList<IMenuItem> modifyMenuItems = new ArrayList<IMenuItem>();
        
        int shortCut = 1;
        int i = 0;
        var plugins = pluginMan.getPlugins();
        
        do
        {      
           var currentPlugin = plugins.get(i); 
           MenuItem addShape = new MenuItem(plugins.get(i).getDisplayText(), shortCut, (parameters)->{
               IShape shape = currentPlugin.getShape();
               shape.read();
               shape.addShape();
           });
           addMenuItems.add(addShape);
           
           MenuItem removeShape = new MenuItem(plugins.get(i).getDisplayText(), shortCut, (parameters)->{
        	   Scanner scan = new Scanner(System.in);
               IShape shape = currentPlugin.getShape();
               System.out.print("Index: ");             
               shape.removeShape(scan.nextInt());
           });          
           removeMenuItems.add(removeShape);
           
           MenuItem drawShape = new MenuItem(plugins.get(i).getDisplayText(), shortCut, (parameters)->{
               IShape shape = currentPlugin.getShape();             
               shape.drawBoard();
           });
           drawMenuItems.add(drawShape);
           
           MenuItem modifyShape = new MenuItem(plugins.get(i).getDisplayText(), shortCut, (parameters)->{
        	   Scanner scan = new Scanner(System.in);
               IShape shape = currentPlugin.getShape();
               System.out.print("Index: ");
               shape.modify(scan.nextInt());
           });
           modifyMenuItems.add(modifyShape);
           
           shortCut++;
           i++;
        }while(i < plugins.size());
        
        mainMenuItems.add(new Menu("Add", 1, addMenuItems));
        mainMenuItems.add(new Menu("Remove", 2, removeMenuItems));
        mainMenuItems.add(new Menu("Draw", 3, drawMenuItems));
        mainMenuItems.add(new Menu("Modify", 4, modifyMenuItems));
        
        mainMenu = new Menu("Main Menu", -1, mainMenuItems);
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
}
