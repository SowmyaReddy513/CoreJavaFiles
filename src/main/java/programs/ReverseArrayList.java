package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseArrayList {

        //Collections.reverse() method is a part of the java.util.Collections class in Java.
        //It is a utility method that is used to reverse the order of elements in a specified List.
        public ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
            // Use Collections.reverse() to reverse the ArrayList
            Collections.reverse(list);
            return list;
        }
}

