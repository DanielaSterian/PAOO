package com.ace.TrianglePlugin;

import java.util.ArrayList;
import java.util.Scanner;

import com.ace.PluginsApplication.Interfaces.IShape;

public class Triangle implements IShape
{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int x3;
	private int y3;
	private static ArrayList<IShape> list = new ArrayList<IShape>();
	
	public void read()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("First point:");

		System.out.print("x = ");
		x1 = scan.nextInt();

		System.out.print("y = ");
		y1 = scan.nextInt();

		System.out.println("Second point:");

		System.out.print("x = ");
		x2 = scan.nextInt();

		System.out.print("y = ");
		y2 = scan.nextInt();
		
		System.out.println("Third point:");

		System.out.print("x = ");
		x3 = scan.nextInt();

		System.out.print("y = ");
		y3 = scan.nextInt();	
	}
	
	public void draw()
	{
		System.out.println("TRIANGLE");
	}
	
	public void modify(int index)
	{
		if(index >= list.size() || index < 0)
		{
			System.out.println("Index out of bounds.");
		}
		else
		{
			list.get(index).read();
		}
	}

	public void addShape()
	{
		list.add(this);
	}

	public void removeShape(int index)
	{
		if(index >= list.size() || index < 0)
		{
			System.out.println("Index out of bounds.");
		}
		else
		{
			list.remove(index);
		}
	}
	
	public void drawBoard()
	{
		if(list.isEmpty())
		{
			System.out.println("There are no triangles to draw.");
		}
		else
		{
			for(IShape shape : list)
			{
				shape.draw();
			}
		}
	}
}
