package com.ace.SquarePlugin;

import com.ace.PluginsApplication.Interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

public class Square implements IShape
{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private static ArrayList<IShape> list = new ArrayList<IShape>();

	public void read()
	{
		Scanner scan = new Scanner(System.in);
		do
		{
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
			if (Math.abs(x1 - x2) != Math.abs(y1 - y2))
			{
				System.out.println("The given points can't form a square. Try again.");
			}

		} while (Math.abs(x1 - x2) != Math.abs(y1 - y2));

	}

	public void draw()
	{
		double diagonal = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		int latura = (int) Math.round((diagonal / Math.sqrt(2)));

		char canvas[][] = new char[latura][latura];

		for (int i = 0; i < latura; i++)
		{
			for (int j = 0; j < latura; j++)
			{
				if (i == 0 || j == 0 || i == latura - 1 || j == latura - 1)
				{
					canvas[i][j] = '#';
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
			System.out.println("There are no squares to draw.");
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
