package com.ace.CirclePlugin;

import com.ace.PluginsApplication.Interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

public class Circle implements IShape
{
	private int radius;
	private int x;
	private int y;
	private static ArrayList<IShape> list = new ArrayList<IShape>();
	
	public void read()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Center point:");

		System.out.print("x = ");
		x = scan.nextInt();

		System.out.print("y = ");
		y = scan.nextInt();

		System.out.print("Radius: ");
		radius = scan.nextInt();
	}

	public void draw()
	{
		for (int i = 0; i <= x + radius; i++)
		{
			for (int j = 1; j <= y + radius; j++)
			{
				int xSquared = (i - x) * (i - x);
				int ySquared = (j - y) * (j - y);
				if (Math.abs(xSquared + ySquared - radius * radius) < radius)
				{
					System.out.print("o");
				} else
				{
					System.out.print(" ");
				}
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
			System.out.println("There are no circles to draw.");
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