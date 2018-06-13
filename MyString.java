import java.util.*;
		public class MyString
		{
		    private String helloWorld; 
		    private char[ ] obj1;
		    
		    public MyString(String start)
		    {
		        helloWorld = new String(start);
		        obj1 = start.toCharArray( );
		    }
		    
		    public MyString(char[ ] inSequence)
		    {
		        helloWorld = new String(inSequence);
		        this.obj1 = new char[inSequence.length];
		        for(int k= 0; k < obj1.length; k++)
		        {
		            this.obj1[k] = inSequence[k];
		        }
		    }
		    
		    public MyString(MyString newest)
		    {
		    	helloWorld = newest.toString(); 
		    	
		    	obj1 = newest.toString().toCharArray(); 
		    }
		    
		    public char charAt(int index)
		    {
		        char result;
		        result = '\u0000';
		        return result;
		    }
		    
		    public int compareTo(MyString anotherMyString)
		    {
				return -1;
		    }
		    
		    public int compareToIgnoreCase(MyString anotherMyString)
		    {
				return -1;
		    }
		    
		    public MyString concat(MyString str)
		    {
				return null;
		    }
		    
		    public boolean endsWith(MyString suffix)
		    {
				return false;
		    }
		    
		    public boolean equals(MyString anotherMyString)
		    {
				return false;
		    }
		    
		    public boolean equalsIgnoreCase(MyString anotherMyString)
		    {
				return false;
		    }
		    
		    public int indexOf(char findMe)
		    {
		        return -1;
		    }
		    
		    public int indexOf(char ch,  int fromIndex)
		    {
				return -1;
		    }
		    
		    public int lastIndexOf(char ch)
		    {
				return -1;
		    }
		    
		    public int length( )
		    {
				return -1;
		    }
		    
		    public MyString replace(char oldChar, char newChar)
		    {
				return null;
		    }
		    
		    public boolean startsWithString(MyString prefix)
		    {
				return false;
		    }
		    
		    public MyString substring(int beginIndex)
		    {
				return null;
		    }
		    
		    public MyString substring(int beginIndex, int endIndex)
		    {
				return null;
		    }
		    
		    public MyString toLowerCase( )
		    {
				return null;
		    }
		    
		    public MyString toUpperCase(MyString pIn)
		    {
		        return null;
		    }
		    
		    public String toString( )
		    {
		        return new String(obj1);
		    }
		    
		    //Extra credit methods
		    
		    public MyString replaceAll(MyString str, MyString replacement)
		    {
				return null;
		    }
		    
		    public int indexOf(MyString str)
		    {
				return -1;
		    }
		    
		    public int indexOf(MyString str, int fromIndex)
		    {
				return -1;
		    }
		    
		    public boolean contains(MyString s)
		    {
				return false;
		    }
		    
		}
