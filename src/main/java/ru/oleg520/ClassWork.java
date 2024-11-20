package ru.oleg520;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("nums = " + nums);
        System.out.println("Lists.reverse(nums) = " + Lists.reverse(nums));

        String str = "Trying to get characters list of this string";
        System.out.println("Lists.charactersOf(str) = " + Lists.charactersOf(str));

        System.out.println("Lists.partition(nums, 2) = " + Lists.partition(nums, 2));

        System.out.println("=".repeat(155));

        System.out.println(Sets.newHashSet(Lists.charactersOf(str)));

        List<Integer> numbers = new ArrayList<>(List.of(11,22,33,44,1,2,3,4,55));
        Sets.SetView<Object> unioned = Sets.union(Set.copyOf(numbers), Set.copyOf(nums));
        System.out.println("Объединение коллекций: " + unioned);

        Sets.SetView<Object> intersection = Sets.intersection(Set.copyOf(numbers), Set.copyOf(nums));
        System.out.println("Пересечения коллекций: " + intersection);

        Sets.SetView<Object> difference = Sets.difference(Set.copyOf(numbers), Set.copyOf(nums));
        System.out.println("Непересекающиеся элементы коллекций:" + difference);
    }
}