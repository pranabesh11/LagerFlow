package user_microservice.demo.controller;

import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        //Find all even numbers from a list using Streams.
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = nums.stream().filter(item -> item%2==0).toList();
        System.out.println("even numbers are "+evens);

        // Find all odd numbers from a list using Streams.
        List<Integer> allnums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> odds = allnums.stream().filter(item-> item%2!=0).toList();
        System.out.println("odd numbers are "+odds);

        //Find numbers greater than 50 from a list.
        List<Integer> findNumbersGreaterThan50 = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
        List<Integer> fondNumbers = findNumbersGreaterThan50.stream().filter(item->item>50).toList();
        System.out.println("Greater than 50 numbers are "+fondNumbers);

        //Find the maximum number from a list.
        List<Integer> findTheMaximumNumber = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
        int maxNum = findTheMaximumNumber.stream().max(Integer::compare).get();
        System.out.println("this is max num "+maxNum);

        //Find the minimum number from a list.
        List<Integer> findTheMinimumNumber = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
        int minNum = findTheMinimumNumber.stream().min(Integer::compare).get();
        System.out.println("Minimum number is "+minNum);

        //Find the sum of all numbers using Streams.
        List<Integer> sumOfAllNumbers = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
        int sumOfAllNums = sumOfAllNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOfAllNums);

        //Find the average of numbers using Streams.
        List<Integer> avgOfAllNumbers = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
        double avgOfAllNums = avgOfAllNumbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("average of all numbers "+avgOfAllNums);

        //Find duplicate elements in a list.
        List<Integer> duplicateElements = new ArrayList<>(List.of(10,10,20,20,30,40,50,60,70,80,90));
        Set<Integer> duplicateElms = duplicateElements.stream().filter(n-> Collections.frequency(duplicateElements,n)>1).collect(Collectors.toSet());
        System.out.println("Duplicate elements are "+duplicateElms);

        //Find unique elements in a list.
        List<Integer> uniqueElements = new ArrayList<>(List.of(10,10,20,20,30,40));
        Set<Integer> uniqueNums = uniqueElements.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet()
                .stream().filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("Unique values are"+uniqueNums);

        //Count the number of elements in a list.
        List<Integer> allNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        long count = allNumbers.stream().count();
        System.out.println(count);

        //Find the first element of a list using Streams.
        List<Integer> findFirst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int firstElem = findFirst.stream().findFirst().orElse(null);
        System.out.println(firstElem);

        //Find the second-highest number from a list.
        List<Integer> secondHighest = new ArrayList<>(List.of(10,10,20,20,30,40));
        int secondHigh = secondHighest.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Second highest number is "+secondHigh);


        //Find the second-lowest number from a list.
        List<Integer> secondLowest = new ArrayList<>(List.of(10,10,20,20,30,40));
        int secondLow = secondLowest.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Second highest num "+secondLow);

        //Find the top 3 highest numbers.
        List<Integer> top3highest = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> top3 = top3highest.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Top 3 elements are "+ top3);

        // Find the top 3 lowest numbers.
        List<Integer> top3lowest = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> low3 = top3highest.stream().distinct().sorted(Comparator.naturalOrder()).limit(3).toList();
        System.out.println("Top 3 elements are "+ low3);
    }
}
