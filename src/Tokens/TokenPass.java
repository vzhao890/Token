package Tokens;

public class TokenPass
{
    static int [] arr;
    static int position;

    public TokenPass(int playerCount)
    {
       arr = new int[playerCount];
       for(int i=0;i<arr.length-1;i++)
       {
           arr[i]=(int)(Math.random()*10)+1;
       }
       position= (int)(Math.random()*playerCount)+1;
    }
    public void printBoard()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void distributeCurrentPlayerToken()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            arr[position]= arr[position]-1;
            arr[position+1]= arr[position+1]+1;
        }
    }
    public static void nextPlayer()
    {
        if(position=<arr.length-1)
        {
            position+=1;
        }
        else if(position>arr.length-1)
        {
            position=0;
        }
    }
    public int gameOver()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                return 1;
            }
        }
        return -1;
    }


}
