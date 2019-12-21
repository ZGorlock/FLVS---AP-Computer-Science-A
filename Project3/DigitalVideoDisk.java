public class DigitalVideoDisk extends Disk
{
    public DigitalVideoDisk (String title, String artist, String sku)
    {
        super(title, artist, sku);
    }
    
    public String getMediaType()
    {
        return "DVD";
    }
}