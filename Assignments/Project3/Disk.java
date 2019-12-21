public class Disk extends MusicMedia
{
    public Disk (String title, String artist, String sku)
    {
        super(title, artist, sku);
    }
    
    public String getMediaType()
    {
        return "Disk";
    }
}