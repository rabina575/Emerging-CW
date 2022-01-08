/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emerging_cw;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class BinarySearch {
    /*
     * An arrayList - instrumentList, a String - target and sortBy of type SortBy is passed in the parameter.
     * The target value is search in a sorted arrayList.
     * If the target is found it is returned with the type MusicalInstrument.
    */

    public static MusicalInstrument binarySearch(ArrayList<MusicalInstrument> list, String target, SortBy sortBy) {
        int right = list.size() - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortBy == sortBy.CATEGORY) {
                if (list.get(mid).getInstrumentName().equals(target)) {
                    return list.get(mid);
                } else if (list.get(mid).getInstrumentName().compareTo(target) > 0) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            } else {
                if (String.valueOf(list.get(mid).getPrice()).equals(target)) {
                    return list.get(mid);
                } else if (String.valueOf(list.get(mid).getPrice()).compareTo(target) > 0) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
        }
        return null;
    }
}
