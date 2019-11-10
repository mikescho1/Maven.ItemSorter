package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
private Item [] items;


    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator id) {
        Arrays.sort(items, new IdComparator());
        return items;
    }

















//        ArrayList<Item> item = new ArrayList<Item>(Arrays.asList(items));
//        Collections.sort(item, new IdComparator());
//        return item.toArray(new Item[item.size()]);




}

