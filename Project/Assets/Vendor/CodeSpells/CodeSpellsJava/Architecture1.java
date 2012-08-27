import june.*;
import java.util.*;
      
public class Architecture1 extends Spell
{
    public void cast()
    { 
        Enchanted end = getByName("Area 1");
        Enchanted start = getByName("Area 2");

        Enchanted rock_area = getByName("Area 3");
    rock_area.grow(10);
        
        EnchantedList list = rock_area.findWithin();

        Direction direction = Direction.between(start,end);

        Location last = start.getLocation();
        
        for(Enchanted e : list)
        {
            last.add(direction);
            e.setLocation(last);
            last = e.getLocation();
        }

    }
}
