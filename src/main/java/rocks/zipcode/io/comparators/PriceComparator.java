package rocks.zipcode.io.comparators;

import com.sun.deploy.security.SelectableSecurityManager;
import rocks.zipcode.io.Item;

import java.util.Comparator;


/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {


    public int compare(Item o1, Item o2) {
      if((o1.getPrice() - o2.getPrice()) < 0)    {
    return -1;
        }   else if(((o1.getPrice() - o2.getPrice()) == 0)) {
            return 0;
        }   else    {
            return 1;
        }
    }
}

