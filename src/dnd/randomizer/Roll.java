package dnd.randomizer;


import java.util.Random;

public class Roll
{
	private String seed = "";
	private String result;
    private Random random = new Random();
    private int stored;

    public int d100()
    {
        result = String.valueOf(random.nextInt(100));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d20()
    {
        result = String.valueOf(random.nextInt(20));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d12()
    {
        result = String.valueOf(random.nextInt(12));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d10()
    {
        result = String.valueOf(random.nextInt(10));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d8()
    {
        result = String.valueOf(random.nextInt(8));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d6()
    {
        result = String.valueOf(random.nextInt(6));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int d4()
    {
        result = String.valueOf(random.nextInt(4));
    	seed += (result.length() == 1) ? "0"+result : result;
        return Integer.valueOf(result);
    }

    public int storedRoll()
    {
    	stored = Integer.valueOf(result);
        return stored;
    }
    
    public String getSeed() {
    	return seed;
    }
}
