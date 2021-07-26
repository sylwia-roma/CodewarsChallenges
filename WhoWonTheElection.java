package WhoWonTheElection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//In democracy we have a lot of elections. For example, we have to vote for a class representative in school, for a new parliament or a new government.
//
//        Usually, we vote for a candidate, i.e. a set of eligible candidates is given. This is done by casting a ballot into a ballot-box. After that, it must be counted how many ballots (= votes) a candidate got.
//
//        A candidate will win this election if he has the absolute majority.
//
//        Your Task
//
//        Return the name of the winner. If there is no winner, return null (in Java and JavaScript), None (in Python) or nil (in Ruby).
//        Task Description
//
//        There are no given candidates. An elector can vote for anyone. Each ballot contains only one name and represents one vote for this name. A name is an arbitrary string, e.g. "A", "B", or "XJDHD".
//
//        There are no spoiled ballots.
//
//        The ballot-box is represented by an unsorted list of names. Each entry in the list corresponds to one vote for this name. You do not know the names in advance (because there are no candidates).
//
//        A name wins the election if it gets more than n/2 votes (n = number of all votes, i.e. n is equal to the size of the given list).
//        Examples
//
////3 votes for "A", 2 votes for "B" -> "A" wins the election
//        BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B")).equals("A") //true
////2 votes for "A", 2 votes for "B" -> No winner
//        BallotsCounter.getWinner(Arrays.asList("A", "A", "B", "B")) == null //true
////1 vote for each name -> No winner
//        BallotsCounter.getWinner(Arrays.asList("A", "B", "C", "D")) == null //true
////3 votes for "A", 2 votes for "B", 1 vote for "C"
////-> No winner ("A" does not have more than n/2 = 3 votes)
//        BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "C")) == null //true

import java.util.*;

public class WhoWonTheElection {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("A");
        System.out.println(getWinner(list));


    }

    public static String getWinner(final List<String> listOfBallots) {

        HashSet<String> unique = new HashSet<String>(listOfBallots);
        for (String n : unique) {
            if (Collections.frequency(listOfBallots, n) > listOfBallots.size()/2) return n;
        }
        return null;


    }
}
