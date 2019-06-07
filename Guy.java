public final class Guy 
{
    private double width;
    private double height;
    private double x;
    private double y;
   
    public Guy(double width, double height, double x, double y)
    {
    	if (height <= 0 || width <= 0)
    	{
    		throw new IllegalArgumentException("Height/Width should not be negative/Zero !");
    	}
    	this.width = width;
    	this.height = height;
    	this.x = x;
    	this.y = y;
    }
     public double getWidth() 
     {
        return this.width;
    }

    public double getHeight()
    {
        return this.height;
    }
    
    public double getX() 
    {
        return this.x;
    }
    
    public double getY() 
    {
        return this.y;
    }
}
