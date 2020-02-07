// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.


import java.util.Scanner;
import java.util.ArrayList;

public class Lab12avst
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
    ArrayList<String> familyResponses = new ArrayList<String>();
		familyResponses.add("Don't talk.");
		familyResponses.add("Yea my brother is like that too.");
		familyResponses.add("My father loves golf.");
		familyResponses.add("No, my sister does that.");
		familyResponses.add("Tell me less about your family.");
		familyResponses.add("Family this, family that... Shut up.");
		familyResponses.add("That's actually really cool, me too!");
		familyResponses.add("Exactly! Yea.");
		familyResponses.add("What about your mother?");
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("family") >= 0
				|| statement.indexOf("parent") >= 0)
		{
			double random = Math.random();
			int whichResponse = (int)(random * familyResponses.size());
			response = familyResponses.get(whichResponse);
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
    String[] responseList = {"Interesting. tell me more.", "Hmmm.", "Do you really think so?", "You don't say.", "I beg to differ.", "Literally shut up.", "Yay!", "Makes sense.", "How's the weather?", "Yea... I don't care."};
		final int NUMBER_OF_RESPONSES = responseList.length;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

    response = responseList[whichResponse];
    return response;
		/*if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}*/

	}//
}
