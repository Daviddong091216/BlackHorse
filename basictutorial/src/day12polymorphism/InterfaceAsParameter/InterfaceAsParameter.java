package day12polymorphism.InterfaceAsParameter;

import java.util.ArrayList;
import java.util.List;

public class InterfaceAsParameter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }

    public static List<String> addNames(List<String> list) {
        list.add("NiCole");
        list.add("Lianor");
        list.add("Ethan");
        list.add("Damian");
        list.add("Miley");
        list.add("aaron");
        return list;
    }


}
