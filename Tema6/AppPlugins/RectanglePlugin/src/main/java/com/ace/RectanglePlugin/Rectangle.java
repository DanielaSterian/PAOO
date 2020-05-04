package com.ace.RectanglePlugin;

import java.util.ArrayList;
import java.util.Scanner;

import com.ace.PluginsApplication.Interfaces.IShape;

public class Rectangle implements IShape
{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
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
	}
	
	public void draw()
	{
		int lungime = Math.abs(x2 - x1);
		int latime = Math.abs(y2 - y1);
		char canvas[][] = new char[lungime][latime];
		
		for (int i = 0; i < lungime; i++)
		{
			for (int j = 0; j < latime; j++)
			{
				if (i == 0 || j == 0 || i == lungime - 1 || j == latime - 1)
				{
					canvas[i][j] = '=';
				} else
				{
					canvas[i][j] = ' ';
				}
				System.out.print(canvas[i][j] + " ");

			}
			System.out.println();
		}
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
			System.out.println("There are no rectangles to draw.");
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
