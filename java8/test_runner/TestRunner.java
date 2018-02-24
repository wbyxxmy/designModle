package test_runner;

import lambda.chapter4.*;
import lambda.chapter5.*;
import solution.Solution;
import solution.SolutionFactory;


/**
 * Created by xinjian.ye on 2017/12/15.
 */
public class TestRunner {
    public static void main(String[] args) {
        Solution solution = null;
        try {
            solution = SolutionFactory.createSolution(Example5_6.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        solution.excuteTest();
    }
}